public class Main {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

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
        int arr[] = { 64, 25, 12, 22, 11 };
        obj.sort(arr);
        System.out.println("my Ans is here");
        obj.printArray(arr);
    }
}