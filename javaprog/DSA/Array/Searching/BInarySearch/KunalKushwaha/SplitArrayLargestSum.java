package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {

    public static void solve() {
        int[] arr = { 7, 2, 5, 10, 9 };
        int k = 2;

       System.out.println(splitArray(arr, k));

    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);// in the end it wil contain lasgest element of array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many peces you can divided this in max term
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you can not add it this in sub array , make new one
                    // as you if add this sum in subarray ,then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }

}
