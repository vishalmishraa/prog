
// https://leetcode.com/problems/find-in-mountain-array/description/

/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */

#include "iostream"
#include "vector"
using namespace std;

int BinaryS(vector<int> arr, int target, int start, int end)
{
    while (start <= end)
    {
        int mid = start + (end - start) / 2;

        if (target > arr[mid])
        {
            start = mid + 1;
        }
        else if (target < arr[mid])
        {
            end = mid - 1;
        }
        else
        {
            return mid;
        }
    }
    return -1;
}

int peak(vector<int> arr)
{
    int start = 0;
    int end = arr.size() - 1;
    while (start < end)
    {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1])
        {
            end = mid;
        }
        else
        {
            start = mid + 1;
        }
    }
    return start;
}

int findInMountainArray(int target, vector<int> arr)
{
    int end = peak(arr);
    int start = 0;

    if (arr.size() > 3 && end > 3)
    {
        int result = BinaryS(arr, target, start, end);
        if (result >= 0)
        {
            return result;
        }
        else
        {
            return BinaryS(arr, target, end + 1, arr.size() - 1);
        }
    }
    else
    {

        for (int i = 0; i < arr.size(); i++)
        {
            if (target == arr[i])
                return i;
        }
    }

    return -1;
}

int main(int argc, const char **argv)
{

    vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    cout << findInMountainArray(1, arr);

    return 0;
}
