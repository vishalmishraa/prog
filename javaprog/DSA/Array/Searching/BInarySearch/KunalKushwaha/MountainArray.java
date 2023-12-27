package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

public class MountainArray {

    /*
     * My solution , it is worst cas
     * 
     * public static int MountainArrayFun(int[] arr) {
     * int start = 0;
     * int end = arr.length - 1;
     * while (start <= end) {
     * int mid = start + (end - start) / 2;
     * if (arr[mid] < arr[mid + 1]) {
     * start = mid + 1;
     * end = mid + 2;
     * } else if (arr[mid - 1] > arr[mid]) {
     * end = mid - 1;
     * } else {
     * return mid;
     * }
     * 
     * }
     * return start;
     * 
     * }
     * 
     */

    // Best case
    public static int MountainArrayFun(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void solve() {
        int[] arr = { 40, 48, 61, 75, 100, 99, 98, 39, 30, 10 };
        System.out.println(arr[MountainArrayFun(arr)]);
    }

}
