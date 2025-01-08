import java.util.Scanner;

public class printArrayinrescursive {
    public static void ArrayOfrecursive(int[] a, int n, int i) {
        if (i >= n) {
            return;
        }
        System.out.print(a[i]);
        ArrayOfrecursive(a, n, i + 1);
        System.out.print(a[i]);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        ArrayOfrecursive(arr, n, i);
        sc.close();
    }
}
