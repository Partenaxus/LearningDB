package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection connection = null;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root","");
            System.out.println("Conectado");
        }catch (Exception e){
            System.out.println("No conectado");
        }
        return connection;
    }

}
