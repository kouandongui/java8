package fr.aboussait.lambda;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerBaseImpl implements IManagerBase {
	/*
	 * (non-Javadoc)
	 * @see fr.aboussait.lambda.IManager#findAll()
	 */
	public List<Person> findAll() {
		Person p1 = new Person("Thomas", 25);
		Person p2 = new Person("Luc", 33);
		Person p3 = new Person("Serge", 13);
		Person p4 = new Person("André", 50);
		Person p5 = new Person("Yves", 14);
		// instance 
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		return list;
	}

}
