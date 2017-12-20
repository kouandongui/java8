package fr.aboussait.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ManagerStream extends ManagerBaseImpl implements IManagerStream{

	public void displayPerson(Stream<Person> persons) {
		persons.forEach( p->System.out.println(p));
	}

	public Stream <Person>  getMajor() {
		return getAll().filter(p->p.getAge()>18);
	}

	public Stream<Person>  getMineur() {
		Stream<Person>  select =  getAll().filter(p->p.getAge()<18 );
		return select;
	}

	public Stream<Person> getAll() {
		Stream<Person> personstrm =  findAll().stream();
		return personstrm;
	}

	@Override
	public Person getMinimum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getMaximum() {
		return null;
	}

	@Override
	public Stream<Person>  getSequencePredicat() {
		// TODO Auto-generated method stub
		Predicate<Person> min  = p->p.getAge()<18;
		Predicate<Person> ado  = p->p.getAge()<15;
		Predicate<Person> souche  = p->p.getName().length()>3;
		Predicate<Person> accepted = min.and(ado).and(souche);
		return getAll().filter(accepted);
	}

	@Override
	public Stream<Person> initStream() {
		 Stream <Person>  persons = Stream.of( new Person("Sylvanius", 35),new Person("Tanguy",33) );
		return persons;
	}

	@Override
	public int getSommeAge() {
		//int somme = getAll().reduce(0, (p1, p2)->  p1.getAge() + p2.getAge());
		return 0;
	}

}
