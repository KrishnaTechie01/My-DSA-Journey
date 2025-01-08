import java.util.Scanner;

public class divisorsofnumber {
    public static void divisorsofrecursive(int n, int i){
            if (i > n) {
                return;
            }
            if (n % i == 0) {
                System.out.println(i);
            }
            divisorsofrecursive(n, i + 1);
        }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        divisorsofrecursive(n, i);
        sc.close();
    }
}
