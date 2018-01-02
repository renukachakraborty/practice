package me.renu.person.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import me.renu.person.model.Person;

public class PersonService {
	
	private Map<String,Person> personMap = new HashMap<>(); 
	
	
	public void add(Person newPerson) {
		newPerson.setId(UUID.randomUUID().toString());
		personMap.put(newPerson.getId(),newPerson);
	}
	
	public Person get(String id)
	{
		return personMap.get(id);
	}
	
	public void update(String id, Person newPerson)
	{
		personMap.put(id, newPerson);
		
		personMap.get(id);
	}
	
	public void delete(String id)
	{
		personMap.remove(id);
	}
}
