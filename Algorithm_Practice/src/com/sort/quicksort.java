package com.sort;

import java.util.ArrayList;
import java.util.List;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 fib fibonacci = new fib();
	        for(int i = 0; i < 20; i++) {
	            System.out.print(fibonacci.add(i) + " ");
	        }
	}
}

class fib{
    ArrayList<Integer> f = new ArrayList<Integer>();
    {
	   f.add(0);
	   f.add(1);
    }
    
    Integer add(int n) 
    {
    	if(n >= f.size())
    	{
    	   for(int i =f.size();i<=n;i++)
    	   {
    	      f.add(f.get(i-1)+f.get(i-2));
    	   }
    	}
    	return f.get(n);
    }
}
