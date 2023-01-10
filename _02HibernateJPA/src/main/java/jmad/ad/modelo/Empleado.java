package jmad.ad.modelo;

import lombok.*;

import javax.persistence.*; // para la version 5 de Hibernate.
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table (name="empleado") //elimino la anotación ya que se llama igual la tabla y la clase, si tu tabla se llama distinto se debe indicar (Incluido uppercase y lowercase).
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String last_name;
    private String dni;
}
