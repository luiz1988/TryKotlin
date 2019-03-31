package br.eduifsp.scLsdm

fun multiplica(vararg numeros: Double): Double {
    if (numeros.size ==0) {
        return 0.0
    }

    var resultado: Double = 1.0

    for (numero in numeros) {
        resultado *= numero
    }
    return resultado
}

fun main(args: Array<String>) {
    println(multiplica(1.0, 2.0, 3.5, 4.0, 6.2))

    // Vararg com spread operator
    val listaParametros: List<Double> = listOf(1.0, 2.0, 3.5, 4.0, 6.2)
    println(multiplica(*listaParametros.toDoubleArray()))
}