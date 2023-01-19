package com.learning.leet_code.easy.two_sum;

public class TwoSum {

    //    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static void main(String[] args) {
        int[] nums = new int[]{-3, 4, 3, 90};
        int target = 0;
        int[] indexResult = findIndexResult(target, nums);
        for (int n : indexResult) {
            System.out.println(n);
        }
    }

    public static int[] findIndexResult(int target, int[] nums) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            int number = nums[i];
            for(int q = i + 1; q < nums.length; q++) {
                if(number + nums[q] == target) {
                    result[0] = i;
                    result[1] = q;
                    return result;
                }
            }
        }
        return result;
    }
}
