package heranca

abstract class Animal{
    var tamanho: Int = 0
    var cor: String = ""
    var peso: Double = 0.0


    //ta open pra poder ser sobrescrito
   open fun alteraTamanho(tamanho: Int) {
        if(tamanho > 3){
            print("Muito acima do normal")
        } else {
            this.tamanho = tamanho
        }
    }

    //ta open pra poder ser sobrescrito
    open fun correr(){
        println("Animal está correndo")
    }
}