import java.util.Scanner;

public class insertionSort {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Before Sorting array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("After Sorting array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}