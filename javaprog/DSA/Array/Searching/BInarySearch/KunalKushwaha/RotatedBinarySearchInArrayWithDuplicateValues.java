package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;
import javaprog.DSA.Array.Searching.LinearSearch.LinearSearch;

/*
 * suppose there is array with elements {2,2,2,2,9}
 * now we will rorate it 2 times = {2,9,2,2,2}
 * 
 * it wil add some cases in pivot() finding method
 */
public class RotatedBinarySearchInArrayWithDuplicateValues {

    public static void solve() {
        int[] arr = { 2, 2, 9, 2, 2 };
        int target = 9;
        System.out.println((Search(arr, target)));
    }

    static int Search(int[] arr, int target) {
        if (arr.length > 3) {
            int pv = pivot(arr);
            if (pv > 3 || ((arr.length - 1) - pv) < 3) {
                int firstTry = RBS.BinarySearch(arr, target, 0, pv);
                if (firstTry >= 0) {
                    return (firstTry);
                }
                return (RBS.BinarySearch(arr, target, pv, arr.length - 1));
            }
            return LinearSearch.Search(arr, target, 0, arr.length - 1);
        }
        return LinearSearch.Search(arr, target, 0, arr.length - 1);

    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            /* --> case 1: ( mid > mid + 1 ) then ans = mid + 1 */
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            /* --> case 2: ( mid < mid - 1 ) (ex : if mid is at 0) then ans = mid -1 ; */
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            /* if elment at , middle , start , are euqal , then skipp the duuplicates */
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                /* NOTE : WHAT IF THE ELEMNTS AT START AND END IS PIVOT THEN CHECK IT FIRST : */
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] > arr[end - 1]) {
                    return end;
                }
                end--;
            } else if (arr[start] < arr[end] || (arr[start] == arr[end] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

}
