package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		
		//Testcases
//		System.out.println(Arrays.toString(sum.twoSum(new int[]{2,7,11,15}, 9)));
//		System.out.println(Arrays.toString(sum.twoSum(new int[]{3,2,3}, 6)));
//		System.out.println(Arrays.toString(sum.twoSum(new int[]{3,2,4}, 6)));
		System.out.println(Arrays.toString(sum.twoSum(new int[]{2,5,5,11}, 10)));
		System.out.println(Arrays.toString(sum.twoSum2(new int[]{2,5,5,11}, 10)));
	}

	//Brute Force
	public int[] twoSum(int[] nums, int target) {

		for(int i = 0; i <= nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				if((nums[i] + nums[j]) == target){
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
	
	//One-pass Hash Table
	public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int len = nums.length; 
        for (int i = 0; i < len; ++i) {
            if (indexMap.containsKey(target - nums[i])) {
                return new int[]{indexMap.get(target - nums[i]), i}; 
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{-1, -1}; 
    }

}
