package com.class33;
import java.util.*;
public class MapIntro {

	public static void main(String[] args) {
		
		//Map<Key, Value>
		
		Map<Integer, String> map=new HashMap<>();
		
		//add entries(key+value)
		map.put(101,"John");
		map.put(102,"Arya");
		map.put(103,"Daenerys");
		map.put(104,"James");
		map.put(105,"Tanya");
		
		//retrieve or access values
		System.out.println(map.get(103));
		
		//how to find a size of a map
		System.out.println(map.size());
		
		// how to update
		map.replace(104,"Drogo");
		System.out.println(map.get(104));
		
		//how to remove
		map.remove(105);
		System.out.println(map.size());
		
		//how to check if there are any values in the map
		System.out.println(map.isEmpty());
		System.out.println(map);
		
		//how to check if spesific key/value is there
		System.out.println(map.containsKey(103));
		System.out.println(map.containsValue("Aryas"));
		
		//adding ney key
		map.put(107, "Tanya");
		System.out.println(map);
		
		//replace value using the same key
		map.put(103,"Khalesi");
		System.out.println(map);
		
		//adding null key with some value
		map.put(null, "Something");
		System.out.println(map);
		
		//adding null key with null value
		map.put(null, null );
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
	
	
}
