package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

import java.util.Arrays;
//matrix is sorted row waise and col wise both;

public class RowColMatrix {
    public static void solve() {

        int[][] arr = {

                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }

        };
        System.out.println(Arrays.toString(Search(arr, 37)));
    }

    public static int[] Search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        /*
         * * lets suppose you have to search for target = 37 ;
         * 
         */
        while (r < arr.length - 1 && c >= 0) {
            /*
             * case 1 : if arr[r][c] == target
             * return [r][c]
             */
            if (arr[r][c] == target) {
                return new int[] { r, c };
            }

            /*
             * * case 2 : if arr[r][c] > target
             * "suppose 40" then number below that will be all greter then
             * target; so , ignore all that;
             * for that we have to that
             * 
             * c--;
             * 
             * case 3 : if[r][c] < target
             * "suppose 30" then number before 30 in that row will be less then
             * target ; so ignore all that;
             * for that we have to do
             * 
             * change the row : r++;
             */
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[] { -1, -1 };
    }
}
