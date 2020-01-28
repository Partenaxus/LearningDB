import DB.DBConnection;
import DB.Query;

import java.sql.Connection;
import java.sql.SQLException;

public class App  {

    static Connection connection = DBConnection.getConnection();

    public static void main(String[] args) throws SQLException {
        Query.leerDatos(connection);
    }

}
