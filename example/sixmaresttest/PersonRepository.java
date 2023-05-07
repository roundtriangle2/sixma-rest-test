package com.example.sixmaresttest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.sixmaresttest.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>
{
}
