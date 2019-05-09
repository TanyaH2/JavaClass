package com.class33;
import java.util.*;
/*
 * Create a map of a building. Store floor number and it is associated company name. 
 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class MapTask {
	public static void main(String[] args) {
	
	Map<Integer, String> building= new HashMap<>();
	
	building.put(1,"Google");
	building.put(2,"Syntax");
	building.put(3,"Ebay");
	building.put(4,"Amazon");
	building.put(4,"Amazon");
	building.put(9,"Yahoo");
	building.put(6,"FaceBook");
	building.put(6,"Twitter");
	building.put(7,"Zillow");
	building.put(8,"Zillow");
	
	//printing map
	System.out.println(building);
	//Check how many entries you have?/ size
	System.out.println(building.size());
	//Update company on a 4th floor
	building.put(4,"Ebay");
	System.out.println(building);
	//Remove company on the 7th floor
	building.remove(7);
	System.out.println(building);
	//removing one of the duplicates--- NOT going to work, removes all values with same key
	building.remove(6,"Twitter");
	System.out.println(building);
	
	
	
	
	
	
	
	}
}
