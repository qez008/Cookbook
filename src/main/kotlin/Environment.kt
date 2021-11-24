import gen.CraftParser

const val undefined = "undefined"

class Environment(defs: CraftParser.DefsContext) {

    val lists: MutableMap<String, List<String>> = mutableMapOf()
    val grids: MutableMap<String, List<List<String>>> = mutableMapOf()
    val ingredients: MutableSet<String> = mutableSetOf()

    init {
        for (entry in defs.def()) {
            val id = entry.ID().toString()
            when (val res = entry.recipe().grid() ?: entry.recipe().list()) {
                is CraftParser.ListContext -> lists[id] = readRow(res.row()).sorted()
                is CraftParser.GridContext -> grids[id] = readRows(res.rows())
            }
        }

        // add all ingredients
        ingredients += lists.values.flatten()
        ingredients += grids.values.map { it.flatten() }.flatten()
    }


    private fun readRows(rows: CraftParser.RowsContext?): List<List<String>> {
        val items = mutableListOf<List<String>>()
        var current = rows
        while (current != null) {
            items += readRow(current.row())
            current = current.rows()
        }
        return items
    }

    private fun readRow(row: CraftParser.RowContext?): List<String> =
        row?.let {
            it.item().map { item -> item.ID().toString() }
        } ?: emptyList()
}

