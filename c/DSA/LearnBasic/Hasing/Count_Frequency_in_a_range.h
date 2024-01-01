#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <iostream>
#include "map"
using namespace std;

inline void solve()
{
    int n, m;
    cin >> n >> m;
    int arr[n];


    map<int,int> mp;
    for (int i = 0; i < n; i++)
    {
        /* code */
        cin >> arr[i];
        mp[arr[i]]++;
    }

    for (int i = 1; i <= n; i++)
    {
        cout<<mp[i]<<" ";
    }
    




}

#endif