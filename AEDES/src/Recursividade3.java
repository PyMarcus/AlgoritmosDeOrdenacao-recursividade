public class Recursividade3 {
    //cálculofatorial
    public static void main(String[] args){
        System.out.println(calcula_fatorial(4));
    }
    private static int calcula_fatorial(int valor){
        if(valor > 1){
            return valor * calcula_fatorial(valor - 1);
        }return 1;
    }
}
