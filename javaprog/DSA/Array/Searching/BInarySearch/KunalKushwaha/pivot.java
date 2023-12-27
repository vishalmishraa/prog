package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

public class pivot {
    public static int Search(int[] arr) {
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

            /*
             * --> case 3: ( arr[start] >= arr[mid] ) suppose start is >= mid like {6 , 7 ,
             * 0 , 1 , 2 , 3 , 4 ,5}
             * ^_start ^_mid
             * 
             * so , in this case all the elemnt after mid will be smaller then start , so we
             * can igrone it .
             * so , we will move the end :
             * end = mid - 1;
             */

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }

            /*--> case 4: ( arr[start] <= arr[mid] ) ex: { 2 , 3 , 4 , 5 , 6 , 7 , 0 , 1 }
                                                           ^_start     ^_mid
            
            then all the elements before mid will be smaller then after mid elemnt , where the pivot is avaialbele
            so ,   we will move the start :
                                    start = mid + 1;  */

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }

        }
        return -1;
    }
}
