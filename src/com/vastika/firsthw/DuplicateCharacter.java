package com.vastika.firsthw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
	static void charCount(String str) {  //
		String string =str.toLowerCase(); //change to lowercase
	Map<Character,Integer> map = new HashMap<>(); //new empty map to insert each char and values
	char[] charArray = string.toCharArray(); //change to array
	for(char c:charArray) {  //loop  to go thru iteration of array
		if(map.containsKey(c)) { //first character go to else to put into map
			                    //if repeated go to IF to add existing value+1
			map.put(c, map.get(c)+1);
		}
		else
			map.put(c, 1);
	}
	Set<Character> charSet = map.keySet();
	System.out.println("Duplicate words are :");
	for(char ch:charSet) {
		if(map.get(ch)>1) {
			System.out.println(ch+" :"+map.get(ch));
		}
	}
	
	}
	

	public static void main(String[] args) {
		charCount("Rajendra");
		

	}

}
