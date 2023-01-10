package org.iesch.ad.model;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor@AllArgsConstructor@Builder@Data
@Entity
public class Person {

    @Id
    String dni;
    String name;
    String lastname;
    // Arreglao
    @OneToOne(cascade = CascadeType.ALL) // Propagar todas las operaciones que realices en esta entidad a la otra.
    IdCard tarjeta;

}