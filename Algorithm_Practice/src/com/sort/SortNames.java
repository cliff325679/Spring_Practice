package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames {
	public static void main(String[] args) {
		/*
		 * �ﵹ�w���W�r���Ӧr���j�p�ӱƧǡA�Y�Ĥ@�Ӧr���ۦP�h�ƧǲĤG�Ӧr���A�H������
		*/
		
		String[] names = {"Ace", "Kitty", "David", "Alice"};
		
		ArrayList<String> result = execute(names);

		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<String> execute(String[] names) {
		ArrayList<String> result = new ArrayList<String>();
		
		// WRITE YOU CODE HERE -START-

		for(int i=0;i<names.length;i++)
		{
			String str = names[i]; 
			int j;
			for(j=i-1;j>=0&&names[j].compareTo(str)>0;j--)
			{
			      names[j+1]=names[j];
			}
			names[j+1]=str;
		}
		
		for(int i =0;i<names.length;i++)
		{
			result.add(names[i]);
		}
		// WRITE YOU CODE HERE -END-
		return result;
	}
}