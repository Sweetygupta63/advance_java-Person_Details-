package service;

import dao.PersonRepository;
import dto.Person;

import java.util.List;



public class PersonService {
    PersonRepository personRepository=new PersonRepository();

    public void insertPerson(Person person){
        personRepository.insertPerson(person);
    }

    public void updatePerson(int id,String name,int age){
        Person person=personRepository.getById(id);
        person.setName(name);
        person.setAge(age);
        personRepository.updatePerson(person);
    }

    public void deletePerson(int id){
        personRepository.deletePerson(id);
    }

    public List<Person> getPersons(){
        List list=personRepository.getPersons();
        return list;
    }


}
