import java.util.Scanner;

public class Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
