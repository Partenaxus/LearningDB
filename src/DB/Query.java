package DB;

import java.sql.*;

public class Query {

    static PreparedStatement st = null;

    public static void leerDatos(Connection connection) throws SQLException {
        st = connection.prepareStatement("SELECT * FROM alumnos");
        ResultSet rs = st.executeQuery();

            while (rs.next()){
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Nombre: " + rs.getString(2));
                System.out.println("Edad: " + rs.getInt(3));
                System.out.println("E-mail: " + rs.getString(4));
                System.out.println("========================================");
            }
           connection.close();

    }

}
