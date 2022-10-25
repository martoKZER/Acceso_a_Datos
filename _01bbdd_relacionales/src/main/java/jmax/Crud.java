package jmax;

import java.sql.*;
import java.util.Scanner;

public class Crud {
    static Scanner sc = new Scanner(System.in);
    static String tableName;

    public static void main(String[] args) {
        try {
            System.out.println("Introduce el nombre de la tabla");
            String input = sc.nextLine().trim();
            tableName = input;
            while (tableName.equals("")) {
                System.out.println("Debes introducir un nombre");
                tableName = input;
            }
            tableName = input;
            System.out.println("El nombre para la tabla será " + tableName);
            System.out.println("¿Desea crear un nuevo campo? Si pulsas N saldrás del creador de campos [S/N]");
            while (Choice(input) == null){
                System.out.println("Introduce un valor válido");
            }


            String create = "CREATE TABLE " + tableName + "(id INT, );"; // TODO Debemos crear los campos que desee el usuario, con tipo de datos y todo el copón
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
    private static String Choice(String siONo) {
        if(sc.nextLine().equals("s") || sc.nextLine().equals("S")){
            return "s";
        }
        else if(sc.nextLine().equals("n") || sc.nextLine().equals("N")){
            return "n";
        } else{
            return null;
        }
    }
}
