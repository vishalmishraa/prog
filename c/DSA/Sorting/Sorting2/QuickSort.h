#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

/*
    As in mergeSort() : timeComplexity : O(n logn)
                        SpaceComplexity: O(n) : as it uses
                                                the temp array in merging
                        but in QuickSort() it doesnt uses an extra temp array
                        so spaceComplexity : O(1);


    Steps for quickSort :
                            1. pick a pivot element in an array and place
                                it is correct place in the sorted array.pivot can be
                                any element of an array . it can be :
                                (a). 1st element
                                (b). last element
                                (c). middle element
                                (d). random element

                            so , we are follwing the (a) rule.
                            pick that element and place it in correct place in sorted array
                            as end every element at its correct place , so array wil be sorted

                            2. smaller on the left and larger on the right of pivot.repeat this step
                                again and again.

    How to code this :
*/



inline int partition(vector<int> &arr, int low, int high)
{
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j)
    {
        while (arr[i] <= pivot && i <= high - 1)
        {
            i++;
        }

        while (arr[j] > pivot && j >= low + 1)
        {
            j--;
        }

        if (i < j)
            swap(arr[i],arr[j]);
    }
    swap(arr[low],arr[j]);
    return j;
}

inline void QuickSort(vector<int> &arr, int low, int high)
{
    if (low < high)
    {
        int pivot = partition(arr, low, high);
        QuickSort(arr, low, pivot - 1);
        QuickSort(arr, pivot + 1, high);
    }
}

inline void solve()
{
    int n;
    cin >> n;
    vector<int> arr;
    arr.resize(n); // Set the default size of the vector to n
    for (auto &i : arr)
        cin >> i;
    QuickSort(arr, 0, n - 1);
    for (auto &i : arr)
        cout << i << " ";
}

#endif