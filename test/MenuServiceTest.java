

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by cmitchell on 3/29/17.
 */
public class MenuServiceTest {

    ByteArrayOutputStream outputStream;
    ArrayList<Animal> animals;


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
                "Calvin",
                "Whale"));

        animals.add(new Animal(
                "Bird",
                "Peguin",
                "WaterBuffalo",
                "Zebra"
        ));


    }

    @Test
    /**
     * Given the main menu
     * When the user enters 1
     * Then 1 is returned
     */
    public void when1onMainMenuThen1(){
        // Arrange
        Scanner scanner = new Scanner("1");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu();

        // Assert
        assertThat(selection, equalTo(1));
    }

    @Test
    /**
     * Given the main menu
     * When the user enters 2
     * Then 2 is returned
     */
    public void when2onMainMenuThen2(){
        // Arrange
        Scanner scanner = new Scanner("2");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu1();

        // Assert
        assertThat(selection, equalTo(2));
    }

    @Test
    /**
     * Given the main menu
     * When the user enters 3
     * Then 3 is returned
     */
    public void when2onMainMenuThen3(){
        // Arrange
        Scanner scanner = new Scanner("3");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu2();

        // Assert
        assertThat(selection, equalTo(3));
    }

    @Test
    /**
     * Given the main menu
     * When the user enters 4
     * Then 4 is returned
     */
    public void when2onMainMenuThen4(){
        // Arrange
        Scanner scanner = new Scanner("4");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu3();

        // Assert
        assertThat(selection, equalTo(4));
    }

    @Test
    /**
     * Given the main menu
     * When the user enters 5
     * Then 5 is returned
     */
    public void when2onMainMenuThen5(){
        // Arrange
        Scanner scanner = new Scanner("5");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu4();

        // Assert
        assertThat(selection, equalTo(5));
    }

    @Test
    /**
     * Given the main menu
     * When the user enters 6
     * Then 6 is returned
     */
    public void when2onMainMenuThen6(){
        // Arrange
        Scanner scanner = new Scanner("6");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu5();

        // Assert
        assertThat(selection, equalTo(6));
    }

}
