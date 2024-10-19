package lowerbound

fun main() {

    val mateus = Programmer(22)
    val house = Doctor(60)

    val programmerUniversity: University<Programmer> = SpecializedUniversity()
    programmerUniversity.classroom(mateus)

}
