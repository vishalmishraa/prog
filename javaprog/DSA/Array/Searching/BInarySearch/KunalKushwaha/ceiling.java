package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

//program to find the cealing of a number from a array
import java.util.Scanner;

public class ceiling {

    public static int solve() {
        Scanner sc = new Scanner(System.in);
        // Enter Number of element of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Enter Element of array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Enter target elemnt for ceiling
        int target = sc.nextInt();
        sc.close();
        int start = 0, result = start;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }

            if (arr[mid] >= target) {
                result = arr[mid];
                end = mid - 1;
            }
            
        }
        return result;
    }
}
