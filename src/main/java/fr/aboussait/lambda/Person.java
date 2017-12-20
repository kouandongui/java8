package fr.aboussait.lambda;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String name;
	private  int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	Comparator<Person> byAge =
			(Person p1, Person p2)->p1.getAge() - p2.getAge();
			
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
