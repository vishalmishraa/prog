package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

import javaprog.DSA.Array.Searching.LinearSearch.LinearSearch;

//ROTEDTED ARRAY : https://leetcode.com/problems/search-in-rotated-sorted-array/

/* What is Rotedted array :  
 *  [1,2,3,4,5] -> After one roatation -> [5,1,2,3,4]
 *  [5,1,2,3,4] -> After second roatation -> [4,5,1,2,3]
 * 
 *  how do we solve it ?
 *  solution : Find the pivot of the array !(pivot is from where you next number are accending)
 *              [3,4,5,6,7,0,1,2]  - {7,}- {6,7,},{5,6,7}
 *                       ^
 *                       |
 *                     pivot
 * 
 * so --> first search pivot then search for element in first half(till pivot)
 *  if found return ans ; else search in second half from pivot+1 and return the ans;
 *  
 * so --> there will be a pivot(int[] arr);
 * 
 * *******HOW TO FIND PIVOT ??? *******
 * 
 *      [ 3, 4 , 5 , 6 , " 7 , 0 " , 1 , 2 ]
 *                   ^_ mid  ^
 *                           |        
 *               ONLY THIS AREA IS DECENDING
 *  other wise 1 , 2 is acending , and 3,4,5,6,7 is also accending
 *  but 7 , 0 is decending;
 * 
 * when we can find pivot :
 * 
 *   --> case 1: ( mid > mid + 1 ) then ans = mid + 1 
 *      
     --> case 2: ( mid < mid - 1 ) (ex : if mid is at 0) then ans  = mid -1 ;
   
     --> case 3: ( arr[start] >= arr[mid] ) suppose start is >= mid like {6 , 7 , 0 , 1 , 2 , 3 , 4 ,5}
                                                                         ^_start     ^_mid
            
            so , in this case all the elemnt after mid will be smaller then start , so we can igrone it .
            so , we will move the end : 
                                    end = mid - 1;
   
     --> case 4: ( arr[start] <= arr[mid] ) ex: { 2 , 3 , 4 , 5 , 6 , 7 , 0 , 1 }
                                                ^_start     ^_mid
        
        then all the elements before mid will be smaller then after mid elemnt , where the pivot is avaialbele
        so ,   we will move the start :
                                    start = mid + 1;
 *             
 */

public class Search_in_Rotated_Sorted_Array {

    public static void solve() {
        int[] arr = { 1, 3, 4, 5, 6, 8 };
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

    static int pivot(int[] arr) {
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
