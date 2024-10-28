public class Insertion {
    public static void main(String[] args) {
        int arr[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.println("Iteração " + i + ":");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
