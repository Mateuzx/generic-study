package reified

fun main() {

    println(stringValidation<String>(listOf("oi")))

}

inline fun <reified T> stringValidation(itens: List<*>): Boolean {
    return itens.all { it is T }
}



