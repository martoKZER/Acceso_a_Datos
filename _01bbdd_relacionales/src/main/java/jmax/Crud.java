package jmax;

import java.sql.*;
import java.util.Scanner;

public class Crud {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tableName;
        try {
            System.out.println("Introduce el nombre de la tabla");
            while (tableName.equals("")) {
                System.out.println("Debes introducir un nombre");
                tableName = sc.nextLine().trim();
            }
            tableName = sc.nextLine().trim();
            System.out.println("Base de datos creada con el nombre " + bbdd);
            String create = "CREATE DATABASE " + bbdd;
            Connection miConexion = DriverManager.getConnection(CADENA_CONEXION, USER, PASSWORD);
            Statement myStatement = miConexion.createStatement();
            myStatement.executeUpdate(create);
            System.out.println("Tu base de datos ha sido creada");

            miConexion.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static final String IP = "127.0.0.1";
    static final String PUERTO = "3306";
    static String USER = "root";

    static final String PASSWORD = "1234";
    static final String BBDD = "personas";
    static final String CADENA_CONEXION = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BBDD;
}
