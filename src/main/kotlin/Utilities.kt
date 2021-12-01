
sealed class Either<out L, out R> {
    data class Left<L, R>(val value: L) : Either<L, R>()
    data class Right<L, R>(val value: R) : Either<L, R>()
}


// zips collections of same size
infix fun <T, S> Collection<T>.zzip(other: Collection<S>): List<Pair<T, S>> =
    if (this.size == other.size) this zip other
    else throw IllegalArgumentException(
        """
        zzip cannot zip collections of different sizes!
            this: $this
            other: $other
        """.trimIndent()
    )

// all function from collections with infix notation
inline infix fun <T> Iterable<T>.all(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return true
    for (element in this) if (!predicate(element)) return false
    return true
}

// any function from collections with infix notation
inline infix fun <T> Iterable<T>.any(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return false
    for (element in this) if (predicate(element)) return true
    return false
}
