import java.util.Scanner;

public class countdigit {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            @SuppressWarnings("unused")
            int id = n % 10;
            count++;
            n = n / 10;
        }

        System.out.print(count);
        sc.close();

    }
    
}
