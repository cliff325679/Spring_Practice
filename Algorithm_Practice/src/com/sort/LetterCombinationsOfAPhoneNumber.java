package com.sort;

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {
	
	public static void main(String[] args) {
		/*
		 * 找到手機按鍵輸入的所有組合，類似LeetCode的第17題
		 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
		 */
		String input = "79";
		                               //0  1   2      3       4     5      6       7     8       9
		String [] combinationsInKeys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		ArrayList<String> result = execute(combinationsInKeys, input);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<String> execute(String[] combinationsInKeys, String input) {
		ArrayList<String> result = new ArrayList<String>();
		
		// WRITE YOU CODE HERE -START-
		result= findCombin( result, combinationsInKeys, input,  0, "");
		// WRITE YOU CODE HERE -END-
		
		return result;
	}
	
	static ArrayList<String> findCombin(ArrayList res, String[] combinationsInKeys, String input, int start, String temp)
	{
		if(start==input.length())
		{
			res.add(temp);
			return res;
		}
	
		char c = input.charAt(start);
		int index = Character.getNumericValue(c);
		for(int i=0;i<combinationsInKeys[index].length();i++)
		{
			findCombin( res, combinationsInKeys,  input,  start+1,  temp+combinationsInKeys[index].charAt(i));
		}
		return res;
	}
}
