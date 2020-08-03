package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection con;
    public static Statement state, state1;
    public static ResultSet result, result1;

    public void Conectar(String user, String pass) throws SQLException, ClassNotFoundException {

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        con = DriverManager.getConnection("jdbc:mysql://localhost/Clinica", "root", "Juanfercho451408");

        state = con.createStatement(result.TYPE_SCROLL_SENSITIVE, result.CONCUR_UPDATABLE);
    }

    public static ResultSet consulta(String sql) throws SQLException {

        state1 = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, result1.CONCUR_READ_ONLY);
        result1 = state1.executeQuery(sql);
        return result1;
    }

}
