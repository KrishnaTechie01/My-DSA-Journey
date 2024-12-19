import java.util.Scanner;
class Addvalues {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(v[i + 5]);
        }
        input.close();
    }
    
}
