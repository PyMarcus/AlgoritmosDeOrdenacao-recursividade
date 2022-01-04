//não é um dos melhores métodos,mas cumpre o papel
//é ideal para grandes quantidades de dados muito dispersos
// é ruim no sentido que faz algumas trocas e muitas comparações

public class SelectionSort {
    public static void main(String[] args){
        int[] vetor = {5, 3, 4, 1, 2};
        int[] resultado = selection_sort(vetor);
        for(int i = 0; i < vetor.length; i++){
            System.out.println(resultado[i]);
        }
    }
    private static int[] selection_sort(int[] vetor){
        int menor_valor = 0;
        int contador = vetor.length;
        while (contador > 0){
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] >= vetor[i + 1]){
                    menor_valor = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = menor_valor;
                }
            }
            contador --;
        }
        return vetor;
    }
}
