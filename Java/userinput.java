import java.util.Scanner;
 class userinput {
  
    public static void main(String[] a) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int [] roll = new int[n];
         for (int i = 0; i < n; i++) {
             roll[i] =s.nextInt();
         }
         System.out.println("Output value");
         for (int i = 0; i < roll.length; i++) {
             System.out.println(roll[i]);
         }
         s.close();
    }
}
