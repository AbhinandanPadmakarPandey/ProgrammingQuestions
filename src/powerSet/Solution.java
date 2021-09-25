package powerSet;

import java.util.Scanner;

public class Solution {
    private static void printPowerSet(int[] arr) {
        int size = arr.length;
        long powerSetSize = (long)Math.pow(2, size);
        for (int count = 0; count < powerSetSize; count++) {
            for (int i = 0; i < size; i++) {
                /*
                 * Find which bit is set, we use bit masking and the mask is (i << i).
                 * We perform bitwise and operation with the count.
                 */
                if ((count & (1 << i)) > 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printPowerSet(arr);
    }
}
