package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;

import java.util.Optional;
import java.util.UUID;
/*
* Rudimentary class that implements  basic CRUD operations fro the PEOPLE table in the database
* */

@CrossOrigin(origins = "*")
@RestController
public class PersonController
{

    @Autowired


    private  PersonService pService;
    Person person = new Person();




    //Create
    @PostMapping("/addPerson")
    public void createPerson(@RequestBody Person newPersonData) throws ParseException
    {


        UUID uuid = UUID.randomUUID();
        System.out.println("New person with id: " +uuid.toString());
        newPersonData.setId(String.valueOf(uuid));
        pService.insertPerson(newPersonData);





    }



    //Read
    @GetMapping("/person/{person_id}")
    public Optional<Person> getPersonDetails(@PathVariable String person_id)
    {
        Optional<Person> p =  pService.findPerson(person_id);
        System.out.println("Fetching full details for person with id: " +person_id);
        return pService.findPerson(person_id);

    }


    //Update
    @PutMapping("/person")
    public void updatePerson(@RequestBody Person updatedPerson)
    {

        System.out.println("Updating person with id: " +updatedPerson.getId());
        pService.updatePerson(updatedPerson);


    }

    //Delete
    @DeleteMapping("/person/{person_id}")
    public void deletePerson(@PathVariable String person_id){
       System.out.println("Deleting person with id: " +person_id);
        pService.deletePerson(person_id);


    }




    //Lightweight list
    //This method lists entries from the PEOPLE table return ing only their names and ids
    @GetMapping("/shortlist")
    public Iterable<PeopleSummary> listNameAndId(){

        System.out.println("Fetching minimal person list");
        return pService.nameId();}













}
