import jmx.ad.builder.Coche;
import jmx.ad.builder.Persona;
import jmx.ad.builder.PersonaBuilder;

public class Main {
    public static void main(String[] args) {

        //Podemos crear un objeto vacio y empezar a settearlo
        Persona p1 = new Persona();
        p1.setNombre("Juanma");
        p1.setApellido("Garcia");
        // Es preferible hacerlo así, te evitas una NullPointerException.
        if ("978102030".equals(p1.getTelefono())){
            System.out.println();
        }

        //Nosotros creamos objetos incompletos, y settearlos..
        //pero imaginemos que tenemos una clase persona con 100 atributos y queremos un constructor con 2 parametros, luego otro con 3, otro con 5, otro con 9 otro con....
        //Nos pegamos la vida haciendo constructores o setteando
        //usar lombok

        //Ejemplo con Lombok
        //Despues de poner @Buider, eliminar los getter/setter constructores...
        PersonaBuilder p = PersonaBuilder.builder().build();// Crea un objeto vacio
        //Si queremos ir rellenando atributos que necesitemos, podemos hacerlo en la misma linea
        PersonaBuilder person = PersonaBuilder.builder().nombre("Juan").apellido("García").telefono("652225520").email("aaa@persona.es").build();
        System.out.println(person);



        //Podemos decirle a Lombok que cree copias o casi-copias de los objetos, añadiendo la propiedad toBuilder = true a la anotación @Builder
        //Veamos un ejemplo con el objeto coche
        //Todos los coches que vamos a crear van a ser vw

        Coche c1 = Coche.builder().marca("vw").build();
        System.out.println(c1);
        Coche c2 = c1.toBuilder().build();
        System.out.println(c2);

        //Todos los coches van a tener misma marca y modelo
        //personalizando matricula

        Coche c3 = Coche.builder().marca("vw").modelo("id3").build();
        //mirar la clase Coche.CocheBuilder
        Coche.CocheBuilder c4 = c3.toBuilder();
        c4.matricula("9999 - MJF").build();

        System.out.println(c3);
        System.out.println(c4);


    }
}