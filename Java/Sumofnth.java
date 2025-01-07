import java.util.Scanner;

public class Sumofnth {
    public static int Sumof(int n) {
        if (n == 0) {
            return 0;
        }
        return n + Sumof(n - 1);
         

    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int s = Sumof(number);
        System.out.println(s);
        sc.close();
    }
}
