#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
// #include <iostream>
// #include <vector>
using namespace std;


void countingSort(vector<int> arr) {
    int max1 = *max_element(arr.begin(),arr.end());
    vector<int> ans(100,0);
    for(int i =0 ; i<arr.size();i++){
        int a  = arr[i];
        ans[a] = ans[a]+1;
    }
    for(int i = 0; i<ans.size();i++){
        cout<<ans[i]<<" ";
    }
    
}

inline void solve()
{
    
    vector<int> arr ;
    int n;
    cin>>n;
    for(int i = 0; i<n;i++){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    countingSort(arr);
    
}

#endif