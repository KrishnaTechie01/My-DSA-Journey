import java.util.Scanner;
class Oddeven{
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }
        int oddcount = 0, evencount = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                evencount += 1;
            } else {
                oddcount += 1;
            }
        }
        System.out.println(evencount+" "+oddcount);
        input.close();
    }
    
}
