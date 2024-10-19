package upperbound

data class Programmer(val age: Int) : Professional {
    override fun age() = println(age)

    override fun talk() = println("I'm a programmer!")

    override fun emotion() = println("Happy, but sometimes stressed...")

}
