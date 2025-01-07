import java.util.Scanner;

public class recursion {
    
    public static void printnth(int n) {
        if (n == 0) {
            return;
        }
        else {
            printnth(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnth(n);
        sc.close();
    }
}
