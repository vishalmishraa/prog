package javaprog.DSA.Hash.HashhMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class UsingIntHashMap {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key);// fetch from map

            freq++;
            mp.put(key, freq);// insert in map
        }
        // in c++
        /*
         * 
         * map<int, int> mp;
         * for (int i = 0; i < n; i++) {
         * mp[arr[i]]++;
         * }
         */

        // ierarate in map

        int q = sc.nextInt();
        while (q > 0) {
            int n = sc.nextInt();
            System.out.println(mp.get(n));// return freq;
            q--;
        }
        sc.close();

        // Iterate over the map:

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        // for c++
        /*
         * for(auto it : mp){
         * cout<< it.first << " -> "<< it.second;
         * }
         * 
         * it.first return the key value of the data
         * 
         */

        // if we know the freq and
        // want to know the key value of that freq then we can use this

        /*
         * To find a key from a value in a HashMap in Java, you would need to iterate
         * over the map and check each entry. HashMaps are not designed to fetch a key
         * by its value, so there's no direct method to do this. Here's how you can do
         * it:
         */

        int targetFrequency = 3; // The frequency you're looking for whic is 1
        Integer targetKey = null;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue().equals(targetFrequency)) {
                targetKey = entry.getKey();
                break;
            }
        }

        if (targetKey != null) {
            System.out.println("The key with a frequency of " + targetFrequency + " is " + targetKey);
        } else {
            System.out.println("No key found with a frequency of " + targetFrequency);
        }

        /*
         * This code iterates over each entry in the map. If it finds an entry with a
         * value equal to targetFrequency, it stores the key of that entry in targetKey
         * and breaks the loop. If no such entry is found, targetKey remains null.
         * 
         * " Please note that if there are multiple keys with the same frequency, this
         * code will only find the first one. " If you need to find all keys with a
         * certain frequency, you would need to modify this code to store all matching
         * keys, perhaps in a list.
         */

    }
}
