package com.vastika.firsthw;

public class Predict {
		   // swap() doesn't swap i and j 
		   public static void swap(Integer i, Integer j)  
		   { 
		     int  temp =i; 
		      i = j; 
		      j = temp; 
		      System.out.println(i +" and "+j);
		   } 
		   public static void main(String[] args)  
		   { 
		      Integer i = 10; 
		      Integer j = 20; 
		      int k =j;
		      System.out.println(k);
		      swap(i, j); 
		      System.out.println("i = " + i + ", j = " + j); 
		   } 
		} 


