package com.example.sixmaresttest;


public class PeopleSummary

{






private String id;
private String   name;
private String lastName;
private String middleName;
private String secondLastName;
    public PeopleSummary(String id, String name, String lastName, String middleName, String secondLastName)
    {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.middleName = middleName;
            this.secondLastName = secondLastName;
            }


    public PeopleSummary(){}




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




}
