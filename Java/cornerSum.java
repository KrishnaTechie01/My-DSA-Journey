import java.util.Scanner;
public class cornerSum {
    public static void main(String[] a)
    {
        // code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = n % 10;
        int fd = n / 10;
        while(fd >= 10){
            fd = fd / 10;
        }
        
       int sum = ld + fd;
       System.out.print(sum);
       sc.close();
    }
}

