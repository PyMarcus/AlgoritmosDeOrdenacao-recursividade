//recursividade é uma função chamar a si própria
//pode ser direta ou indireta, quando conta com outra função para fazê-lo
//recursividade, no entanto, consome bastante memória, dependendo do caso.Pois,na pilha de execução, é criado um registro para cada chamada de método
// mas, esses registros consomem memória já que armazenam parâmetros e variáveis da função.
// Não é muito recomendado,mas,normalmente, é usada em árvores ou algorítmos complexos.
public class Recursividade1 {
    //soma recursiva:
    public static void main(String[] args){
        System.out.println(soma_recursiva(5));
    }
    private static int soma_recursiva(int valor){
        if(valor > 0){
            return valor + soma_recursiva(valor - 1);
        }else return 0;
    }
}
