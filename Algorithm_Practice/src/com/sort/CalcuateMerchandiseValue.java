package com.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Merchandise {
	public int amount;
	public int totalPrice;
	public Merchandise(int amount, int totalPrice) {
		this.amount = amount;
		this.totalPrice = totalPrice;
	}
}

public class CalcuateMerchandiseValue {
	public static void main(String[] args) {
		/* 	计秖 虫基
		 * "COMPUTER 2 1000; MEMORY 3 5000"
		 * 
		 * 块:  羆基 А基
		 * "COMPUTER 2000 1000"
		 * "MEMORY 15000 5000"
		 */
		String str = "COMPUTER 2 1000;MEMORY 3 5000";
		
		
		ArrayList<String> result = execute(str);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<String> execute(String str) {
		ArrayList<String> result = new ArrayList<String>();
		// WRITE YOU CODE HERE -START-
		HashMap<String,Merchandise> map = new HashMap<>();
		String[] str1 = str.split(";");
		
		for(int i=0;i<str1.length;i++)
		{
			String[] str2=str1[i].split(" ");
			int amount = Integer.parseInt(str2[1]);
			int price = Integer.parseInt(str2[2]);
			Merchandise mer = new Merchandise(amount,amount*price);
			map.put(str2[0],mer);
		}
		
        Iterator<String> iter = map.keySet().iterator();
        
        while(iter.hasNext())
        {
        	String key = iter.next();
        	Merchandise mer = map.get(key);
        	String temp = key+" "+mer.totalPrice+" "+mer.totalPrice/mer.amount;
        	result.add(temp);
        }
		
		// WRITE YOU CODE HERE -END-
		return result;
	}
}
