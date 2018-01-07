package me.renu.person.service;

import java.util.Map;
import java.util.UUID;

import me.renu.person.model.Person;

public class PersonService {
	
	private Map<String,Person> personMap;
	
	public PersonService(Map<String, Person> personMap) {
		
		this.personMap = personMap ;
	}
	
	public String add(Person person) {
		
		person.setId(UUID.randomUUID().toString()); 
		personMap.put(person.getId(),person);
		return person.getId();
	}
	
	public Person get(String id)
	{
		if (personMap.containsKey(id)) {
			
			return personMap.get(id) ;
		}
		else {
			
			//TODO throw exception
			return null ;
		}
	}
	
	public void update(Person person)
	{
		String id = person.getId();
		
		if (personMap.containsKey(id)) {
			
			personMap.put(id, person) ;
		}
		else {
			
			//TODO exception
		}
	}
	
	public void delete(String id)
	{
		if (personMap.containsKey(id)) {
			
			personMap.remove(id) ;
		}
		else {
			
			//TODO exception
		}
	}
}
