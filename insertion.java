public class insertion {

    public static void insertion_sort(int arr[], int n) {
        for (int i = 1; i < n; i++) // unsorted
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) // sorted
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 1, 3 };
        int n = arr.length;
        System.out.println("before sorting ");
        for (int i : arr) {
            System.out.println(i);
        }

        insertion_sort(arr, n);

        System.out.println("after sorting ");
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
