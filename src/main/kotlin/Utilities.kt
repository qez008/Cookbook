
sealed class Either<out L, out R> {
    data class Left<L, R>(val value: L) : Either<L, R>()
    data class Right<L, R>(val value: R) : Either<L, R>()
}


// zips collections if they have the same size, otherwise returns null
infix fun <T, S> Collection<T>.zipOrNull(other: Collection<S>): List<Pair<T, S>>? =
    if (this.size == other.size) this zip other else null

fun zipError(): Nothing = error("zzip can't zip different length collections")


// all function from collections with infix notation
inline infix fun <T> Iterable<T>?.maybeAll(predicate: (T) -> Boolean): Boolean {

    if (this == null) return false
    if (this is Collection && isEmpty()) return true

    for (element in this) {
        if (!predicate(element)) return false
    }

    return true
}

