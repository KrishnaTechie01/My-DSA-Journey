import java.util.Scanner;
public class KthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int k = sc.nextInt();
        long power=(long)Math.pow(A,B);
        int i = 1;
        while(A > 0){
            long ld = power % 10;
            if (k == i){
                System.out.print(ld);
            }
                power = power / 10;
                i++;
            
        }
        System.out.print("0");
    }
}
