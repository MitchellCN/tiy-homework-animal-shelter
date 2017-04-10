import org.junit.Before;

import java.sql.*;

/**
 * Created by cmitchell on 4/5/17.
 */
public class AnimalRepositoryTest {

    String jdbcurl = "jdbc:h2:mem:select";
    private Connection conn;

    @Before
    //AnimalRepository repository = new AnimalRepository();

    public void AnimalRepository(String jdbcUrl) throws SQLException {
        this.conn = DriverManager.getConnection(jdbcUrl);


        Statement stmt = conn.createStatement();

        stmt.execute("CREATE TABLE animal(" +
                        "animal_id SERIAL PRIMARY KEY NOT NULL" +
                "species VARCHAR(25)" +
                "breed VARCHAR(25)" +
                "description VARCHAR(30)" +
                "name VARCHAR(20)"
);
        "CREATE UNIQUE INDEX animal_animal_id_uindex ON public.animal (animal_id)");

    }

    public ResultSet animalDetail(String unique ID)
}