class Carro constructor(val modelo: String, val marca: String, val ano: Int, var preco: Float){
    fun mostrarDados(){
        println("Modelo: $modelo\nMarca: $marca\nAno: $ano\nPreço: $preco Lulas")
    }
}