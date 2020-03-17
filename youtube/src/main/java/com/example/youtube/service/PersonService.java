package com.example.youtube.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.youtube.Dao.PersonDao;
import com.example.youtube.Models.Person;




@Service
public class PersonService {
	
	
	private final PersonDao personDao ;
	
	
@Autowired
	public PersonService(@Qualifier ("fakeDao") PersonDao personDao) {
	//	super();
		this.personDao = personDao;
	}



	public int addPerson(Person person) {
		
		return personDao.insertPerson( person);
		
	}
	
	public List<Person> getAllPerson(){
		
		return personDao.selectAllPerson();
	}
	
	public Optional<Person> getPersonById(UUID id){
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		
		
		return personDao.deletePersonById(id);
	}
	
	public int updatePerson(UUID id , Person newPerson) {
		
		
		return personDao.updatePersonById(id, newPerson);
		
		
		
	}
	
	

}









