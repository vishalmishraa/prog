#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

int i = 0, l = 0;
bool CheckPalidrome(string s, int p, int q)
{

    if (!isalnum(s[p]))
        return CheckPalidrome(s, ++i, l);
    if (!isalnum(s[q]))
        return CheckPalidrome(s, i, --l);
    if (tolower(s[p]) != tolower(s[q]))
        return false;
    if (i >= (s.size()))
        return true;
    return CheckPalidrome(s, ++i, --l);
}

bool isPalindrome(string s)
{

    //-------------------------------------------------
    l = s.size() - 1;
    if (CheckPalidrome(s, i, l))
        return true;
    return false;
}

inline void solve()
{
    string s;
    getline(cin, s);
    cout << isPalindrome(s);
}

#endif