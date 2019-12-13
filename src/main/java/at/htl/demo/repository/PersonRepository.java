package at.htl.demo.repository;

import at.htl.demo.model.PersonBO;

import java.util.List;

public interface PersonRepository {
    void insertPerson(PersonBO person);
    List<PersonBO> getAllPeople();
}
