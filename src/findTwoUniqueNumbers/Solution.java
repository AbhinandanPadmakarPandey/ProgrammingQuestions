/*
 * Created by: Abhinandan Padmakar Pandey
 * Date: 17th September 2021
 * Time: 4:02 pm
 */

package findTwoUniqueNumbers;

import java.util.Scanner;

public class Solution {
    public static void uniqueNumbers(int[] arr) {
        int res = 0;
        for(int i : arr) {
            res ^= i;
        }
        res &= -(res);
        int sum1 = 0;
        int sum2 = 0;

        for(int i : arr) {
            if((i & res) > 0) {
                sum1 ^= i;
            } else {
                sum2 ^= i;
            }
        }

        System.out.println(sum1 + " " + sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        uniqueNumbers(arr);
    }
}
