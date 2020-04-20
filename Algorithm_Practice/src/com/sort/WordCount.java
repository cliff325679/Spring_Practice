package com.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WordCount {
	public static void main(String[] args) {
		/*
		 * ���w�@�q�u��A�L�X�b�u�夤�X�{�Ĥ@�h�P�ĤG�h����r ex: I have a pen, I have a apple�A�����]�t�S��Ÿ��H�μƦr
		 * �j�p�g�����ۦP
		 * �L�X
		 * i(2)
		 * have(2)
		 * a(2)
		 * pen(1)
		 * apple(1)
		*/
		
		String paragraph = "Wikileaks began on Sunday November 28th publishing 251,287 leaked United States embassy cables, the largest set of confidential documents ever to be released into the public domain. The documents will give people around the world an unprecedented insight into US Government foreign activities."
				  + "The cables, which date from 1966 up until the end of February this year, contain confidential communications between 274 embassies in countries throughout the world and the State Department in Washington DC. 15,652 of the cables are classified Secret."
				  + "The embassy cables will be released in stages over the next few months. The subject matter of these cables is of such importance, and the geographical spread so broad, that to do otherwise would not do this material justice.";
		ArrayList<String> result = execute(paragraph);
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}
	
	static ArrayList<String> execute(String paragraph) {
		ArrayList<String> result = new ArrayList<String>();
		
		// WRITE YOU CODE HERE -START-

		paragraph=paragraph.replaceAll("[^a-z]", " ");
		
		String[] str = paragraph.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			String key=str[i];
			
			if(key.length() == 0)
			{
				continue;
			}
			
			if(map.containsKey(key))
			{
			  map.put(key, map.get(key)+1);
			}
			else
			{
				map.put(key, 1);
			}
		}
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			String key= iter.next();
			int count = map.get(key);
			result.add(key+"("+count+")");
		}
		
		// WRITE YOU CODE HERE -END-
		return result;
	}
}
