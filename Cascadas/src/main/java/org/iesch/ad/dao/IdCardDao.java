package org.iesch.ad.dao;

import org.iesch.ad.model.IdCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class IdCardDao {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction transaction;
    public IdCardDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }
    public void guardaIdCard(IdCard idCard) {
        try {
            transaction.begin();
            entityManager.persist(idCard);
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public IdCard buscaIdCard(IdCard idCard){
        return entityManager.find(IdCard.class, idCard.getNumero());
    }
}
