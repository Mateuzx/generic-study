package basic

data class GenericConsumer<in T>(private val value: T) {

    fun produceMessage(): String = "Value of parameter $value"

}
