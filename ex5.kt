fun avaliarMotorista(avaliacao: Int?): String {
    val nota = avaliacao ?: 0
    return when (nota) {
        5 -> "Excelente corrida!"
        4 -> "Boa corrida."
        1, 2, 3 -> "Precisamos melhorar."
        0 -> "Nenhuma avaliação fornecida."
        else -> "Nenhuma avaliação fornecida."
    }
}

fun main() {
    println(avaliarMotorista(5))
    println(avaliarMotorista(4))
    println(avaliarMotorista(2))
    println(avaliarMotorista(null))
}
