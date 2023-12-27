package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void solve() {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'g';
        int start = 0;
        int end = arr.length - 1;
        char result = arr[start];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        result = arr[arr[start] % arr.length];
        System.out.println(result);
    }

}
