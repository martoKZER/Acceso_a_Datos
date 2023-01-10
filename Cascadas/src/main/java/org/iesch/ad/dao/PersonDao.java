package org.iesch.ad.dao;

import org.iesch.ad.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction transaction;

    public PersonDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }

    public void guardaPerson(Person person) {
        try {
            transaction.begin();
            entityManager.persist(person);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public Person buscaPerson(Person person) {
        return entityManager.find(Person.class, person.getDni());
    }

    public void borraPerson(Person person) {
        try {
            transaction.begin();
            Person personTmp = entityManager.merge(person);
            entityManager.remove(person);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }
}
