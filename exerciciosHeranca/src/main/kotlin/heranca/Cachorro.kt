package heranca

class Cachorro: Animal() {

    //Comportamento sobrescrito do pai
     override fun correr() {
         println( "Cachorro está correndo")
    }

    //Comportamento sobrescrito do pai
    override fun alteraTamanho(tamanho: Int) {
        if(tamanho > 2){
            print("Muito acima do normal")
        } else {
            this.tamanho = tamanho
        }
    }
}