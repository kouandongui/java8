package fr.aboussait.lambda;

import java.util.function.Predicate;
import java.util.stream.Stream;

public interface IManagerStream {
	/**
	 * display persons
	 * 
	 * @param persons
	 */
	void displayPerson(Stream<Person> persons);

	/**
	 * 
	 * @return majors persons i.e age > 18
	 */
	Stream<Person> getMajor();

	/**
	 * 
	 * @return mineur persons i.e age < 18
	 */
	Stream<Person>  getMineur();
	
	
	Stream<Person> getAll();
	
	Person   getMinimum();
	
	Person   getMaximum();
	
	Stream<Person>  getSequencePredicat();

	Stream<Person>  initStream();
	
	int getSommeAge();
	
 
}
