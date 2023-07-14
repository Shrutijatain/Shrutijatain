import java.util.Scanner;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int rotationCount) {
        int n = arr.length;
        rotationCount %= n;  // Adjust rotation count to be within the array size

        // Reverse the entire array
        reverseArray(arr, 0, n-1);

        // Reverse the first rotationCount elements
        reverseArray(arr, 0, rotationCount-1);

        // Reverse the remaining elements
        reverseArray(arr, rotationCount, n-1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the rotation count: ");
        int rotationCount = scanner.nextInt();

        scanner.close();

        rotateArray(arr, rotationCount);

        System.out.println("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}