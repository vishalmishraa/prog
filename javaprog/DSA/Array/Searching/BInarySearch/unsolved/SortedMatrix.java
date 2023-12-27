package javaprog.DSA.Array.Searching.BInarySearch.unsolved;

import java.util.Arrays;
//Here matric is soreted fully

public class SortedMatrix {
    public static void solve() {

        int[][] arr = {

                { 1 },
                {3}

        };
        String str = (Arrays.toString(Search(arr, 1)));

        int a = str.charAt(1);
        System.out.println(a);

    }

    public static int[] Search(int[][] arr, int target) {
        /*
         * start searching from middile colunm and perform binary search on that
         * suppose target = 2 ;
         * 
         * 
         * then as we are taking middle columns that is colums starting with 2
         * then performing BS on that .
         * where middile elment is 6
         * which is larger then 2 it means
         * all those number after 6 will be greter then target
         * so ignore all of that.
         * 
         * So , there will be three cases:
         * 
         * 
         */

        int r = arr.length;
        int c = arr[0].length;// be cautious matrix may be empty

        if (r == 1) {
            return BInarySearchInMatrix(arr, 0, 0, c - 1, target);
        }

        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;

        // run it loop till two rows are remaing
        while (rStart < (rEnd - 1)) {

            int mid = rStart + (rEnd - rStart) / 2;

            // case 1: arr[r][c]==target
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            /*
             * case 2 : arr[r][c] > target
             * ignore rows after it;
             */

            /*
             * case 3 : arr[r][c] < target
             * ignore rows above it;
             */

            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

            /*
             * In the end there will be two rows remaining :
             * then part the matrix then asearch it
             * 
             */

            // check whether is target is in the columns of two rows:
            if (arr[rStart][cMid] == target) {
                return new int[] { rStart, cMid };
            }

            if (arr[rStart + 1][cMid] == target) {
                return new int[] { rStart + 1, cMid };
            }

            // search in first half;
            if (arr[rStart][cMid - 1] >= target) {
                return BInarySearchInMatrix(arr, rStart, 0, cMid - 1, target);
            }

            // search in Second half;
            if (arr[rStart][cMid + 1] <= target && target <= arr[rStart][c - 1]) {
                return BInarySearchInMatrix(arr, rStart, cMid + 1, c - 1, target);

            }

            // search in Third half;
            if (arr[rStart + 1][cMid - 1] >= target) {
                return BInarySearchInMatrix(arr, rStart + 1, 0, c - 1, target);

            } else {
                // search in Fourth half;
                return BInarySearchInMatrix(arr, rStart + 1, cMid + 1, c - 1, target);

            }

        }

        return new int[] { -1, -1 };
    }

    // Search in the row provided and column provided
    public static int[] BInarySearchInMatrix(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }

        }
        return new int[] { -1, -1 };

    }

}
