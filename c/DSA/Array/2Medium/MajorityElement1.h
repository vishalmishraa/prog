#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

int majorityElement1(vector<int> v)
{
    // Write your code here
    unordered_map<int, int> mp;
    int min = int(v.size() / 2);
    int ans;

    for (int i = 0; i < v.size(); i++)
    {
        mp[v[i]]++;
        if (mp[v[i]] > min)
        {
            ans = (v[i]);
        }
    }
    return ans;
}

// more better solution with less space complexity
// MOORS ALGORITHM
int majorityElement1_s(vector<int> v)
{
    int el = 0;
    int cnt = 0;
    for (int i = 0; i < v.size(); i++)
    {
        /* code */

        if (cnt == 0)
        {
            el = v[i];
            cnt = 1;
        }
        else if (v[i] == el)
        {
            cnt++;
        }
        else
        {
            cnt--;
        }
    }
    int cnt1 = 0;
    for (auto i : v)
    {
        if (i == el)
        {
            cnt1++;
        }
    }

    if (cnt1 > (v.size() / 2))
        return el;

    return -1;
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

    cout << majorityElement1_s(vv);
}

#endif