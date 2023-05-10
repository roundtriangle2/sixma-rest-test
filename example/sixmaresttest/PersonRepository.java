package com.example.sixmaresttest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, String>
{


/*    This query is used when the front end loads the user list
      This query only fetches the minimum amount of information needed to list users, reducing the amount of data
      as the
  */
    @Query(value = "select new  com.example.sixmaresttest.PeopleSummary(id,name,middleName,lastName,secondLastName) from PEOPLE")
    Iterable<PeopleSummary> nameAndId();
}
