import jogadores.JogadorDeFutebol
import jogadores.SessaoDeTreinamento

fun main() {
    val sessaoDeTreinamento = SessaoDeTreinamento()

    val jogadorDeFutebol = JogadorDeFutebol("Romario")

    var contador = 1
    while(contador <=3){
        sessaoDeTreinamento.treinarA(jogadorDeFutebol)
        contador += 1
    }
}