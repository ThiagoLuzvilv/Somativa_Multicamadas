public class BubbleSort {

    public void bubbleSort(Integer[] arr) {
        int i = 0, n = arr.length;
        boolean troca = true;
        while (i < n - 1 && troca) {
            troca = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    troca = true;
                }
            }
            System.out.println("Iteração " + (i + 1) + ":");
            for (int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
            if (!troca) {
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Integer[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);

    }

}
