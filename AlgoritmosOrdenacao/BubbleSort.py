# faz poucas comparações
# no pior caso, faz duas movimentacoes a cada interacao e muitas comparacoes
# é bastante lento, em comparacao aos outros
# feito para arquivos pequenos
class BubbleSort:
    
    @staticmethod    
    def bubble_sort(vetor):
        contador = 0
        while True:
            for i in range(len(vetor) - 1):
                if vetor[i] >= vetor[i + 1]:
                    auxiliar = vetor[i]
                    vetor[i] = vetor[i + 1]
                    vetor[i + 1] = auxiliar
            if contador == (len(vetor) * len(vetor)):
                break
            contador += 1
        return vetor


if __name__ == '__main__':
    vetor = [5, 4, 3, 1, 2]
    print(BubbleSort.bubble_sort(vetor=vetor))
    
