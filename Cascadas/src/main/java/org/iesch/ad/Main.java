package org.iesch.ad;

import org.iesch.ad.dao.IdCardDao;
import org.iesch.ad.dao.PersonDao;
import org.iesch.ad.model.IdCard;
import org.iesch.ad.model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IdCardDao idCardDao = new IdCardDao();
        PersonDao personDao = new PersonDao();
        Person person = new Person("1844455L","Pepe","Navarro",null);
        IdCard idCard = new IdCard();
        idCard.setActivo(true);
        idCard.setFechaCaducidad(LocalDate.now());

        idCard.setPerson(person);
        person.setTarjeta(idCard);

        personDao.guardaPerson(person);
        idCardDao.guardaIdCard(idCard);


    }
}