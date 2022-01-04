public class InsertSort {
    public static void main(String[] args){
        int[] vetor =  {5, 3, 4, 1, 2};
        int[] resultado = insert_sort(vetor);
        insert_sort(vetor);
        for(int n = 0; n < vetor.length; n++) System.out.println(resultado[n]);
    }

    private static int[] insert_sort(int[] vetor){
        //compara com todas as posicoes e vai encaixando, como em um baralho.
        int contador = vetor.length;
        int inesima_posicao = vetor.length - 1;
        int salva_posicao = 0;

        while(contador >= 0){
                for(int i = vetor.length - 1 ; i >= 0; i--){
                    for(int x = i; x >= 0; x--){
                        if(vetor[inesima_posicao] < vetor[x]){
                            salva_posicao = vetor[x];
                            vetor[x] = vetor[inesima_posicao];
                            vetor[inesima_posicao] = salva_posicao;
                            inesima_posicao = x;
                        }
                        else{
                            inesima_posicao -= 1;
                            if(inesima_posicao <= 0){
                                inesima_posicao = vetor.length - 1;

                            }

                        }
                    }


                }
            contador --;
        }
        return vetor;

    }
}

