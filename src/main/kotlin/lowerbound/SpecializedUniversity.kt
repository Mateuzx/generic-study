package lowerbound

class SpecializedUniversity: University<Professional> {
    override fun classroom(profession: Professional) {
        println("teaching... $profession")
    }
}
