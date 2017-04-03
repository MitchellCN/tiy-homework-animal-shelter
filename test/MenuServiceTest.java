

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by cmitchell on 3/29/17.
 */
public class MenuServiceTest {

    ByteArrayOutputStream outputStream;
    ArrayList<Animal> animals;


    @Before
    public void before() {
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
    public void when1onMainMenuThen1() {
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
    public void when2onMainMenuThen2() {
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
    public void when3onMainMenuThen3() {
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
    public void when4onMainMenuThen4() {
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
    public void when5onMainMenuThen5() {
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
    public void when6onMainMenuThen6() {
        // Arrange
        Scanner scanner = new Scanner("6");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu5();

        // Assert
        assertThat(selection, equalTo(6));
    }


    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted() {
        // Arrange
        Scanner scanner = new Scanner("1");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("-- Main Menu --"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted1() {
        // Arrange
        Scanner scanner = new Scanner("1");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("1) List Animal"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted2() {
        // Arrange
        Scanner scanner = new Scanner("2");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("2) Create a Animal"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted3() {
        // Arrange
        Scanner scanner = new Scanner("3");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("3) View a Animal"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted4() {
        // Arrange
        Scanner scanner = new Scanner("4");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("4) Edit a Animal"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted5() {
        // Arrange
        Scanner scanner = new Scanner("5");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("5) Delete a Animal"));
    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted6() {
        // Arrange
        Scanner scanner = new Scanner("6");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("6) Quit"));
    }

    public void whenMainMenuThenMenuPrinted7() {
        // Arrange
        Scanner scanner = new Scanner("7");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("Select an option:"));
    }
    @Test
    /**
     * Given a main menu
     * When a string is input
     * Then I am re-prompted until an integer is entered
     */
    public void whenStringInputToMainMenuThenReprompt(){
        // Arrange
        Scanner scanner = new Scanner("name\n \n5");
        MenuService menu = new MenuService(scanner);

        // Act
        int input = menu.promptForMainMenu();

        // Assert
        assertThat(input, equalTo(5));
        assertThat(outputStream.toString(),containsString("'name' is not a valid number"));
    }

    @Test
    /**
     * When main menu displayed
     * Then a prompt for input is displayed
     */
    public void whenMainMenuThenPromptedForSelection(){
        // Arrange
        Scanner scanner = new Scanner("1");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("Select an option:"));
    }

    @Test
    /**
     * Given a main menu
     * When bad input provided
     * Then error message displayed
     */
    public void whenBadInputOnMainMenuThenErrorMessage(){
        // Arrange
        Scanner scanner = new Scanner("Sandwich\nFoot\n5");
        MenuService menu = new MenuService(scanner);

        // Act
        int input = menu.promptForMainMenu();

        // Assert
        assertThat(outputStream.toString(), containsString("Error: 'Sandwich' is not a valid number!"));
        assertThat(outputStream.toString(), containsString("Error: 'Foot' is not a valid number!"));

    }

    @Test
    /**
     * Given a main menu prompt
     * When a number outside of 1 to 6 is entered
     * Then an error message is printed
     */
    public void whenInvalidNumberEnteredOnMainMenuThenErrorMessagePrinted(){
        // Arrange
        Scanner scanner = new Scanner("7\n0\n-1\n3");
        MenuService menu = new MenuService(scanner);

        // Act
        int input = menu.promptForMainMenu();

        // Assert
        assertThat(outputStream.toString(), containsString("Error: '7' is not a valid choice!"));
        assertThat(outputStream.toString(), containsString("Error: '0' is not a valid choice!"));
        assertThat(outputStream.toString(), containsString("Error: '-1' is not a valid choice!"));

    }

    @Test
    /**
     * Given a list of NO Animals
     * When Animals are listed
     * Then no Animals are displayed
     */
    public void whenNoAnimalsThenNoanimalMessageShown(){
        // Arrange
        Scanner scanner = new Scanner("There are no animals to display!");
        MenuService menu = new MenuService(scanner);

        ArrayList<Animal> animals = new ArrayList<>();

        // Act
        menu.displayAnimalList(animals);

        // Assert
        //assertThat(outputStream.toString(), containsString("1) List Animal"));
        assertThat(outputStream.toString(), containsString("There are no animals to display!"));
    }

    @Test
    /**
     * Given a list of three animals
     * When animals are listed
     * Then all three animal are shown
     */
    public void whenAnimalsListedThenAllAreShown(){
        // Arrange
        Scanner scanner = new Scanner("");
        MenuService menu = new MenuService(scanner);

        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal1 = new Animal("Alien","Bear","Bear","No bear");

        animals.add(animal1);

        Animal animal2 = new Animal("Calvin","Calvin","Calvin","Calvin");

        animals.add(animal2);

        Animal animal3 = new Animal("Bear","Whale","Whale","Whale");

        animals.add(animal3);


        // Act
        menu.displayAnimalList(animals);

        // Assert
        assertThat(3,equalTo(animals.size()));
        assertThat(outputStream.toString(),containsString("Calvin"));
        assertThat(outputStream.toString(),containsString("Alien"));
        assertThat(outputStream.toString(),containsString("Bear"));


    }


    @Test
    /**
     * When creating a animal
     * Then correct prompts are displayed
     */
    public void whenCreatingAnimalThenPromptsDisplayed(){
        // Arrange
        Scanner scanner = new Scanner("Roller Chain Guide\n" +
                "Deep Channel for ANSI Number 40/2040, 304 Stainless Steel Frame\n" +
                "Deep\n" +
                "1\n" +
                "12\n");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.createAnimal();

        // Assert

        // validate prompts
        assertThat(outputStream.toString(), containsString("-- Create a Animal --"));
        //assertThat(outputStream.toString(), containsString("Name: "));
        //assertThat(outputStream.toString(), containsString("Description: "));
        //assertThat(outputStream.toString(), containsString("Type: "));
        //assertThat(outputStream.toString(), containsString("Weight: "));
       // assertThat(outputStream.toString(), containsString("Quantity: "));
    }

}
