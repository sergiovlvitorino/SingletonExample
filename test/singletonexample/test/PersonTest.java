package singletonexample.test;

import singletonexample.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase{

	public void testIfReturnIsNotNull(){
		assertNotNull(Person.getInstance());
	}
	
	public void testIfThereIsOnlyOneInstanceOfPerson(){
		Person person1 = Person.getInstance();
		Person person2 = Person.getInstance();
		assertTrue( person1 == person2 );
	}
	
}
