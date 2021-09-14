/*
 * Created by: Abhinandan Padmakar Pandey
 * Date: 14th September 2021
 * Time: 3:15 pm
 */

package maximumProductofThreeNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int maximumProductOfThreeNumbers(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        return Math.max(arr[n-1] * arr[n-2] * arr[n-3], arr[0] * arr[1] * arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumProductOfThreeNumbers(nums));
    }
}
