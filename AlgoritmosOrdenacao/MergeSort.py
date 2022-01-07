# dividir ao meio
# dividir a parte ao meio, até ser duplas ou únicos
# comparar os números das partes e eliminar , após as comparações
# juntar as partes comparando e eliminando

    
def merge_sort(vetor) -> list:
    if len(vetor) > 1:
        metade_1 = vetor[:int(len(vetor) // 2)]
        metade_2 = vetor[int(len(vetor) // 2):]
    
        # recursividade
        
        merge_sort(metade_1)
        merge_sort(metade_2)
        
        i, j, x = 0, 0, 0
        # merge 
        print(f"metade1{metade_1} metade2: {metade_2}")  
        while j < len(metade_1) and i < len(metade_2):
            if metade_1[j] < metade_2[i]:
                vetor[x] = metade_1[j]
                j += 1
            else:
                vetor[x] = metade_2[i]
                i += 1
            x += 1
        while j < len(metade_1):
            vetor[x] = metade_1[j]
            j += 1
        while i < len(metade_2):
            vetor[x] = metade_2[i]
            i += 1
            x += 1
        print(vetor)

            
        

if __name__ == '__main__':
    vetor = [5, 3, 7,  6, 9]
    merge_sort(vetor)
        
