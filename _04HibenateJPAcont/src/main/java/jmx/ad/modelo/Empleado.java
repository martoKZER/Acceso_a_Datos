package jmx.ad.modelo;

import lombok.*;

//import javax.persistence.*; //para la versión 5 de hibernate
import jakarta.persistence.*; //para la versión 6 de hibernate
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table (name="empleado",
        uniqueConstraints =  @UniqueConstraint(//restriccion de unicidad (valor irrepetible) en la columna dni.
        name = "dni_unico",// nombre de la restriccion
        columnNames = {"dni"}))// a que columna afecta

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;

    @ManyToOne
    private Departamento departamento;



}
