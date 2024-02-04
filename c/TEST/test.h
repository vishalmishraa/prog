#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
// #include <iostream>
// #include <vector>
using namespace std;

inline void Reverse(vector<int> &arr,int start,int end)
{
    while(start<end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

inline void RotateArray(vector<int> &arr,int dir,int Npos)
{

    if(dir==-1)
    {
        //left rotate
        Reverse(arr,0,Npos-1);
        Reverse(arr,Npos,arr.size()-1);
        Reverse(arr,0,arr.size()-1);

    }
    else
    {
        Reverse(arr,0,arr.size()-1);
        Reverse(arr,0,Npos-1);
        Reverse(arr,Npos,arr.size()-1);
    }
}

inline void solve()
{
    int size;
    cin>>size;
    vector<int> arr(size);
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }

 
    int dir;
    cin>>dir;

    int Npos;
    cin>>Npos;

    RotateArray(arr,dir,Npos);

    //print the array
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
}

#endif