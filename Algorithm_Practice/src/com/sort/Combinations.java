package com.sort;

import java.util.ArrayList;

public class Combinations {
	public static void main(String[] args) {
		/*
		 * �L�X�Ҧ��զX ex: A,B,C,D
		 * �i�H�L�X:A,B,AB,C,AC,BC,ABC,D,AD,BD,ABD,CD,ACD,BCD,ABCD
		*/
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		
		ArrayList<String> result = execute(strings);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<String> execute(ArrayList<String> strings) {
		ArrayList<String> result = new ArrayList<String>();
		// WRITE YOU CODE HERE -START-
		
		String str="";
		for(int i=0;i<strings.size();i++)
		{
			arr(i,strings.get(i),strings,result);
		}
		

			// WRITE YOU CODE HERE -END-
			
		
		
		return result;
	}
	
	static ArrayList<String> arr(int i, String arr, ArrayList<String> strings,  ArrayList<String> result)
	{
		if(arr.length()==strings.size())
		{
			result.add(arr);
			return result;
		}
		
		result.add(arr);
		for(int j=i+1;j<strings.size();j++)
		{
			arr(j,arr+strings.get(j),strings,result);
		}
		
		return result;
	}

}