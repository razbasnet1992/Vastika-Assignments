package com.vastika.firsthw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;




public class HashMapToHashSet {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Raj");
		hashMap.put(2,"Basnet");
		hashMap.put(3,"Sworaj");
		hashMap.put(4,"Salu");
		System.out.println(hashMap);
		
		
		//stream API
		Set<?> setValue = hashMap.keySet().parallelStream().collect(Collectors.toSet());
		System.out.println(setValue);
		setValue.forEach(key->System.out.println(key));
		
		//map to set for keys
		Set<Integer> map = new HashSet<Integer>(hashMap.keySet());
		System.out.println(map);
		
		// map to set for values
		map.forEach(value->System.out.println(value));
		

	}

}
