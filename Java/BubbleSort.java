import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int temp = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
