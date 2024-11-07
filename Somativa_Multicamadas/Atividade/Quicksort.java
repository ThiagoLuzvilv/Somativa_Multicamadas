public class Quicksort {

    public Quicksort() {
    }

    public void quickSort(int lista[], int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = particao(lista, inicio, fim);

            System.out.println("Iteração:");
            for (int item : lista) {
                System.out.print(item + " ");
            }
            System.out.println();

            quickSort(lista, inicio, partitionIndex - 1);
            quickSort(lista, partitionIndex + 1, fim);
        }
    }

    // ultimo item da lista, no caso o 28.
    public int particao(int lista[], int inicio, int fim) {
        int pivot = lista[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= pivot) {
                i++;
                int troca = lista[i];
                lista[i] = lista[j];
                lista[j] = troca;
            }
        }
        int troca = lista[i + 1];
        lista[i + 1] = lista[fim];
        lista[fim] = troca;

        return i + 1;
    }

    public static void main(String[] args) {

        int lista[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        Quicksort quicksort = new Quicksort();

        quicksort.quickSort(lista, 0, 19);


    }

}
