package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class providing access to basic crudrepository methods
 * and some custom sql calls
 */
@Service
public class PersonService
{
    @Autowired
    private  PersonRepository pRep;


    public Iterable<Person> list()
    {
        return pRep.findAll();
    }

    public Optional<Person> findPerson(String id){return  pRep.findById(id);}

    public void insertPerson(Person person){
        pRep.save(person);

    }

    public void deletePerson(String id)
    {
        pRep.deleteById(id);
    }

    public void updatePerson(Person person){
        pRep.save(person);

    }


    public Iterable<PeopleSummary> nameId()
    {
        return pRep.nameAndId();
    }
}
