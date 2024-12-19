import java.util.Scanner;
 class Sumof {
     public static void main(String[] a) {
         Scanner sc = new Scanner(System.in);
         int sum = 0;
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println("array Values:");
         for (int i = 0; i < n; i++) {
             System.out.println(arr[i]);
             sum += arr[i];
         }
         System.out.println("Sum of the array:");
         System.out.println(sum);
         sc.close();

    }
}
