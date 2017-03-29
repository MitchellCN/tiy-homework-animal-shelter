

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by cmitchell on 3/29/17.
 */
public class MenuServiceTest {

    ByteArrayOutputStream outputStream;
    ArrayList<Animals> animals;

    @Before
    public void before(){
        this.outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(this.outputStream);
        System.setOut(printStream);

        animals = new ArrayList<>();
        animals.add(new Animal(
                "Bear",
                "Lion",
                "Tiger",
                "OhMy"));

        animals.add(new Animal(
                "Rocky",
                "Turtle",
                "Calvin"));

        animals.add(new Animal(
                "Bird",
                "Peguin",
                "WaterBuffalo"
        ));


    }


}
