package com.vastika.firsthw;

public class Predict {
		   // swap() doesn't swap i and j 
		   public static int swap(Integer i, Integer j)  
		   { 
		     int  temp =i; 
		      i = j; 
		      j = temp; 
		      return j &i;
		      
		   } 
		   public static void main(String[] args)  
		   { 
		      Integer i = 10; 
		      Integer j = 20; 
		      
		      
		      swap(i, j); 
		      System.out.println("i = " + i + ", j = " + j); 
		   } 
		} 


