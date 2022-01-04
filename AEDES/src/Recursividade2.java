public class Recursividade2 {
    //somar números ímpares
    public static void main(String[] args){
        System.out.print(soma_impar(5));
    }
    private static int soma_impar(int valor){
        if(valor > 0){
            if(valor % 2 != 0){
                return valor + soma_impar(valor - 1);
            }else return soma_impar(valor - 1);
        }else return 0;
    }
}
