package WeekOfSepTwelfth;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("===============reorderDigits==============");
        int[] case1 = {515, 341, 98, 44, 211};
        System.out.println("Expected/Actual: [155, 134, 89, 44, 112]; " + Arrays.toString(reorderDigits(case1, "asc")));
        System.out.println("Expected/Actual: [551, 431, 98, 44, 211]; " + Arrays.toString(reorderDigits(case1, "desc")));
        int[] case2 = {63251, 78221};
        System.out.println("Expected/Actual: [12356, 12278]; " + Arrays.toString(reorderDigits(case2, "asc")));
        System.out.println("Expected/Actual: [65321, 87221]; " + Arrays.toString(reorderDigits(case2, "desc")));
        int[] case3 = {1, 2, 3, 4};
        System.out.println("Expected/Actual: [1, 2, 3, 4]; " + Arrays.toString(reorderDigits(case3, "asc")));
        System.out.println("Expected/Actual: [1, 2, 3, 4]; " + Arrays.toString(reorderDigits(case3, "desc")));
        System.out.println();
        System.out.println("===============canPartition==============");
        int[] case4 = {2, 8, 4, 1};
        System.out.println("Expected/Actual: true; " + Boolean.toString(canPartition(case4)));
        int[] case5 = {-1, -10, 1, -2, 20};
        System.out.println("Expected/Actual: false; " + Boolean.toString(canPartition(case5)));
        int[] case6 = {-1, -20, 5, -1, -2, 2};
        System.out.println("Expected/Actual: true; " + Boolean.toString(canPartition(case6)));

    }

    /*
    a) Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.

    Examples:
    reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]

    reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]

    reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]

    reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]

    reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]

    reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

    Notes:
    Single-digit numbers should be ordered the same regardless of direction.
    Numbers in the array should be kept the same order.
    */
    public static int[] reorderDigits(int[] arr, String order) {
        int[] output = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            output[i] = reorderNum(arr[i], order);
        }
        return output;
    }

    public static int reorderNum(int num, String order) {
        String[] str = Integer.toString(num).split("");
        Arrays.sort(str);
        if (order == "desc") {
            String[] reverse = new String[str.length];
            for (int i = str.length - 1, j = 0; i >= 0; i--, j++) {
                reverse[j] = str[i];
            }
            str = reverse;
        }
 
        return Integer.parseInt(String.join("", str));
    }

    /*
    b) Write a function that returns true if you can partition an array into one element and the rest, 
    such that this element is equal to the product of all other elements excluding itself.

    Examples:
    canPartition([2, 8, 4, 1]) ➞ true
    // 8 = 2 x 4 x 1

    canPartition([-1, -10, 1, -2, 20]) ➞ false

    canPartition([-1, -20, 5, -1, -2, 2]) ➞ true

    Notes:
    The array may contain duplicates.
    Multiple solutions can exist, any solution is sufficient to return true.
    */

    public static boolean canPartition(int[] arr) {
        int largest = arr[0];
        int product = 1;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(largest)) {
                product = product * largest;
                largest = arr[i];
            } else {
                product = arr[i] * product;
            }
        }
        return product == largest;
    }
}