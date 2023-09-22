package DivideAndConquer;

/**
 * DivideAndConquer
 */
public class DivideAndConquer {

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterater for left part
        int j = mid + 1; // iterater for right part
        int k = 0; // iterater for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k =0, i=si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 1, 8, 7, -2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}