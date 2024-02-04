#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

inline void aproch1(vector<int> &arr, int n, int k){

}

inline void aproch2(vector<int> &arr, int n, int k){

}

inline void solve()
{
    int n, k;
    vector<int> arr;
    arr.resize(n); // Set the default size of the vector to n
    for (auto &i : arr)
        cin >> i;
    int aproch;
    cin >> k;
    cin >> aproch;
    if (aproch == 1)
    {
        aproch1(arr, n, k);
    }
    else
    {
        aproch2(arr, n, k);
    }
    for (auto i : arr)
    {
        cout << i << " ";
    }
}

#endif