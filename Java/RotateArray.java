public class RotateArray {
    public static void rotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for(int i = n - 1; i >= 1; i--){
            
            arr[i] = arr[i - 1];
        }
        
        arr[0] = temp;
        
        for(int j = 0; j < n; j++){
            
            System.out.println(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        rotate(array);
    }
}
