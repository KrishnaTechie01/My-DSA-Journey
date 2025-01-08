import java.util.Scanner;

public class checksortedinrecursive {
    public static boolean isChecksorted(int[] a, int n, int i) {
        if (i >= n - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return isChecksorted(a, n, i + 1);
        
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        System.out.println(isChecksorted(array, n, i));
        sc.close();
    }
}
