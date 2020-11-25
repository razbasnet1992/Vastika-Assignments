package com.vastika.firsthw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence :");
		String string = scanner.nextLine();
		String [] words = string.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String w:words) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}
			else
				map.put(w, 1);
		}
  for(String w:map.keySet()) {
	  if(map.get(w)>1) {
		  
		  System.out.println(w+" :"+map.get(w));
	  }
	 
	  
  }
	}

}
