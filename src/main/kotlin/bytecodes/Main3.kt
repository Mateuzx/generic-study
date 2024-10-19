package bytecodes


fun main() {
    val descricao = "Inline te dando poderes mágicos"
    executarOperacao {
        print(descricao)
    }
}

// Com inline ele realiza a execução diretamente no escopo de execução da main, sem isso ele executa no escopo da função
//principal (neste caso chamada de executarOperacao)
inline fun executarOperacao(operacaoDois: () -> Unit) {
    //operacaoUm()
    operacaoDois()
    //operacaoTres()
}