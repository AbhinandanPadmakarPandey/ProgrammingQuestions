/*
 * Created by: Abhinandan Padmakar Pandey
 * Date: 17th September 2021
 * Time: 12:52 pm
 */

package findSingleElement;

import java.util.Scanner;

public class Solution {
    public static int findSingle(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res ^= i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSingle(arr));
    }
}
