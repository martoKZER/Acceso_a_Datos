package jmax;


import java.sql.*;

public class Main {
    static final String IP = "127.0.0.1";
    static final String PUERTO = "3306";
    static final String BBDD = "personas";
    static final String USER = "root";
    static final String PASSWORD = "1234";
    static final String CADENA_CONEXION = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BBDD;

    public static void main(String[] args) {
        String qry = "Select * from person order by id desc limit 10;";
        String qry2 = "Select * from person where money > ?";
        try {
            Connection myConnection = DriverManager.getConnection(CADENA_CONEXION, USER, PASSWORD);

            PreparedStatement sentencia = myConnection.prepareStatement(qry2);
            sentencia.setFloat(1, 4000.00F);
            ResultSet myResultSet = sentencia.executeQuery();

            while (myResultSet.next()) {
                System.out.println(myResultSet.getInt(1) + " " + myResultSet.getString(2)
                        + " " + myResultSet.getString("last_name") + " " + myResultSet.getString(4) +
                        " " + myResultSet.getFloat(7));
            }
            myConnection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
