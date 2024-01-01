#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H
/*
    return the first non repeted char in a string
    example : abccaddfgg
    return : a (or index of a)
*/
#include <iostream>
#include "string"
#include "map"
using namespace std;

inline void solve()
{
    string str;
    cin >> str;

    map<char, int> mp;
    for (int i = 0; i < str.size(); i++)
    {
        mp[str[i]]++;
    }
    char c;
    for (auto it : mp)
    {
        if (it.second == 1)
        {
            c = it.first;
            break;
        }
    }

    for (int i = 0; i < str.size(); i++)
    {
        if (str[i] == c)
        {
            cout << i;
            exit(0);
        }
    }
    cout << -1;
}

#endif