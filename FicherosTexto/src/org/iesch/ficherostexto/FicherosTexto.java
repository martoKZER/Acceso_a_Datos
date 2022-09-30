package org.iesch.ficherostexto;

import java.io.*;


public class FicherosTexto {

    public static void leer() {

        File fichero = null;
        PrintWriter f = null;

        fichero = new File("prueba.txt");
        System.out.println("Escribiendo en el fichero " + fichero.getAbsolutePath());

        try {
            f = new PrintWriter(new FileWriter(fichero, true));
            for (int i = 0; i < 10; i++) {
                f.println("Linea: " + i);
            }
            f.println(fichero.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f != null) f.close();
        }
    }

    public static void testLeerFicheroTexto() {
        File fichero = null;
        BufferedReader f = null;

        fichero = new File("prueba.txt");
        System.out.println("Leyendo en el fichero " + fichero.getAbsolutePath());
        try {
            f = new BufferedReader(new FileReader(fichero));
            String linea = f.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = f.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }finally{

        }

    }
}
