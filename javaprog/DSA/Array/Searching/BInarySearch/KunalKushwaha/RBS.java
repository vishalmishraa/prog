package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;
//range binary search
public class RBS {
    public static int BinarySearch(int[] arr, int target, int start , int end) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }

}
