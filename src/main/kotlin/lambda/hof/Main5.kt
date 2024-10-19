package lambda.hof
fun main() {
    // TODO Colocar em outro projeto separado do GenericTime
    val numeros = listOf(1, 2, 3, 4, 5)
    val duplicados = processarLista(numeros) { it * 2 }
    println(duplicados) // [2, 4, 6, 8, 10]
}

fun processarLista(lista: List<Int>, processo: (Int) -> Int): List<Int> {
    return lista.map(processo)
}
