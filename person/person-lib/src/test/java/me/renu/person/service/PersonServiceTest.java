package me.renu.person.service;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;
import me.renu.person.model.Person;

public class PersonServiceTest {
	
	private Map<String, Person> testMap = new HashMap<>() ;
	
	private PersonService personService = new PersonService(testMap) ;
	
	@Before
	public void setup() {
		
		testMap.clear() ;
	}

	@Test
	public void addShouldPersistToRepository() {
		
		final Person person = createPerson() ;
		final String id = personService.add(person) ;
		
		assertEquals(person, testMap.get(id)) ;
	}
	
	@Test
	public void getShouldReturnPerson() {
		
		final Person person = createPerson() ;
		testMap.put("x", person) ;
		
		final Person result = personService.get("x") ;
		
		assertEquals(person, result) ;
	}
	
	@Test
    public void testUpdate() {
	
		//TODO
	}

    @Test
    public void testDelete() {
	
    	//TODO
	}
	
	private Person createPerson() {
		
		final Person person = new Person() ;
		person.setFirstName("Renuka") ;
		person.setLastName("Chakraborty") ;
		
		return person ;
	}
}