import java.util.Scanner;

public class SumofArrayRecursive {
    public static int Sumofrecursive(int[] a, int number, int i) {
        if (i >= number) {
            return 0;
        }
        return a[i] + Sumofrecursive(a, number, i + 1);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        int result = Sumofrecursive(array, n, i);
        System.out.println(result);
        sc.close();
    }
}
