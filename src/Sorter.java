import java.util.Random;

public class Sorter {

    public void basicSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void advancedSort(int[] arr) {
        int n = arr.length;
        for (int width = 1; width < n; width *= 2) {
            for (int i = 0; i < n; i += 2 * width) {
                int left = i;
                int mid = Math.min(i + width - 1, n - 1);
                int right = Math.min(i + 2 * width - 1, n - 1);
                if (mid < right) {
                    int n1 = mid - left + 1;
                    int n2 = right - mid;
                    int[] L = new int[n1];
                    int[] R = new int[n2];
                    for (int a = 0; a < n1; a++) L[a] = arr[left + a];
                    for (int b = 0; b < n2; b++) R[b] = arr[mid + 1 + b];
                    int a = 0, b = 0, k = left;
                    while (a < n1 && b < n2) {
                        if (L[a] <= R[b]) arr[k++] = L[a++];
                        else arr[k++] = R[b++];
                    }
                    while (a < n1) arr[k++] = L[a++];
                    while (b < n2) arr[k++] = R[b++];
                }
            }
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }
}