// Função de extensão para List<T> que adiciona um elemento
fun <T> MutableList<T>.addElement(element: T) {
    this.add(element)
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.addElement(4)
    println(list)  // Output: [1, 2, 3, 4]
}
