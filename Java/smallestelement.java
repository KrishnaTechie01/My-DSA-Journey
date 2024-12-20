import java.util.Scanner;
public class smallestelement {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = sc.nextInt();
        }
        int small = element[0];
        int i = 1;
        while (i < element.length) {
            if (element[i] < small) {
                small = element[i];
            }
            i++;
        }
        System.out.print(small);
        sc.close();

        
    }
}
