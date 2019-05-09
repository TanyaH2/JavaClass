package com.class34;

import java.util.*;

public class TestPersonTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----One way-----");
		PersonTask person1 = new PersonTask("John ", "Snow", 32, 125000);
		person1.personDetails();
		PersonTask person2 = new PersonTask("Arya ", "Stark", 20, 97000);
		person2.personDetails();
		PersonTask person3 = new PersonTask("Daenerys ", "Targarien", 30, 130000);
		person3.personDetails();

		System.out.println();
		System.out.println("-----Second way-----");
		Map<Integer, PersonTask> personal = new HashMap<>();
		personal.put(1, new PersonTask("John ", "Snow", 32, 125000));
		personal.put(2, new PersonTask("Arya ", "Stark", 20, 97000));
		personal.put(3, new PersonTask("Daenerys ", "Targarien", 30, 130000));

		Collection<PersonTask> person = personal.values();
		for (PersonTask p : person) {
			p.personDetails();

		}
	}
}
