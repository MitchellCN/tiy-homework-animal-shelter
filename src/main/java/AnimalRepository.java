import java.sql.*;
import java.util.ArrayList;

/**
 * Created by cmitchell on 4/3/17.
 */
public class AnimalRepository {
//CREATE A PRIVATE CONNECTION TO DATABASE

        private Connection conn;
        private int animalCount;

        public AnimalRepository(String jdbcUrl) throws SQLException {
            this.conn = DriverManager.getConnection(jdbcUrl);

    }

        public ArrayList<Animal> animals() throws SQLException{
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        Statement stmt =conn.createStatement();

        Animal animal = new Animal(
            ResultSet result = stmt.executeQuery("SELECT * FROM ANIMAL ORDER BY id ASC");
            while(result.next()){
                Animals animal = new Animal(
                    result.getInt("animal_id"),
                    result.getString("species"),
                    result.getString("breed"),
                    result.getString("description"),
                    result.getString("name")
            );

            animalArrayList.add(animal);
                }
            return animalArrayList;


    public void saveAnimals(Animal animal){

        }

        public void readAnimals(Animal animal){

        }

        public void saveAnimalsEdits(Animal animal){

        }

        public void saveNewAnimals(Animal animal){

        }

}
}
