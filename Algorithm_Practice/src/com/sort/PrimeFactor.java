package com.sort;

public class PrimeFactor {
	public static void main(String[] args) {

		int[] nums = {600};
		
		String result = execute(nums);
		System.out.println(result);
		
	}
	
	static String execute(int[] nums) {
		String result = "";
		
		// WRITE YOU CODE HERE -START-

		int num=nums[0];
		int count=0;
		
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				num=num/i;
				count++;
			}
			
			if(count!=0)
			{
				result+=i+"^"+count+"+";
				count=0;
			}
		}

		result = result.substring(0,result.length()-1);
		// WRITE YOU CODE HERE -END-
		return result;
	}
}
