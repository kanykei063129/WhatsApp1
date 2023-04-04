package service;

import classes.Person;

import java.util.List;

public interface PersonService {
    String greate(Person people);
    List<Person>getPerson();
    Person getPersonFirsName(String name,List<Person>people);
}
