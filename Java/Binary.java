import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = 4;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } 
             else {
                high = mid - 1;
            
    }
        }
        sc.close();


    }

    }

