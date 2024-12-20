import java.util.Scanner;
public class Largestelement {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int larg = values[0];
        int i = 1;
        while (i < values.length) {
            if (values[i] > larg) {
                larg = values[i];
            }
            i++;
        }
        System.out.print(larg);
        sc.close();
    }
}
