package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

//program for Binary Search which return the index(ans : index+1) of searched element 
public class A_BinarySearch_program {
    public static String solve() {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;

        int result = BinarySearch(arr, target);
        System.out.println(result);
       if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
        return " ";
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0, ans = start;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                return ans + 1;
            }
        }
        return -1;
    }
}
