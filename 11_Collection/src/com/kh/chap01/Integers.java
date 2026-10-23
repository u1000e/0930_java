package com.kh.chap01;

import java.util.Arrays;

public class Integers {
	private int[] nums;
	private int size;
	
	public Integers() {
		nums = new int[3];
	}
	
	public void add(int e) {
		if(nums.length == size + 1) {
			nums = Arrays.copyOf(nums, (nums.length * 2));
		}
		nums[size++] = e;
	}
	
	public int get(int i) {
		return nums[i];
	}
	
	@Override
	public String toString() {
		if(nums == null) {
			return "null";
		}
		int max = nums.length - 1;
		if(max == -1) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < size; i++) {
			sb.append(nums[i]);
			if(i + 1 == size) {
				return sb.append("]").toString();
			}
			sb.append(", ");
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
