#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>

using namespace std;

/*
        Find the highest/lowest frequency element

        input : 2 3 4 2 2 5 3 4
        output : 2 5
        explanation : as 2 is repeted 3 times which is highest and 5 is repeted
                        one time , which is lowest
*/

inline void solve()
{
    int arr[6];
    map<int, int> mp;

    for (int i = 0; i < 6; i++)
    {
        cin >> arr[i];
        mp[arr[i]]++;
    }

    int maxf = INT_MIN, minf = INT_MAX;
    int max, min;
    for (auto it : mp)
    {
        if (it.second > maxf){
            maxf  = it.second;
            max  = it.first;
        }

        if(it.second < minf){
            minf = it.second;
            min = it.first;
        }

    }

    cout<<max<<" "<<min;
}

#endif