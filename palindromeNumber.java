import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = 10 * sum + ld;
            n = n / 10;
        }
        // System.out.print(sum);
        if (sum == temp) {
            System.out.print("Palindrone Number");
        }
        else {
            System.out.print("It's not a Palindrone Number");
        }

    }
}
