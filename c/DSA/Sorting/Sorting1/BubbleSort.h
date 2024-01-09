#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

/*

    if arr[] = {5,4,3,2,1}
    run a loop till n-1
                    n-2
                    .
                    .
                    .
                    1
    as we will compare it with arr[j] and arr[j+1]
            when (arr[j]>arr[j+1])
                        swap(arr[j], arr[j+1]);

*/

/*
    TIME COMPLEXITY

        worst & average  : O(n^2)
        Best : O(n) : check if swap happend or not , if not happen 
                    then break the loop at first time to it; so , it will run
                    only n time;


*/



void BubbleSort(int arr[],int n)
{
    for (int i = n - 1; i >= 0; i--)
    {
        /* code */
        bool swapH = false;
        for (int j = 0; j <= i-1; j++)
        {
            /* code */
            if (arr[j] >  arr[j + 1])
            {
                /* code */
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                swapH = true;
            }

        }
        //if swap not happen then break
        if(!swapH)
            break;
    }
}

inline void solve()
{
    int n ;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    BubbleSort(arr,n);
    for (auto i : arr)
        cout << i << " ";
}

#endif