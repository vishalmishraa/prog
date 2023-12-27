package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;
//Find the position of an element in infinite sorted Array . (It's means you are not allowed to use arr.length ot any fuction which return the length of array)

public class InfiniteArraySearch {

    public static String solve() {
        int[] arr = { 2, 3, 4, 5, 6, 7, 7, 8, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 233, 444, 555, 666 };
        int target = 8;
        System.out.println(infiniteSearch(arr, target));
        return " ";
    }

    public static int infiniteSearch(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            // new end = end + sizeOfPreviousRange(end-straet+1)*2
            /*****WARNING*******
             * 
             * 
             * At some point it will give error for 
             * ArrayOutOfBound : You have to ignore this error
             * as we are asuming our array as infinite array but it is not
             * so , thats whu it is giving this error , 
             * this error not going to happen when array will be infinite size.
             * 
             * 
             */
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        
        return  BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start , int end) {
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
