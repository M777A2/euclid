package com.minusexpectations.euclid.models;

/**
 * A simple POJO for storing the login credentials.
 * TODO replace this with a more elaborate account class to store in the database.
 */
public class LoginForm
{
    private String name;
    private String passhash;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPasshash()
    {
        return passhash;
    }

    public void setPasshash(String passhash)
    {
        this.passhash = passhash;
    }

}
