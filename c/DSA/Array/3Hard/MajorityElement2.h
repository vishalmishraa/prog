#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;
// https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/

/*
    first we need to understand how many answer it can have?
    suppose there are 16 elements in an array .
    now to for problem statement (n/3) means 5, means
    number which is repeted more then 5 time , suppose a
    number repted 6 time , another repted 6 time , now for third one
    to have reptete 6 time , the number of elemnets should be 18 , but it is 16
    so for any number of elements

    max no. ans = 2
    min no. ans = 0

    now for that we will store ans in vector;



*/

// better silution ,with large space complexity
vector<int> majorityElement2(vector<int> v)
{
    // Write your code here
    unordered_map<int, int> mp;
    vector<int> ans;
    int min = int(v.size() / 3) + 1;

    for (int i = 0; i < v.size(); i++)
    {
        mp[v[i]]++;
        if (mp[v[i]] == min)
        {
            ans.push_back(v[i]);
        }

        if (ans.size() == 2)
            break;
    }
    return ans;
}

// more better solution with less space complexity

// EXTENDED  MOORS ALGORITHM

/*


*/
vector<int> majorityElement2_s(vector<int> v)
{
    vector<int> ans;
    int min = int(v.size() / 3);
    int el1 = 0, el2 = 0;
    int cnt1 = 0, cnt2 = 0;
    for (int i = 0; i < v.size(); i++)
    {
        /* code */

        if (cnt1 == 0 && el2 != v[i])
        {
            el1 = v[i];
            cnt1 = 1;
        }
        else if (cnt2 == 0 && el1 != v[i])
        {
            el2 = v[i];
            cnt2 = 1;
        }
        else if (v[i] == el1)
        {
            cnt1++;
        }
        else if (v[i] == el2)
        {
            cnt2++;
        }
        else
        {
            cnt1--;
            cnt2--;
        }
    }
    int cnt11 = 0, cnt22 = 0;
    for (auto i : v)
    {
        if (i == el1)
        {
            cnt11++;
        }
        if (i == el2)
            cnt22++;
    }

    if (cnt11 > min)
        ans.push_back(el1);

    if (cnt22 > min)
        ans.push_back(el2);

    return ans;
}

inline void solve()
{
    int n;
    cin >> n;

    vector<int> vv;
    for (int i = 0; i < n; i++)
    {
        /* code */
        int m;
        cin >> m;
        vv.push_back(m);
    }

    vector<int> ans = majorityElement2_s(vv);
    for (auto i : ans)
        cout << i << " ";
}

#endif