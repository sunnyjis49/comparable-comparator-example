package com.sun;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		List<Person> pList = p.getPersonList();
		System.out.println("pList: "+pList);
		Comparator<Person> sortByName = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Comparator<Person> sortByAge = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge()-o1.getAge();
			}
		};
		
		Collections.sort(pList, sortByName);
		System.out.println("sortByName: "+pList);
		Collections.sort(pList, sortByAge);
		System.out.println("sortByAge: "+pList);
		
		Collections.sort(pList);
		System.out.println("SortByComparable: "+pList);
	}

}
