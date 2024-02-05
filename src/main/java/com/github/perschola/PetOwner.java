package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class PetOwner  {


    Pet pet = new Pet("Milo",6) ;
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return this.pet;
    }
}
