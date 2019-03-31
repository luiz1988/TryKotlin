package br.eduifsp.scLsdm

fun main(args: Array<String>) {
    var numString: String = 10.toString()
    val numDouble: Double = numString.toDouble()
    val numFloat: Float = numDouble.toFloat()
    val numInteiro: Int = numFloat.toInt()

    println(numInteiro.toString())

    // Cast AS
    val any: Any = "Any equivale a Object em Java"
    //val string: String = any as String
    if (any is String) {
        println("${any}: é uma String")
    }

}