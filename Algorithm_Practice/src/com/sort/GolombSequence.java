package com.sort;

import java.util.ArrayList;

public class GolombSequence {

	public static void main(String[] args) {

		int N = 6;
		
		int result = execute(N);
		System.out.println(result);
		
	}
	
	static Integer execute(int num) {
		int result = 0;
		
		// WRITE YOU CODE HERE -START-
 
        int[] arr = new int[num+1];
		
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=num;i++)
		{
			int temp=1+arr[i-arr[arr[i-1]]];
			arr[i]=temp;
		}
		
		result = arr[num];
		
		// WRITE YOU CODE HERE -END-
		return result;
	}

}
