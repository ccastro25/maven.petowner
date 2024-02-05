package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Pet {

    String name = "";
    Integer age = -1;
    public Pet() {
    }

    public Pet(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public String getName ( ) {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
