import java.util.ArrayList;
import java.util.Scanner;

public class MenuService{



//    public int promptForMainMenu0() {
//        return 1;
//    }
//
//    public int promptForMainMenu1() {
//        return 2;
//    }
//    public int promptForMainMenu2() {
//        return 3;
//    }
//
//    public int promptForMainMenu3() {return 4;}
//    public int promptForMainMenu4() {
//        return 5;
//    }
//
//    public int promptForMainMenu5() {
//        return 6;
//    }

    //public String whenMainMenuThenMenuPrinted(){
     //   return"--Main Menu--";
    //}

    //public String whenMainMenuThenMenuPrinted2(){
      //  return"--List Animal--";
    //}

    private Scanner scanner;
    public MenuService(Scanner scanner){this.scanner = scanner.useDelimiter("\n");}

    public int promptForMainMenu() {

        System.out.println("\n-- Main Menu --\n" + "\n"+
                        "1) List Animal\n" +
                        "2) Create a Animal\n" +
                        "3) View a Animal\n" +
                        "4) Edit a Animal\n" +
                        "5) Delete a Animal\n" +
                        "6) Quit\n\n" +
                        "Select an option: ");


        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input >= 1 && input <= 6) {
                return input;
            } else {
                System.out.println("Error: '" + input + "' is not a valid choice!");

                return promptForMainMenu();
            }

        } else {

            String badInput = scanner.nextLine();

            System.out.println("Error: '" + badInput + "' is not a valid number!");

            return promptForMainMenu();
        }
    }

    public void displayAnimalList(ArrayList<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("There are no animals to display!");
        }else{
            for(int x = 0; x < animals.size(); x++){
                System.out.println(animals.get(x).getName());
            }
        }
    }

    public void createAnimal() {
        System.out.println("-- Create a Animal --");
    }


}

