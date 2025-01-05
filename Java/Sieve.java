public class Sieve {
    public static void main(String[] a) {
        int L = 10, R = 20;
        boolean[] element = new boolean[R];
        for (int i = 0; i < R; i++) {
            element[i] = true;
        }
        for (int p = 2; p * p < R; p++) {
            if (element[p]) {
                for (int i = p * p; i < R; i = i + p) {
                    element[i] = false;
                }
            }
        }
        int sum = 0;
        for (int i = L; i < R; i++) {
            if (element[i]) {
                sum += i;
            }
        }
        
    
        System.out.println(sum);

    }
}
