public class Mdc{
    public static void main(String[] args){
        //declaração
        int valor = 16, valor2 = 8, menor = 0;
        //chamada de método (troca de mensagens)
        if (valor >= valor2) menor = valor2;
        else menor = valor;
        System.out.println(mdc(valor, valor2, menor)); // variaveis de tipo primitivo que sao passadas como copia
    }
    //método estático
    private static int mdc(int valor, int valor2, int menor){ //métodos estáticos são alocados em memória.Usados quando comeca a chamada
        if(menor > 1){
             if (valor % menor == 0 && valor2 % menor == 0){
                return menor;
            }else return mdc(valor, valor2, menor - 1);
        }
        return menor;
    }
}