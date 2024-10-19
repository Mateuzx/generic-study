package basic

class GenericWildCard {

    // Função para imprimir elementos de um array de qualquer tipo
    fun printArray(array: Array<*>) {
        array.forEach { println(it) }
    }

    // Função para retornar os elementos de um array de qualquer tipo como uma lista
    fun getArrayAsList(array: Array<*>): List<Any?> {
        return array.toList()
    }

}
