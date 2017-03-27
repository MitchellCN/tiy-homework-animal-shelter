import java.util.ArrayList;

/**
 * Created by cmitchell on 3/20/17.
 *
 * You will need to create a class named Animal. Animals have these properties:

 Name
 Species
 Breed
 Description
 *
 *
 */
public class Animal {
//create animal properties
    private String name;
    private String species;
    private String breed;
    private String description;

//constructor created. this is keyword referring to current instance this is used because it is private
    public Animal(String name, String species, String breed, String description) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.description = description;
    }
    //getters and setters only when you have private variables
    public String getName() {
        return this.name;
    }
//if you want to change yor vairabe
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies( String species) {
        this.species = species;

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
