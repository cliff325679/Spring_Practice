package com.sort;


public class gcd {
	public static void main(String[] args) {
		/*
		 * 找到n個數的最大公因數
		*/
		
		int[] nums = {32, 8, 16};
		
		int result = execute(nums);
		System.out.println(result);
		
	}
	
	static int execute(int[] nums) {
		int result = 0;
		
		// WRITE YOU CODE HERE -START-

		result=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			result=gcd(result,nums[i]);
		}
				
		// WRITE YOU CODE HERE -END-
		return result;
	}

	static int gcd(int a, int b)
	{
		int temp=0;
		while(a%b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		
		return b;
	}
	
}