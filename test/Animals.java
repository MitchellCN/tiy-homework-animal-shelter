import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by cmitchell on 3/29/17.
 */
public class Animals {
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
    public void Animal1(){

        //Arrange
        Animal animal = new Animal("Bear", "Mammoth","eater of people", "furry");

        //Assert

        assertThat(animal.getSpecies(),equalTo("Mammoth"));
    }


}
