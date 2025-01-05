import java.util.Scanner;
public class minmax {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] first_Array = new int[number];
        for (int i = 0; i < number; i++) {
            first_Array[i] = sc.nextInt();
        }
        int number1 = sc.nextInt();
        int[] second_Array = new int[number1];
        for (int i = 0; i < number1; i++) {
            second_Array[i] = sc.nextInt();
        }
        int minimum = first_Array[0];
        int maximum = second_Array[0];
        for (int i = 0; i < first_Array.length; i++) {
            if (first_Array[i] < first_Array[minimum]) {
                minimum = first_Array[i];
            }
        }
        for (int i = 0; i < second_Array.length; i++) {
            if (second_Array[i] > second_Array[minimum]) {
                maximum = second_Array[i];
            }
        }
        System.out.println(maximum + " " + minimum);
        int product = maximum * minimum;
        System.out.println(product);
        sc.close();

    }
}
