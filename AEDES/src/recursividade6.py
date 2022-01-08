def soma_vetor(vetor: list, index: int) -> int:
    soma = 0
    if index >= 0:
        print(index)
        soma += vetor[index]
        return soma + soma_vetor(vetor, index - 1)
    else:
        return soma


if __name__ == '__main__':
    vetor = [1, 2, 3, 4, 5, 6]
    print(soma_vetor(vetor, len(vetor) - 1))
