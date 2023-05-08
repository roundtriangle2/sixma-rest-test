package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonService
{
    @Autowired
    private  PersonRepository pRep;

//    private List<Person> db = List.of(Person.testPerson);

    public Iterable<Person> list()
    {
        return pRep.findAll();
    }

    public Optional<Person> findPerson(String id){return  pRep.findById(id);}

    public void insertPerson(Person person){
        pRep.save(person);

    }

    public Iterable<PeopleSummary> nameId()
    {
        return pRep.nameAndId();
    }
}
