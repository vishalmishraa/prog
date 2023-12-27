package javaprog.DSA.Array.Searching.BInarySearch.KunalKushwaha;

//similear to search in rotated array 
//we are gosing to find pivot , which is lasrgest elemnt , that is end of the rotation
//the postion of pivot (element + 1) will be the number of rotation

public abstract class countRotation {
    public static int solve(int[] arr) {
        // we can say that where the pivot element will be ,
        // there will be end of rptation
        // so pivot + 1 will be the number of rotation
        return ((pivot.Search(arr)) + 1);
    }

}
