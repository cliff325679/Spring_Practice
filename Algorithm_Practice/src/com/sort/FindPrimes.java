package com.sort;

import java.util.ArrayList;

public class FindPrimes {
	public static void main(String[] args) {
		/*
		 * 找到m~n範圍內的所有質數
		*/
		int m = 3;
		int n = 17;
		ArrayList<Integer> result = execute(m, n);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<Integer> execute(int m, int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// WRITE YOU CODE HERE -START-

		boolean flag=true;
		for(int i=m;i<=n;i++)
		{
			flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
			{
				result.add(i);
			}
		}

		// WRITE YOU CODE HERE -END-
		
		return result;
	}
}
