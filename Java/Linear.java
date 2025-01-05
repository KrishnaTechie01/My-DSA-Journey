import java.util.Scanner;
public class Linear {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = { 3, 4, 5, 6, 7, 6, 9 };
        int index = 6;
        int flag = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == index) {
                flag = i;
                break;
            }
        }
        System.out.println(flag);
        if (flag == -1) {
             System.out.println("An element Not present in  an array");
        }
        else {
            System.out.println("An element present in an array");
        }
        sc.close();
    }
}
