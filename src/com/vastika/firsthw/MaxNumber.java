package com.vastika.firsthw;



public class MaxNumber {
	public static void main(String...args) {
		int x =100;
		int y =1;
		int z =5;
		
       if(x>y && x>z) {
    	   System.out.println(x+" is greater than "+y+" and "+z);
       }
       else if(y>z) {
    	   System.out.println(y+" is greater than "+x+" and "+z);
       }
       else
    	   System.out.println(z+" is the greatest number");
	}

}
