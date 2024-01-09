#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

//basically array is getting sorted during merge
void Merge(vector<int> &arr, int low, int mid, int high)
{
    vector<int> temp;

    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high)
    {
        if (arr[left] <= arr[right])
        {
            temp.push_back(arr[left]);
            left++;
        }
        else
        {
            temp.push_back(arr[right]);
            right++;
        }
    }

    //if element left in left side
    while (left <= mid)
    {
        temp.push_back(arr[left]);
        left++;
    }

    //if element is left in right side
    while (right <= high)
    {
        temp.push_back(arr[right]);
        right++;
    }

    //sorting completed abobe , fillingf the sorted array in main array
    for (int i = low; i <= high; i++)
    {
        arr[i] = temp[i - low];
    }
}

void MergeSort(vector<int> &arr, int low, int high)
{
    if (low >= high)
        return;
    int mid = (low + high) / 2;
    MergeSort(arr, low, mid);
    MergeSort(arr, mid + 1, high);
    Merge(arr, low, mid, high);
}

inline void solve()
{
    int n;
    cin >> n;
    vector<int> arr;
    arr.resize(n); // Set the default size of the vector to n
    for (auto &i : arr)
        cin >> i;
    MergeSort(arr, 0, n - 1);
    for (auto &i : arr)
        cout << i << " ";
}

#endif