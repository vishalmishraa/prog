package javaprog.DSA.Hash.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleINThash {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hashh = new int[size];
        Arrays.fill(hashh, 0);
        for(int i = 0; i<size ; i++){
            hashh[arr[i]]++;
        }

        int q = sc.nextInt();
        while (q > 0) {
            int n = sc.nextInt();
            System.out.println(hashh[n]);
            q--;
        }
        sc.close();

    }
}
