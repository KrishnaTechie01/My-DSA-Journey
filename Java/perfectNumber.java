import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (n / i != i) {
                    sum = sum + (n / i);
                }
            }
        }
        if (sum == n) {
            System.out.print("Perfect Number Of "+n+" is Equal to sum value "+sum);
        }
        else {
            System.out.print("It's Not Perfect Number " + n + " is Not to Equal the sum value " + sum);
        }
        sc.close();
    }
}
