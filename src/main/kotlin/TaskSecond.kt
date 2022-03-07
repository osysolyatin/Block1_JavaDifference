fun main() {
    val likes = 10
    val phraseEnds = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $phraseEnds")
}