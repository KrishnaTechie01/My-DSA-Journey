public class MergeSort {

  
    public static void mergeSort(int l, int h, int[] arr) {
        
        if (l >= h) {
            return;
        }
        int mid = l + (h - l) / 2;
        mergeSort(l, mid, arr);
        mergeSort(mid + 1, h, arr);
        merge(l, mid, h, arr);
    }

    
    private static void merge(int l, int mid, int h, int[] arr) {
      
        int n1 = mid - l + 1;
        int n2 = h - mid;

      
        int[] left = new int[n1];
        int[] right = new int[n2];

        
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
              
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        mergeSort(0, arr.length - 1, arr);

        System.out.println("Sorted Array:   " + java.util.Arrays.toString(arr));
    }
}

