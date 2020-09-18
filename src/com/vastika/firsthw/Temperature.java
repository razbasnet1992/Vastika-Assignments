package com.vastika.firsthw;

import java.util.Scanner;

public class Temperature {
	public static void main(String...args) {
		Temperature temp = new Temperature();
		temp.celciusToF();
		temp.FahrenheitToC();
	}
	
	Scanner sc = new Scanner(System.in);
     void celciusToF() {
	  System.out.print("Enter temperature to convert :");
	  double c = sc.nextDouble();
	  double f = ((9.0/5.0)*c + 32);
	  
	  System.out.printf(c +" degree celcius is equal to "+"%.2f\n",f);
	  
  }
     void FahrenheitToC() {
   	  System.out.print("Enter temperature to convert :");
   	  double f = sc.nextDouble();
   	  double c = (f-32)*5.0/9.0;
   	  System.out.printf(f +" degree fahrenheit is equal to "+"%.2f\n",c);
     }
}
