import java.util.Scanner;

public class searchfortargetInArray {
    public static int hasSearchArrayinrecursive(int[] arr, int n, int target, int i) {
              
        if (i >= n) {
            return -1;
        }
        if (target == arr[i]) {
            return i;
        }
        else {
            return hasSearchArrayinrecursive(arr, n, target, i + 1);
        }
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int i = 0;
        int result = hasSearchArrayinrecursive(array, n, t, i);
        System.out.println(result);
        sc.close();
    }
}
