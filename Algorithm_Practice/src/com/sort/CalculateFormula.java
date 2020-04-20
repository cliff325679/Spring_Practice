package com.sort;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CalculateFormula {
	public static void main(String[] args) {
		/*
		 * 計算一行算式，只有加減乘除，計算等號左邊的算式，但算是中間有空白
		 * 因為沒有其他運算符號的關係，故這題不用將中綴表達式轉換為後綴表達式，直接利用Queue計算即可
		 * input "2 3 + 1 + 2 - 3 =" output 23
		*/
		
		ArrayList<String> formulas = new ArrayList<String>();
		formulas.add("23 + 1 + 2 - 24 =");
		
		ArrayList<Integer> result = execute(formulas);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<Integer> execute(ArrayList<String> formulas) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// WRITE YOU CODE HERE -START-

		// WRITE YOU CODE HERE -END-
		return result;
	}
}
