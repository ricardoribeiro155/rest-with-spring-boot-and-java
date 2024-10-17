package br.com.rest_with_spring_boot_and_java.services;

import br.com.rest_with_spring_boot_and_java.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {
    private static final AtomicLong couter = new AtomicLong();
    private static Logger logger = Logger.getLogger(PersonService.class.getName());
    List<Person> newPerson = new ArrayList<>();

    public Person findById(String id) {
        logger.info("finding one person!");

        Person person = new Person();
        person.setId(couter.incrementAndGet());
        person.setFistName("ricardo");
        person.setLastName("ribeiro da luz");
        person.setAddress("campinas-são paulo");
        person.setGender("male");

        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        logger.info("finding one person!");

        Person person = new Person();
        person.setId(couter.incrementAndGet());
        person.setFistName("ricardo" + i);
        person.setLastName("ribeiro da luz" + i);
        person.setAddress("campinas-são paulo" + i);
        person.setGender("male" + i);

        return person;
    }

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public Person delete(Person person) {
        return person;
    }

    public void setNewPerson(Person person) {
        newPerson.add(person);
    }
    public List<Person> getNewPerson() {
        return newPerson;
    }

}