import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Fact = 1;
        for (int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }
        System.out.print("The value of the nth Factorical: " + Fact);
        sc.close();
    }
}
