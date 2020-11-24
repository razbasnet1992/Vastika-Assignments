package com.vastika.firsthw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateLetter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string :");
		String string = scanner.next();
		char [] c = string.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
  for(char character:map.keySet()) {
	  if(map.get(character)>1) {
		  
		  System.out.println(character+" :"+map.get(character));
	  }
	 
	  
  }
	}

}
