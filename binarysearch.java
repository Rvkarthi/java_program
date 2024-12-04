import java.util.Scanner;

public class binarysearch {
    public static int bs(int arr[], int first, int last, int key) {
        if (first < last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                return 1;
            } else if (key < arr[mid]) {
                bs(arr, 0, mid - 1, key);
            } else if (key > arr[mid]){
                bs(arr, mid + 1, last, key);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // declaration
        int arr[] = { 5, 10, 15, 20, 25, 30 };
        Scanner scan = new Scanner(System.in);

        // input for key
        System.out.println("enter key : ");
        int key = scan.nextInt();

        // displaying
        for (int i : arr) {
            System.out.print(" " + i);
        }

        int found = bs(arr, 0, arr.length-1, key);

        // ternary operator
        System.out.println((found == 1) ? "\nkey is found" : "\nkey is not found");

    }

}
