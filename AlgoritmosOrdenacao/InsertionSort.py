class Main:
    @staticmethod
    def insertion_sort(vetor: list) -> list:
        contador: int = len(vetor)
        inesima_posicao: int = len(vetor) - 1
        salva_posicao: int = 0
        while contador >= 0:
            for i in range(len(vetor), 0, -1):
                for x in range(i - 1, -1, -1):
                    if vetor[inesima_posicao] < vetor[x]:
                        salva_posicao = vetor[x]
                        vetor[x] = vetor[inesima_posicao]
                        vetor[inesima_posicao] = salva_posicao
                        inesima_posicao = x
                    else:
                        inesima_posicao -= 1
                        if inesima_posicao <= 0:
                            inesima_posicao = len(vetor) - 1
            contador -= 1
        return vetor


if __name__ == '__main__':
    print(Main.insertion_sort([5, 3, 4, 2, 1]))
