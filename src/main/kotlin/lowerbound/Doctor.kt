package lowerbound

class Doctor(private val age: Int) : Professional {
    override fun age() = println(age)

    override fun talk() = println("Determined, but sleepy")

    override fun emotion() = println("Hopeful")
}
