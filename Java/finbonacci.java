import java.util.Scanner;

public class finbonacci {
    public static int Fibo(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int s = Fibo(number);
        System.out.println(s);
        sc.close();

    }
}
