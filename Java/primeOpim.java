import java.util.Scanner;
class primeOpim {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                System.out.println("Prime Number");
                break;
            } else {
                System.out.println("It's not a Prime Number");
                break;
            }
        }
        sc.close();
    }
}