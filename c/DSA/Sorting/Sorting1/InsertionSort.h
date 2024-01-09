#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;
/*
    Take a element and place it in its correct position

    TIME COMPLEXITY :
    worst : o(n^2)
    best : O(n)

*/

void InsertionSort(int arr[], int n)
{
    for (int i = 0; i <= n-1; i++)
    {
        /* code */
        int j = i;
        while (j>0 && arr[j-1]>arr[j] )
        {
            /* code */
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp; 

            j--;
        }
        
    }
    
}

inline void solve()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    InsertionSort(arr, n);
    for (auto i : arr)
        cout << i << " ";
}

#endif