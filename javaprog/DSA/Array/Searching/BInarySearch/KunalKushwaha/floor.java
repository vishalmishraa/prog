package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

import java.util.Scanner;

public class floor {

    public static int solve() {
        Scanner sc = new Scanner(System.in);
        // Enter size of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Enter target element
        int target = sc.nextInt();
        sc.close();
        int start = 0;
        int end = arr.length - 1;
        int result = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                result = arr[mid];
                start = mid + 1;

            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }

        }
        return result;
    }
}
