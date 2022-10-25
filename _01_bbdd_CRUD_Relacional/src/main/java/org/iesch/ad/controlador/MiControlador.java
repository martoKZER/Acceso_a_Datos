package org.iesch.ad.controlador;

import org.iesch.ad.modelo.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MiControlador {
    final String IP = "127.0.0.1";
    final String PUERTO = "3306";
    final String BBDD = "personas";
    final String USER = "root";
    final String PASSWORD = "1234";
    final String CADENA_CONEXION = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BBDD;
    Connection miConexion;

    public MiControlador() {
        try {
            miConexion = DriverManager.getConnection(CADENA_CONEXION, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Select * from person;

    }

    public List<Person> todasLasPersonas() {
        String sql = "Select * from person";
        ResultSet miResultSet;
        ArrayList<Person> miLista = new ArrayList<>();
        Statement miStatement;
        try {
            miStatement = miConexion.createStatement();
            miResultSet = miStatement.executeQuery(sql);
            // recorrer el resultSet y crear el objeto lista a devolver
            while (miResultSet.next()) {
                Person p = new Person(
                        miResultSet.getInt(1),
                        miResultSet.getString(2),
                        miResultSet.getString(3),
                        miResultSet.getString(4),
                        miResultSet.getString(5),
                        miResultSet.getString(6),
                        miResultSet.getFloat(7));
                miLista.add(new Person());
                System.out.println(miResultSet.getInt(1) + " " + miResultSet.getString(2)
                        + " " + miResultSet.getString("last_name") + " " + miResultSet.getString(4)
                        + " " + miResultSet.getFloat(7));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miLista;

    }

    public void cierra() {
        try {
            miConexion.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean inserta(Person p) {
        ResultSet miResultSet;
        Statement miStatement;
        String sql = "insert into person (id, name, last_name, email, gender, ip_address, money) values (?,?,?,?,?,?,?);";
        try {
            PreparedStatement sentencia = miConexion.prepareStatement(sql);
            p = new Person();
                    sentencia.setInt(1, p.getId());
            sentencia.setString(2, p.getFirst_name());
            sentencia.setString(3, p.getLast_name());
            sentencia.setString(4, p.getEmail());
            sentencia.setString(5, p.getGender());
            sentencia.setString(6, p.getIp_address());
            sentencia.setFloat(7, p.getMoney());
            sentencia.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
