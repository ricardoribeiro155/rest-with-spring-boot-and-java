package br.com.rest_with_spring_boot_and_java.controller;

import br.com.rest_with_spring_boot_and_java.model.Person;
import br.com.rest_with_spring_boot_and_java.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService service;


    @GetMapping("/{id}")
    public Person findById(@PathVariable String id, Person person) {
        return service.findById(id);
    }

    @GetMapping("/lista")
    public List<Person> findAll(){
        return service.findAll();
    }
    @PostMapping("/newPerson")
    public void create (@RequestBody Person person ){
        service.setNewPerson(person);
    }
    @GetMapping("retonaLista")
    public List<Person> getPerson(){
       return service.getNewPerson();
    }


}
