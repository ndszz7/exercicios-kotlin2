fun verificarContas(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if ((email?.length ?: 0) == 0 || email?.isBlank() == true) {
            contasInvalidas++
            println("Conta inválida: será deletada")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    verificarContas(listOf("ana@email.com", null, "", "   ", "bia@email.com"))
}
