package javaprog.DSA.Array.Searching.LinearSearch;

public interface LinearSearch {

    public static int Search(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
