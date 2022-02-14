import java.util.*

fun main(args: Array<String>) {
    println("Escolha uma opção: ")
    println("1 - Calcular media: ")
    println("2 - Verificar se é palíndroma: ")
    println("3 - Sair: ")
    
    var opcao = readLine()!!.toInt()
    if (opcao == 1) {
        print("Digite o primeiro número: ")
        var numero1 = readLine()!!.toInt()
        print("Digite o segundo número: ")
        var numero2 = readLine()!!.toInt()
        val media = (numero1 + numero2) / 2
        print(media)
    }
    else if(opcao==2){
    
    var input = Scanner(System.`in`)
    
    var palavra = input.next()
    
    var tam : Int = palavra.length-1

    var aux: Int = 0
    var msg: String = "é palindromo"


    while(aux < tam)
    {
        if(palavra[aux] != palavra[tam-aux])
        {
            msg = "errou"
            break
        }
        aux++
    }
    println(msg)
    }
    if(opcao==3){

    }
}


