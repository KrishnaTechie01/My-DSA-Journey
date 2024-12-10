import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch (value) {
            case 30:
            System.out.print("Medium");
            break;
            case 38:
            System.out.print("Large");
            break;
            case 42:
            System.out.print("Xlarge");
            break;
            default:
            System.out.print("Invalid");
            break;



        }
    }
}
