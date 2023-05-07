package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void getPersonDetails(@PathVariable String id)
    {


    }


    //Update
    @PostMapping("/person/{person_id}")
    public void updatePerson(@PathVariable String id){}

    //Delete
    @DeleteMapping("/person/{person_id}")
    public void deletePerson(@PathVariable String id){}



    //List people
    @GetMapping("/peoplelist")
    public Iterable<Person> listPeople(){

        return pService.list();}






}
