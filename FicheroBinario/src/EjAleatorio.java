import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class EjAleatorio {
    public static void escribirEnteros() {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;
        int numero = 0;
        try {
            fichero = new RandomAccessFile("enteros.dat", "rw");
            System.out.println("Introduce un número: ");
            sc.nextInt();
            //Posicionarse al final de un fichero cuando queremos añadir algo
            fichero.seek(fichero.length());
            fichero.writeInt(numero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fichero != null) {
                try {
                    fichero.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void leerEntero() {
        RandomAccessFile fichero = null;
        try {
            fichero = new RandomAccessFile("enteros.dat", "r");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int numero;
        //mostrar fichero
        try {
            fichero.seek(0);
            while (true) {
                numero = fichero.readInt();
                System.out.println(numero);
            }
        } catch (EOFException e) {
            System.out.println("Final del fichero");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
