package javaprog.DSA.Array.Searching.HashSearch;

public class HashSearchTest {

    public static int hash(int key, int arraySize) {
        // Simple hash function for this example
        return key % arraySize;
    }

    public static int search(int[] sortedArray, int key) {
        int index = hash(key, sortedArray.length);

        // Linear search within the bucket at the calculated index
        for (int i = index; i < sortedArray.length; i++) {
            if (sortedArray[i] == key) {
                return i;
            } else if (sortedArray[i] > key) {
                return -1; // key cannot exist after this point in a sorted array
            }
        }
        return -1; // key not found
    }

    public static void solve() {

        int[] sortedArray = { 1, 3, 5, 7, 9 };
        int key1 = 5;
        int key2 = 8;

        int found1 = search(sortedArray, key1);
        int found2 = search(sortedArray, key2);

        System.out.println("Key " + key1 + " found? " + found1);
        System.out.println("Key " + key2 + " found? " + found2);
    }
}
