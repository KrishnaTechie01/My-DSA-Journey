import java.util.Scanner;

public class powerOfnth {
    public static int hasPower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * hasPower(number, power - 1);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result= hasPower(n, p);
        System.out.print(result);
        sc.close();
    }
}
