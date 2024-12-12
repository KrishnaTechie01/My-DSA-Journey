import java.util.Scanner;
public class last {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            System.out.print(ld);
            n = n / 10;
        }
    }
}
