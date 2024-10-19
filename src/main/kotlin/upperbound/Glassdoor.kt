package upperbound

object Glassdoor {

    fun users(profiles: List<out Professional>){
        profiles.forEach { element ->
            println(element)
        }
    }
}