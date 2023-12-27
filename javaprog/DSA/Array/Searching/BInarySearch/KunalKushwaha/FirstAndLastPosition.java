package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {

    // Solution using Wrost condition : BUT i got 100% in java :)
    /*
     * public static String solve() {
     * Scanner sc = new Scanner(System.in);
     * int[] arr = { 1 };
     * int[] res = { -1, -1 };
     * int target = 1;
     * int t;
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] == target) {
     * t = i;
     * res[0] = i;
     * while (arr[t] == target) {
     * res[1] = t;
     * t++;
     * if (t > arr.length - 1)
     * break;
     * }
     * break;
     * }
     * 
     * }
     * 
     * for (int i = 0; i < res.length; i++) {
     * System.out.println(res[i]);
     * }
     * 
     * sc.close();
     * return " ";
     * 
     * }
     * 
     */

    // Solution using Binaray Search
    public static String solve() {

        int[] arr = { 1, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 9 };
        int target = 6;

        int start = searchPosition(arr, target, true);
        int end = searchPosition(arr, target, false);

        System.out.println(start + " " + end);

        return " ";
    }

    // this fucnction return the first and last position of element ;
    public static int searchPosition(int[] arr, int target, boolean FirstElement) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (FirstElement) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
