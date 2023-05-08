package com.example.sixmaresttest;


import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PEOPLE")
public class Person

{





@Id
private String id;
private String   name;
private String lastName;
private String middleName;
private String secondLastName;
private String suffix;
private String sex;
private int ssn;

private boolean isAmericanCitizen;
private Date birthdate;
private String visaType;
private int visaNumber;
private String birthCountry;
private String city;
private String state;
private String birthPlace;
private Date dateOfDeath;

private boolean adfanHasBcertCpy;
private String hairColor;
private String eyeColor;
private int height;
private int weight;
private String particularMarkers;

private boolean isPuertoRicoResident;
private String mainLanguage;
private String religion;
private boolean needsInterpreter;
private String civilStatus;
private String secondLanguage;
private String prefix;



    private boolean isDfCustodian;
private String custodyType;
    public Person(String id, String name, String lastName, String middleName, String secondLastName)
    {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.middleName = middleName;
            this.secondLastName = secondLastName;
            }


    public Person(){}

    public Person(String id, String name, String lastName, String middleName, String secondLastName, String suffix, String sex, int ssn, boolean isAmericanCitizen, Date birthdate, String visaType, int visaNumber, String birthCountry, String city, String state, String birthPlace, Date dateOfDeath, boolean adfanHasBcertCpy, String hairColor, String eyeColor, int height, int weight, String particularMarkers, boolean isPuertoRicoResident, String mainLanguage, String religion, boolean needsInterpreter, String civilStatus, String secondLanguage, boolean isDfCustodian,String custodyType, String prefix )
    {

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.secondLastName = secondLastName;
        this.suffix = suffix;
        this.sex = sex;
        this.ssn = ssn;
        this.isAmericanCitizen = isAmericanCitizen;
        this.birthdate = birthdate;
        this.visaType = visaType;
        this.visaNumber = visaNumber;
        this.birthCountry = birthCountry;
        this.city = city;
        this.state = state;
        this.birthPlace = birthPlace;
        this.dateOfDeath = dateOfDeath;
        this.adfanHasBcertCpy = adfanHasBcertCpy;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height; // inches
        this.weight = weight;
        this.particularMarkers = particularMarkers;
        this.isPuertoRicoResident = isPuertoRicoResident;
        this.mainLanguage = mainLanguage;
        this.religion = religion;
        this.needsInterpreter = needsInterpreter;
        this.civilStatus = civilStatus;
        this.secondLanguage = secondLanguage;
        this.isDfCustodian = isDfCustodian;
        this.prefix = prefix;
        this.custodyType = custodyType;

    }


    public Person(String name, String lastName, String middleName, String secondLastName, String suffix, String sex, int ssn, boolean isAmericanCitizen, Date birthdate, String visaType, int visaNumber, String birthCountry, String city, String state, String birthPlace, Date dateOfDeath, boolean adfanHasBcertCpy, String hairColor, String eyeColor, int height, int weight, String particularMarkers, boolean isPuertoRicoResident, String mainLanguage, String religion, boolean needsInterpreter, String civilStatus, String secondLanguage, boolean isDfCustodian,String custodyType, String prefix )
    {


        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.secondLastName = secondLastName;
        this.suffix = suffix;
        this.sex = sex;
        this.ssn = ssn;
        this.isAmericanCitizen = isAmericanCitizen;
        this.birthdate = birthdate;
        this.visaType = visaType;
        this.visaNumber = visaNumber;
        this.birthCountry = birthCountry;
        this.city = city;
        this.state = state;
        this.birthPlace = birthPlace;
        this.dateOfDeath = dateOfDeath;
        this.adfanHasBcertCpy = adfanHasBcertCpy;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height; // inches
        this.weight = weight;
        this.particularMarkers = particularMarkers;
        this.isPuertoRicoResident = isPuertoRicoResident;
        this.mainLanguage = mainLanguage;
        this.religion = religion;
        this.needsInterpreter = needsInterpreter;
        this.civilStatus = civilStatus;
        this.secondLanguage = secondLanguage;
        this.isDfCustodian = isDfCustodian;
        this.prefix = prefix;
        this.custodyType = custodyType;

    }



    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getSecondLastName()
    {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName)
    {
        this.secondLastName = secondLastName;
    }

    public String getSuffix()
    {
        return suffix;
    }

    public void setSuffix(String suffix)
    {
        this.suffix = suffix;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getSsn()
    {
        return ssn;
    }

    public void setSsn(int ssn)
    {
        this.ssn = ssn;
    }

    public boolean isAmericanCitizen()
    {
        return isAmericanCitizen;
    }

    public void setAmericanCitizen(boolean americanCitizen)
    {
        isAmericanCitizen = americanCitizen;
    }

    public Date getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getVisaType()
    {
        return visaType;
    }

    public void setVisaType(String visaType)
    {
        this.visaType = visaType;
    }

    public int getVisaNumber()
    {
        return visaNumber;
    }

    public void setVisaNumber(int visaNumber)
    {
        this.visaNumber = visaNumber;
    }

    public String getBirthCountry()
    {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry)
    {
        this.birthCountry = birthCountry;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace)
    {
        this.birthPlace = birthPlace;
    }

    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath)
    {
        this.dateOfDeath = dateOfDeath;
    }

        public boolean isadfanHasBcertCpy()
    {
        return adfanHasBcertCpy;
    }

    public void setadfanHasBcertCpy(boolean adfanHasBcertCpy)
    {
        this.adfanHasBcertCpy = adfanHasBcertCpy;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getParticularMarkers()
    {
        return particularMarkers;
    }

    public void setParticularMarkers(String particularMarkers)
    {
        this.particularMarkers = particularMarkers;
    }

    public boolean isPuertoRicoResident()
    {
        return isPuertoRicoResident;
    }

    public void setPuertoRicoResident(boolean puertoRicoResident)
    {
        isPuertoRicoResident = puertoRicoResident;
    }

    public String getMainLanguage()
    {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage)
    {
        this.mainLanguage = mainLanguage;
    }

    public String getReligion()
    {
        return religion;
    }

    public void setReligion(String religion)
    {
        this.religion = religion;
    }

    public boolean isNeedsInterpreter()
    {
        return needsInterpreter;
    }

    public void setNeedsInterpreter(boolean needsInterpreter)
    {
        this.needsInterpreter = needsInterpreter;
    }

    public String getCivilStatus()
    {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus)
    {
        this.civilStatus = civilStatus;
    }

    public String getSecondLanguage()
    {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage)
    {
        this.secondLanguage = secondLanguage;
    }
   

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    public boolean isDfCustodian()
    {
        return isDfCustodian;
    }

    public void setDfCustodian(boolean dfCustodian)
    {
        isDfCustodian = dfCustodian;
    }

    public String getCustodyType()
    {
        return custodyType;
    }

    public void setCustodyType(String custodyType)
    {
        this.custodyType = custodyType;
    }

}
