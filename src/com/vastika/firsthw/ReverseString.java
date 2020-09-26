package com.vastika.firsthw;

import java.util.Scanner;


//multi comment ctlr+shift+/
//remove comment ctlr+shift+/
//single comment: ctlr+/
public class ReverseString {
    public static void main(String... args){
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter string :");
    	String str = scanner.nextLine();
        reverse(str);
        char[] input = str.toCharArray();
    }

    private static void reverse(String str) {
        if(str.length() == 1) {
        	System.out.println("its null");
           }
        {
        	StringBuilder strbuilder = new StringBuilder(str);
        	
      System.out.println(strbuilder.reverse().toString());
        	 
        }
       
    }
}
