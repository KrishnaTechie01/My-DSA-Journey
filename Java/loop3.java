import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        for (int i = 1; i <= n; i++) {
            System.out.println(s1 + s2);
        }
        sc.close();
    }
}
