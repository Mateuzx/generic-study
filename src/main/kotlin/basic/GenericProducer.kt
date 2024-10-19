package basic

data class GenericProducer<out T>(private val value: T){
    fun get(): T{
        return value
    }
}
