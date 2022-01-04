public class Recursividade4 {
    //potência de um número
    public static void main(String[] args){
        System.out.println(potencia(1, 3));
    }
    private static int potencia(int base, int expoente){
        if(expoente > 0){ //define a quantidade de vezes que será multiplicado
            return base * potencia(base, expoente - 1);
        }return 1;
    }
}
