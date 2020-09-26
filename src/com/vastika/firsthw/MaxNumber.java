package com.vastika.firsthw;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
	public static void main(String...args) {
		int x =2;
		int y =10;
		int z =5;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(1);
		list.add(5);
		
		
		//if else 
       if(x>y && x>z) {
    	   System.out.println(x+" is greater than "+y+" and "+z);
       }
       else if(y>z) {
    	   System.out.println(y+" is greater than "+x+" and "+z);
       }
       else
    	   System.out.println(z+" is the greatest number");
       
       
       //with Stream api
       
       int maxNumber = list.stream().reduce(Integer.MIN_VALUE,(a, b)->Integer.max(a,b));
       System.out.println("Using stream API :"+maxNumber);
       
       //Ternery Operator
       String r =(x>y && x>z)? x+" is greater than "+y+" and "+z
    		   :(y>z)? y+" is greater than "+x+" and "+z
    				   :z+" is the greatest number";
       System.out.println("Using ternery operator :"+r);

	}
	
	
}
