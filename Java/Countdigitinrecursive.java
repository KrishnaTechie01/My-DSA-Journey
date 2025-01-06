import java.util.Scanner;

public class Countdigitinrecursive {
    public static int Countdigit(int n){
        if (n % 10 == n) {
            return 1;
        }
        if (n % 10 == 0) {
            return Countdigit(n / 10);
        }
        else {
            return 1 + Countdigit(n / 10);
        }
        
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Countdigit(n));
        sc.close();
    }
}