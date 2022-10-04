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

    public static void modificarEnteros() {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;
        int posicion, numero;
        long size;
        try {
            fichero = new RandomAccessFile("enteros.dat", "r");
            size = fichero.length();
            size /= 4;
            System.out.println("El fichero tiene " + size + " enteros");

            // Modifica el entero que se encuentra en la posicion (>=1 y <=)
            do {
                System.out.println("Introduce la posición (>=1 y <= " + size + ")");
                posicion = sc.nextInt();
            } while (posicion < 1 || posicion > size);
            posicion--;
            // nos situamos en la posición
            fichero.seek(posicion * 4);
            System.out.println("El valor actual: " + fichero.readInt());
            System.out.println("Introduce el nuevo valor: ");
            numero = sc.nextInt();
            fichero.seek(posicion * 4);
            fichero.writeInt(numero);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
