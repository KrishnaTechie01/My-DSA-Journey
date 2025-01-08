import java.util.Scanner;

public class recursiveSum {
    public static int recursiveSumofdigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + recursiveSumofdigit(n / 10);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveSumofdigit(n));
        sc.close();
        
    }
}
