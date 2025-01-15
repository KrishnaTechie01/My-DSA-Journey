public class Dutchflag {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort012(int[] arr) {
        int size = arr.length;
        int left = 0;
        int mid = 0;
        int right = size - 1;

        while (mid <= right) {
            if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                swap(arr, mid, left);
                left++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, right);
                right--;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print("Sorted of 0's 1's 2's:"+arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int[] array = { 0, 0, 1, 0, 2, 1, 1, 2 };
        for (int i = 0; i < array.length; i++){
            System.out.print("Original Array :" + array[i] + " ");
        }
        sort012(array);
    }
}
