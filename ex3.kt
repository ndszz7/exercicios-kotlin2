fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0
    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Bio curta")
    validarBioInfantil(null)
    validarBioInfantil("Esta bio infantil tem mais de cinquenta caracteres e não será aceita pelo sistema")
}

