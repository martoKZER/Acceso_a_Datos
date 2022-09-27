import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Coche> coches = new HashMap<String, Coche>();
        Coche coche1 = new Coche("1111aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche2 = new Coche("1121aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche3 = new Coche("1131aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche4 = new Coche("1141aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche5 = new Coche("1151aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche6 = new Coche("1161aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche7 = new Coche("1181aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche8 = new Coche("1119aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche9 = new Coche("1112aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);
        Coche coche10 = new Coche("1171aaa","Opel", "Diesel", "Juanito Juan", "2023,9,23" ,2);

        coches.put("1", coche1);
        coches.put("2", coche2);
        coches.put("3", coche3);
        coches.put("4", coche4);
        coches.put("5", coche5);
        coches.put("6", coche6);
        coches.put("7", coche7);
        coches.put("8", coche8);
        coches.put("9", coche9);
        coches.put("10", coche10);
    }
}
