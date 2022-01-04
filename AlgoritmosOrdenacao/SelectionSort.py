class Main:

    @staticmethod
    def selection_sort(vetor):
        contador = len(vetor)
        while contador > 0:
            for n in range(len(vetor) - 1):
                if vetor[n] > vetor[n + 1]:
                    salva_posicao = vetor[n]
                    vetor[n] = vetor[n + 1]
                    vetor[n + 1] = salva_posicao
            contador -= 1
        return vetor


if __name__ == '__main__':
    vetor = [5, 3, 4, 2, 1]
    print(Main.selection_sort(vetor))
