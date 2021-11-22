import gen.CraftParser

const val undefined = "undefined"

data class Environment(
    val lists: MutableMap<String, List<String>> = mutableMapOf(),
    val blocks: MutableMap<String, List<List<String>>> = mutableMapOf()
) {
    constructor(defs: CraftParser.DefsContext) : this() {
        for (entry in defs.def()) {
            val id = entry.ID().toString()
            when (val res = entry.recipe().block() ?: entry.recipe().list()!!) {
                is CraftParser.ListContext -> lists[id] = readRow(res.row()).sorted()
                is CraftParser.BlockContext -> blocks[id] = readRows(res.rows())
            }
        }
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

