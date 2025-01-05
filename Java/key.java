import java.util.Scanner;

public class key {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt(); 
        int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         for (int i = 0; i < arr.length; i++) {
             if (key == i) {
                 System.out.println(arr[i]);
             }
         }
         
         sc.close();

    }

}
