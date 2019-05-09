package com.class33;

import java.util.LinkedHashMap;
import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> classroomMap= new LinkedHashMap<>();
		classroomMap.put("Table",20);   //Entry  <Key, Value>
		classroomMap.put("Chairs",60);//Entry <String, Integer>
		classroomMap.put("Screen",3);
		classroomMap.put("Student", 33);
		classroomMap.put("Instructor", 4);
		
		System.out.println( );
       
		System.out.println(classroomMap);
		System.out.println( );
		System.out.println(classroomMap.entrySet());
		System.out.println();
		 // one way
		for(Map.Entry<String, Integer> entry:classroomMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println( );
		//another way
		Iterator<Map.Entry<String, Integer>>classRoomIterator=classroomMap.entrySet().iterator();		
		while(classRoomIterator.hasNext()) {
			Map.Entry<String, Integer> me=classRoomIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
		

		
		
	}

}
