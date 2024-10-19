package basic

class GenericInvariance<T> (t: List<T>) {
    private var value = t

    // Retornando valor
    fun getBoxValue(): List<T> =
        value

}