#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

void SelectionSort(int arr[5])
{
    for (int i = 0; i < 5 - 1; i++)
    {
        // 5 4 3 2 1
        int mini = i;
        for (int j = i + 1; j < 5; j++)
        {
            // select the minimum one
            if (arr[j] < arr[mini])
                mini = j;
        }
        // then swap it with

        // store minm elment in temo
        int temp = arr[mini];
        // now store bigger one on minimum place
        arr[mini] = arr[i];
        // store minimum one on there place
        arr[i] = temp;
    }
}

inline void solve()
{
    // get the minimum then swap it
    int arr[5] = {5, 4, 3, 2, 1};
    SelectionSort(arr);
    for (auto i : arr)
        cout << i << " ";
}

#endif