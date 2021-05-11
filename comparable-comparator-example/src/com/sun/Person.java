package com.sun;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author SUN
 *
 */
public class Person implements Comparable<Person>{
	private int id;
	private String name;
	private int age;
	private List<Person> personList ;
	
	
	
	public Person() {
		personList = new ArrayList<>();
		personList.add(new Person(11,"Sunny", 32));
		personList.add(new Person(33,"Raihan", 40));
		personList.add(new Person(22,"Miran", 36));
	}


	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the personList
	 */
	public List<Person> getPersonList() {
		return personList;
	}


	/**
	 * @param personList the personList to set
	 */
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", personList=" + personList + "]";
	}


	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	

}
