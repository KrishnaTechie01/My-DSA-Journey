import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i <=10*100; i+=100) {
            System.out.println(i);
        }
    }
}
