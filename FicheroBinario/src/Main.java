import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //FicheroBinario.testEscribirFicheroBinario();
        //FicheroBinario.testLeerFicheroBinario();
        //EjAleatorio.escribirEnteros();
        //EjAleatorio.leerEntero();
        //EjAleatorio.modificarEnteros();


//        File fichero = new File("FicheroBinario.iml");
//        File fichero2 = new File("Fichero.txt");
//        File directorio = new File("src");
//        File directorio2 = new File("directorio");
//
//        // Existen
//        System.out.println("fichero :      " + fichero.exists());
//        System.out.println("directorio :      " + directorio.exists());
//
//        // No existen
//        System.out.println("fichero 2:      " + fichero2.exists());
//        System.out.println("directorio :      " + directorio2.exists());
//
//        //"fichero" no es un directorio
//        System.out.println("Es directorio " + fichero.isDirectory());
//        //"directorio" es un directorio
//        System.out.println("Es directorio " + directorio.isDirectory());
//
//        System.out.println("Fichero permisos rwx?? " + fichero.canRead() + " " + fichero.canWrite() + " " + fichero.canExecute());
//
//        System.out.println("Nombre fichero " + fichero.getName());
//        System.out.println("Ruta fichero " + fichero.getAbsolutePath());
//
//        System.out.println("Nombre de los objetos File dentro de un Array");
//        File lista[] = directorio.listFiles();
//        for (File f : lista) {
//            System.out.println(f);
//        }
//
//        System.out.println("Creando directorio...");
//        System.out.println(directorio2.mkdir());
//    }
//        System.out.println(System.getProperty("user.home"));
//        System.out.println();
//        try (Stream<Path> stream = Files.list(Paths.get(System.getProperty("user.home")))){
//            stream.map(String::valueOf).filter(path -> !path.startsWith("."))
//                    .sorted().forEach(System.out::println);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
        ExpresionesRegulares ex = new ExpresionesRegulares();
        ex.run();

    }
}
