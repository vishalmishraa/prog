package javaprog.DSA.Hash.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleCHARhash {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] hashh = new int[123];
        Arrays.fill(hashh, 0);
        for (int i = 0; i < str.length(); i++) {
            hashh[str.charAt(i)]++;
        }

        int q = sc.nextInt();
        while (q > 0) {
            String n = sc.next();
            System.out.println(hashh[n.charAt(0)]);
            q--;
        }
        sc.close();

    }
}
