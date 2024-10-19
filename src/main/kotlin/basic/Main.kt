package basic

import basic.GenericConsumer
import basic.GenericInvariance
import basic.GenericProducer
import basic.GenericWildCard

fun main() {

    // Possiveis formas de instanciar uma classe generica
    val genericInvarianceShort = GenericInvariance(listOf(1))
    val genericInvarianceLong: GenericInvariance<Int> = GenericInvariance(listOf(1))

    //println(basicBoxLong.getBoxValue())

    val producer = GenericProducer("Color is blue")
    //println(producer.get())

    val consumer = GenericConsumer(1)
    //println(consumer.produceMessage())

    val wildCard = GenericWildCard()
    val array = arrayOf(1, "b", "c")
    wildCard.printArray(array)

}