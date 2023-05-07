package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sixmaresttest.Person;


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
}
