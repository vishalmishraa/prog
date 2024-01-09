package javaprog.DSA.Array.Searching;

import java.util.HashMap;
import java.util.Scanner;

public class HAsgg {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
          
            mp.put(arr[i], (i));

        }
        System.out.println(mp.get(33));

        sc.close();

    }
}
