public class Mergesort {
    public static void printarr(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);    // left sort
        mergesort(arr, mid + 1, ei); // right sort
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

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

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (int s = 0; s < temp.length; s++) {
            arr[si + s] = temp[s];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 6, 4, 3, 9};
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
