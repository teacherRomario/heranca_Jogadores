package jogadores

class JogadorDeFutebol(
    val nome: String,
    var energia: Int = 0,
    var alegria: Int = 0,
    var gols: Int = 0,
    var experiencia: Int = 0
) {

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols ++
        println("GOOOOL do(a) $nome")
    }

    fun correr(){
        energia -= 10
        println("Cansei =(, jogador: $nome")
    }

    fun status(){
        println("""
            Jogador: $nome
            Energia: $energia
            Alegria: $alegria
            Gols: $gols
            Experiencia: $experiencia
        """.trimIndent())
    }

}