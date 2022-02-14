import java.util.*

fun main(args: Array<String>) {
    println("Escolha uma opção: ")
    println("1 - Calcular media: ")
    println("2 - Verificar se é palíndroma: ")
    println("3 - Sair: ")
    // vai ler o nome e guardar na variável nome
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
    //leitura do teclado
    var input = Scanner(System.`in`)
    //conversão do que foi lido do teclado para uma String
    var palavra = input.next()
    //pegando o tamanho da palavra passada, decrementando 1 para ficar dentro do limite da indexação
    var tam : Int = palavra.length-1

    //variavel para percorrer a palavra da esquerda para a direita
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


