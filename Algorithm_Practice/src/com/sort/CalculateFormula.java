package com.sort;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CalculateFormula {
	public static void main(String[] args) {
		/*
		 * �p��@��⦡�A�u���[����A�p�ⵥ�����䪺�⦡�A����O�������ť�
		 * �]���S����L�B��Ÿ������Y�A�G�o�D���αN�����F���ഫ������F���A�����Q��Queue�p��Y�i
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
