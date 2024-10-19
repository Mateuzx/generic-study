package lambda.hof

fun main() {
    // TODO Colocar em outro projeto separado do GenericTime
    val soma = operacao("+")
    println(soma(3, 4)) // 7

    val multiplicacao = operacao("*")
    println(multiplicacao(3, 4)) // 12
}

fun operacao(operador: String): (Int, Int) -> Int {
    return when (operador) {
        "+" -> { a, b -> a + b }
        "-" -> { a, b -> a - b }
        "*" -> { a, b -> a * b }
        "/" -> { a, b -> a / b }
        else -> throw IllegalArgumentException("Operador desconhecido")
    }
}

