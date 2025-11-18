package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "VendedorPF")
public class VendedorPF extends Vendedor{
    private long cpf;
}
