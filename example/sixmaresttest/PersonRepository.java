package com.example.sixmaresttest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, String>
{

    @Query(value = "select new  com.example.sixmaresttest.PeopleSummary(id,name,middleName,lastName,secondLastName) from PEOPLE")
    Iterable<PeopleSummary> nameAndId();
}
