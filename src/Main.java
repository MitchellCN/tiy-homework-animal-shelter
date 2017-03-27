import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cmitchell on 3/20/17.
 *
 *
 *
 *
 *
 *
 *  Animal Shelter v1.0
 - do first without tests
 - removed AnimalService requirement
 - menuService should not have an instance variable
 - tweaked the Main class
 - Due Monday morning!
 */
public class Main{

    private static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[\n]");
        preLoadForTesting();


        MenuService menuService = new MenuService(scanner);



        while (true) {


            int choosen = menuService.promptForMainMenuSelection();
            if (choosen == menuService.LIST_ANIMAL) {
                menuService.listView(animals);
            } else if (choosen == menuService.CREATE_ANIMAL) {
                System.out.println("\n-- Create Animal --\n");
                System.out.println("\nPlease answer the following question");
                String name = menuService.waitForString("%nAnimal Name:",true);
                String species = menuService.waitForString("%nSpecies",true);
                String breed = menuService.waitForString("%nbreed (optional)",false);
                String description = menuService.waitForString("%ndescription",true);
                animals.add(new Animal(name, species, breed, description));
                System.out.println("\n" + "Success: The animal has been created!");
            } else if (choosen == menuService.VIEW_ANIMAL_DETAIL) {
                System.out.println("\n--View an Animal --\n");
                Animal animal = animals.get(
                        menuService.waitForInt("What is the numeric ID of the animal you want to view?: ")-1);

                MenuService.showAnimalDetails(animal);
            } else if (choosen == menuService.EDIT_ANIMAL_) {
                System.out.println("\n-- Edit Animal --\n");
                int index=menuService.waitForInt("What is the numeric ID of the animal you want to Edit?:");
                //get animal
                Animal animal = animals.get(index -1);
                //display details of animal
                menuService.showAnimalDetails(animal);
                //verify if you are sure you want to edit
//TODO: need to call update for animal

//TODO copy paste bug?
                menuService.updateAnimal(animal);
            } else if (choosen == menuService.DELETE_ANIMAL) {
                System.out.println("\n--Delete an Animal--\n");
                int index=menuService.waitForInt("What is the numeric ID of the animal you want to delete?:");
                //get animal
                Animal animal = animals.get(index -1);
                //display details of animal
                menuService.showAnimalDetails(animal);
                //verify if you are sure you want to delete
                if(menuService.checkYesOrNo("%nAre you sure you want to delete this animal?:")){
                    animals.remove(index);
                    System.out.println(("\nSuccess: The animal has been deleted!\n"));
                }
            } else if (choosen == menuService.QUIT_ANIMAL) {
                System.out.println("Exiting Program...no Data will be stored");
                break;
            } else {
                System.out.println(("Please try a valid option."));
            }
        }
    }
        private static void preLoadForTesting(){
            animals.add(new Animal("Calvin", "Mars Lifeform","people eater","transparent life sucker" ));
            animals.add(new Animal("Toad", "Mario Brothers","Fluffy Head","short and stalky" ));
            animals.add(new Animal("Boar", "deli meat","tasty","delicious" ));
            animals.add(new Animal("Piggy", "Market","Big Toe","did not go wee wee wee all the way home" ));

    }
    }



