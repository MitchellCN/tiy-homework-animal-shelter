import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cmitchell on 3/20/17.
 *
 *
 *
 *
 * This program is text-based and users interact with it using menus and textual prompts. You'll see all of these details below, but this is an example of what the main menu will look like:

 -- Main Menu --

 1) List animals
 2) Create an animal
 3) View animal details
 4) Edit an animal
 5) Delete an animal
 6) Quit

 Please choose an option:
 When the user enters a value like 3 the program will know that the user wants to view an animal's details and then prompt them for which animal they want to view. If the user selects 2 or 4 the program will provide them with a series of prompts to collect data about the new animal.

 Placing all of this logic into the Main class would quickly create a mess of spaghetti code. Instead, you should create a new class named MenuService. This class' responsibility is displaying menus, prompting the user for input, and returning the results. IE, it manages the menus.
 */
public class MenuService {

    public static final int LIST_ANIMAL = 1;
    public static final int CREATE_ANIMAL = 2;
    public static final int VIEW_ANIMAL_DETAIL = 3;
    public static final int EDIT_ANIMAL_ = 4;
    public static final int DELETE_ANIMAL = 5;
    public static final int QUIT_ANIMAL = 6;
//setting scanner variable
    private final Scanner scanner;
//constructor for menuservice that takes Scanner
    public MenuService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int promptForMainMenuSelection() {
        System.out.println("\n-- Main Menu --\n" +
                "\n" +
                "1) List animals\n" +
                "2) Create an animal\n" +
                "3) View animal details\n" +
                "4) Edit an animal\n" +
                "5) Delete an animal\n" +
                "6) Quit\n");
//? waitForInt method
        return waitForInt("Please choose an option:");
    }

    /**
     * This method displays the provided prompt and then waits for a user to
     * provide input. The input must be a valid integer. If not, an error
     * message is displayed and the user is prompted to try again. If the input
     * is valid, then the value entered is returned.
     *
     * @param prompt The prompt displayed to the user.
     * @return The value entered by the user
     */
    public int waitForInt(String prompt) {
        System.out.println(prompt);
//scanner class gives option for hasnextInt true false method. if user puts in something that is not an integer
        if (!scanner.hasNextInt()) {
            System.out.printf("%nError: is not an option", scanner.next());
            return waitForInt(prompt);
            } else {
                return scanner.nextInt();

        }
    }

    //getting input from a string
    public String waitForString(String prompt, boolean required){
        System.out.printf(prompt);
        String input = scanner.next();

        if(required == true && input.isEmpty()){
            System.out.println("This Field must be filled!\n");
            return waitForString(prompt, required);
        }else {
            return input;


        }
    }
//anytime listView is called you put in an arraylist generic type
    public void listView(ArrayList<Animal> animals) {
        System.out.println("/n/n--List Animals --\n");
        //size is given as inteliJ help
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.printf("%s) %s\t\t%s%n", (i + 1), animal.getName(), animal.getSpecies());
        }
    }

    public static void showAnimalDetails(Animal animal) {
        System.out.printf("%nName: , %s%n", animal.getName());
        System.out.printf("Species:,%s%n", animal.getSpecies());
        System.out.printf("Breed:, %s%n", animal.getBreed());
        System.out.printf("Description,%s%n", animal.getDescription());

    }

    public boolean checkYesOrNo(String prompt){
        String input = waitForString(prompt, false);
        if (input.toLowerCase().equals("yes")|| input.toLowerCase().equals("y")) {
            return true;
        }else if(input.toLowerCase().equals("no") || input.toLowerCase().equals("n")) {
            return false;
        }else{
            System.out.println("Needs to be (yes or no) or (y / n)");
            return checkYesOrNo(prompt);
        }
    }
//TODO see main
    public void updateAnimal(Animal animal) {
        String input = "";
        input = waitForString(String.format("Name [%s]: ", animal.getName()), false);
        if (!input.isEmpty()) {
            animal.setName(input);
        }
        input = waitForString(String.format("Species [%s]: ", animal.getSpecies()), false);
        if (!input.isEmpty()) {
            animal.setSpecies(input);
        }
        input = waitForString(String.format("Breed [%s]: ", animal.getBreed()), false);
        if (!input.isEmpty()) {
            animal.setBreed(input);
        }
        input = waitForString(String.format("Description [%s]: ", animal.getDescription()), false);
        if (!input.isEmpty()) {
            animal.setDescription(input);
        }
    }

}