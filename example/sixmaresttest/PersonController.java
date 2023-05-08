package com.example.sixmaresttest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;


@CrossOrigin(origins = "*")
@RestController
public class PersonController
{

    @Autowired
    private  PersonService pService;

    Person person = new Person();




    //Create
    @PostMapping("/addPerson")
    public void createPerson(@RequestBody Map<String, Object> newPersonData) throws ParseException
    {




        System.out.println(newPersonData.toString());
        Person newPerson = personFromJSON(newPersonData);
        pService.insertPerson(newPerson);





    }



    //Read
    @GetMapping("/person/{person_id}")
    public Optional<Person> getPersonDetails(@PathVariable String person_id)
    {
        Optional<Person> p =  pService.findPerson(person_id);
        return pService.findPerson(person_id);

    }


    //Update
    @PostMapping("/person/{person_id}")
    public void updatePerson(@PathVariable String person_id){}

    //Delete
    @DeleteMapping("/person/{person_id}")
    public void deletePerson(@PathVariable String person_id){}




    //Lightweight list
    @GetMapping("/shortlist")
    public Iterable<PeopleSummary> listNameAndId(){return pService.nameId();}

    //List people
    @GetMapping("/peoplelist")
    public Iterable<Person> listPeople(){

        return pService.list();}




    private Person personFromJSON(Map<String, Object> newPersonData) throws ParseException
    {


        Person newPerson = new Person();
        UUID uuid = UUID.randomUUID();

        newPerson.setId(String.valueOf(uuid));
        System.out.println("New person with id :" + uuid);
        newPerson.setName((String) newPersonData.get("name"));
        newPerson.setLastName((String) newPersonData.get("lastName"));
        newPerson.setMiddleName((String) newPersonData.get("middleName"));
        newPerson.setSecondLastName((String) newPersonData.get("secondLastName"));
        newPerson.setSuffix((String) newPersonData.get("suffix"));
        newPerson.setSex((String) newPersonData.get("sex"));
        newPerson.setSsn((Integer) newPersonData.get("ssn"));
        newPerson.setAmericanCitizen((Boolean) newPersonData.get("americanCitizen"));
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD");

        newPerson.setBirthdate(  df.parse((String) newPersonData.get("birthdate")));
        newPerson.setVisaType((String) newPersonData.get("visaTpe"));
        newPerson.setVisaNumber((Integer) newPersonData.get("visaNumber"));
        newPerson.setBirthCountry((String) newPersonData.get("birthCountry"));
        newPerson.setCity((String) newPersonData.get("city"));
        newPerson.setState((String) newPersonData.get("state"));
        newPerson.setBirthPlace((String) newPersonData.get("birthPlace"));

        String dateofDeath =(String) newPersonData.get("dateOfDeath");

        newPerson.setDateOfDeath( dateofDeath == null ? null:df.parse(dateofDeath));

        newPerson.setadfanHasBcertCpy((Boolean) newPersonData.get("adfanHasBcertCpy"));
        newPerson.setHairColor((String) newPersonData.get("hairColor"));
        newPerson.setEyeColor((String) newPersonData.get("eyeColor"));
        newPerson.setHeight((Integer) newPersonData.get("height"));
        newPerson.setWeight((Integer) newPersonData.get("weight"));
        newPerson.setParticularMarkers((String) newPersonData.get("particularMarkers"));
        newPerson.setPuertoRicoResident((Boolean) newPersonData.get("puertoRicoResident"));
        newPerson.setMainLanguage((String) newPersonData.get("mainLanguage"));
        newPerson.setReligion((String) newPersonData.get("religion"));
        newPerson.setNeedsInterpreter((Boolean) newPersonData.get("needsInterpreter"));
        newPerson.setCivilStatus((String) newPersonData.get("civilStatus"));
        newPerson.setSecondLanguage((String) newPersonData.get("secondLanguage"));
        newPerson.setPrefix((String) newPersonData.get("prefix"));
        newPerson.setDfCustodian((Boolean) newPersonData.get("dfCustodian"));
        newPerson.setCustodyType((String) newPersonData.get("custoryType"));
        return newPerson;
    }







}
