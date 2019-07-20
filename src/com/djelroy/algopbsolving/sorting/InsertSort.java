package com.djelroy.algopbsolving.sorting;

public class InsertSort {

	public void sort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			insert(nums, nums[i], i);
		}
	}
	
	private void insert(int[] nums, int val, int pos) {
		int i = pos - 1;

		while(i >= 0 && val < nums[i]) {
			nums[i + 1] = nums[i];
			nums[i] = val;
			i--;
		}
	}
}
