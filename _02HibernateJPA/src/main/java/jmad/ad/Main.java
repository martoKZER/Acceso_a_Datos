package jmad.ad;

import jmad.ad.modelo.Empleado;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //EntityManagerFactory para manejar las entidades y las transacciones.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        // Crea el esquema con la propiedad Update (linea 19 resources/META-INF/persistence.xml)
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            System.out.println("Select de una");
            Query queryTodosEmpleados = entityManager.createQuery("select e from Empleado e");
            List<Empleado> empleadoList = queryTodosEmpleados.getResultList();
            empleadoList.forEach(System.out::println);

        System.out.println("Inserciones de un objeto en BBDD");

        Empleado empleadoTransaction = Empleado.builder().id(6).name("Ousmane").last_name("Dembele").dni("18765432U").build();
        transaction.begin();
        entityManager.persist(empleadoTransaction);
        transaction.commit();

            //Update
            System.out.println("actualizando el usuario 2");
            Empleado update = entityManager.find(Empleado.class, 2);
            update.setName("Donald");
            update.setLast_name("Jota");
            update.setDni("18430455R");
            transaction.begin();
            entityManager.merge(update);
            transaction.commit();
            System.out.println("Hemos realizado un update");
            //Drop el numero 2
            // Necesitamos el dos como un objeto. // Creais... o lo traeis de BBDD
            System.out.println("Nos cargamos al nº3");
            Empleado drop = entityManager.find(Empleado.class, 3);
            transaction.begin();
            entityManager.remove(drop);
            transaction.commit();
            System.out.println("Hemos borrado " + drop);
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}