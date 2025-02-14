import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 8, 9, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // Start from i
            
            for (int j = i + 1; j < n; j++) { // Compare remaining elements
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            // Swap arr[minIdx] with arr[i]
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5, 8, 9]
    }
}
