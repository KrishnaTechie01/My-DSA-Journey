import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
       Scanner Num = new Scanner(System.in);
       int n = Num.nextInt();
       int M = Num.nextInt();
       int o = Num.nextInt();
       if (n + M + o == 180) {
        System.out.println("Triangle can be formed");
       }
       System.out.println("Triangle can't be formed");
       Num.close();
    }

}