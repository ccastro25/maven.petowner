package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Person  {

    PetOwner petOwner = new PetOwner();
    String firstName ="";
    String lastName = "";

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName ( ) {
        return this.lastName;
    }
}
