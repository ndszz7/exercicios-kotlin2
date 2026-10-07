fun main() {
    val ajustarValor: (Double?) -> Double = {
        if (it == null || it < 0) 0.0 else it
    }

    println(ajustarValor(null))
    println(ajustarValor(-5.0))
    println(ajustarValor(25.5))
}
