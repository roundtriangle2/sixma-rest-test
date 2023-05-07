package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
public class PersonController
{

    @Autowired
    private  PersonService pService;

    Person person = new Person();




    //Create
    @PostMapping("/addPerson") // < Change this location
    public void createPerson(String id){}
    //Read
    @GetMapping("/person/{person_id}")
    public Optional<Person> getPersonDetails(@PathVariable String person_id)
    {
        Optional<Person> p =  pService.findPerson(person_id);
        return pService.findPerson(person_id);

    }


    //Update
    @PostMapping("/person/{person_id}")
    public void updatePerson(@PathVariable String id){}

    //Delete
    @DeleteMapping("/person/{person_id}")
    public void deletePerson(@PathVariable String id){}




    //Lightweight list
    @GetMapping("/shortlist")
    public Iterable<PeopleSummary> listNameAndId(){return pService.nameId();}

    //List people
    @GetMapping("/peoplelist")
    public Iterable<Person> listPeople(){

        return pService.list();}






}
