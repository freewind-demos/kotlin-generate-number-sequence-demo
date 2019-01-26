package example

fun main(args: Array<String>) {
    // generateSequence(1, Int::inc)
    val seq = generateSequence(1) { i -> i + 1 }
    println(seq.take(10).toList())
}
