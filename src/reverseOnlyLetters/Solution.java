/*
 * Created by: Abhinandan Padmakar Pandey
 * Date: 14th September 2021
 * Time: 7:10 pm
 */

package reverseOnlyLetters;

import java.util.Scanner;

public class Solution {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] >= 65 && arr[start] <= 90 || arr[start] >= 97 && arr[start] <= 122) {
                if (arr[end] >= 65 && arr[end] <= 90 || arr[end] >= 97 && arr[end] <= 122) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    end--;
                } else {
                    end--;
                    continue;
                }
                start++;
            } else {
                start++;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseOnlyLetters(str));
    }
}

/*
 * public String reverseOnlyLetters(String s) {
 *         char[] str = s.toCharArray();
 *         int low = 0, high = str.length-1;
 *         while(low < high){
 *             if (Character.isLetter(str[low]) && Character.isLetter(str[high])) {
 *                 char temp = str[low];
 *                 str[low] = str[high];
 *                 str[high] = temp;
 *                 low++;
 *                 high--;
 *             } else if (!Character.isLetter(str[low])) {
 *                 low++;
 *             } else if (!Character.isLetter(str[high]))
 * {
 *                 high--;
 *             }
 *         }
 *         return String.valueOf(str);
 *     }
 */
