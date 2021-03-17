import java.util.*;

public class Main {
    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(arr));
        obj.sort(arr);
        System.out.println("my Ans is here");
        obj.printArray(arr);
    }
}
