package jmax;


import java.sql.*;

public class ConsultaPre {
    static final String IP = "127.0.0.1";
    static final String PUERTO = "3306";
    static final String BBDD = "personas";
    static final String USER = "root";
    static final String PASSWORD = "1234";
    static final String CADENA_CONEXION = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BBDD;

    public static void main(String[] args) {
        String sql = "insert into person (id) values (1);";
        Connection miConexion = null;
        try {
            miConexion = DriverManager.getConnection(CADENA_CONEXION, USER, PASSWORD);
            miConexion.setAutoCommit(false);//begin


            Statement miStatement = miConexion.createStatement();
            miStatement.executeUpdate(sql);
            miConexion.commit();

        } catch (SQLException e) {
            System.out.println("error");
            System.out.println("hacemos rollback");
            try {
                assert miConexion != null;
                miConexion.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            try {
                assert miConexion != null;
                miConexion.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
