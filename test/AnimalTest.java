import org.junit.Test;

import java.util.Scanner;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by cmitchell on 3/29/17.
 */
public class AnimalTest {
    @Test
    /**
     * Given an animal with name, breed, species, description entered
     * Then return the animal
     */
    public void Animal(){

        //Arrange
        Animal animal = new Animal("Bear", "Mammoth","eater of people", "furry");

        //Assert

        assertThat(animal.getName(),equalTo("Bear"));
    }

    @Test
    /**
     * Given an animal with name, breed, species, description entered
     * Then return the animal
     */
    public void animalsRetreived(){

        //Arrange
        Animal animal = new Animal("Bear", "Mammoth","eater of people", "furry");

        //Assert

        assertThat(animal.getSpecies(),equalTo("Mammoth"));
        assertThat(animal.getBreed(),equalTo("eater of people"));
        assertThat(animal.getDescription(),equalTo("furry"));
    }

    @Test
    /**
     * Given Animal
     * Animal will instatinate
     *
     */

    public void canIstantiateAnimal(){

        //Arrange

        Animal animal = new Animal("name", "species","breed", "description");

        //Assert
        assertThat(animal.getName(), equalTo("name"));
        assertThat(animal.getSpecies(), equalTo("species"));
        assertThat(animal.getBreed(), equalTo("breed"));
        assertThat(animal.getDescription(), equalTo("description"));

    }

    @Test
    /**
     * Given a getter
     * verify the setter pulls correct animal name, species, breed, description
     */
    //Arrange

    public void setterShowsCorrectName(){
     Animal animal = new Animal("bull", "by", "the", "horns");

    //Assert
        animal.setSpecies("horns");
        assertThat(animal.getSpecies(), equalTo("horns"));

        animal.setName("bull");
        assertThat(animal.getName(), equalTo("bull"));

        animal.setBreed("the");
        assertThat(animal.getBreed(), equalTo("the"));

        animal.setDescription("horns");
        assertThat(animal.getDescription(), equalTo("horns"));


    }




}

