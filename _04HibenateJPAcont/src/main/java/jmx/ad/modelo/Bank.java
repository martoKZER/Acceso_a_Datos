package jmx.ad.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // No pone la anotación Table, por tanto, la tabla se llamara "bank" como la clase pero en minusculas.
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    // DUDA JUANMA: que me explique CascadeType.ALL y orphanRemoval = true.
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // 2. Hacemos uso de la característica de cascada en modo ALL para que se propague ante cualquier operación.
    @JoinColumn(name = "bank_id")//evita la creación de N:N
    private List<Account> bankAccounts;

    public void addBankAccount (Account bankAccount){
        bankAccounts.add(bankAccount);
    }

    public void removeBankAccount (Account bankAccount){
        bankAccounts.remove(bankAccount);
    }

}
