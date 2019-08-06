package ex1;

public class Ex1 {

    public void merge(int vetor[], int inicio, int meio, int fim) {

        int aux[];
        aux = new int[fim - inicio + 1];
        int i = inicio, j = meio + 1, k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                aux[k] = vetor[i];
                k++;
                i++;
            } else {
                aux[k] = vetor[j];
                k++;
                j++;
            }
        }

        while (i <= meio) {
            aux[k] = vetor[i];
            k++;
            i++;
        }
        while (j <= fim) {
            aux[k] = vetor[j];
            k++;
            j++;
        }
        i = inicio;
        while (i <= fim) {
            vetor[i] = aux[i - inicio];
            i++;
        }
    }

    void mergeSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }

    }

    void printArray(int aux[], int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(aux[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int vetor[] = {12, 11, 13, 5, 6, 7, 9, 50};
        int tamanho = 8;
        Ex1 x = new Ex1();

        System.out.print("Array de entrada: ");
        x.printArray(vetor, tamanho);

        x.mergeSort(vetor, 0, tamanho - 1);
        System.out.print("Array ordenado: ");
        x.printArray(vetor, tamanho);
    }
}
