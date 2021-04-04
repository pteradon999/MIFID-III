import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTables {


    public static void CreatTables(String args[]){
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gacha", "root_m", "Pteradon99")) {


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
