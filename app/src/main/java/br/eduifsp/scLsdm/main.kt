package br.eduifsp.scLsdm

// args: Array<String> deixou de ser obrigatório na versão 1.3
fun main(args: Array<String>) {
    // Declaração de variável MUTÁVEL
    val frase: String

    frase = "Hello, IFSP"
    // Imprime a variável na tela
    println(frase)

    // Imprimindo String Template
    println("$frase")
    println("${frase}")

    // Com chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    // Com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")
}