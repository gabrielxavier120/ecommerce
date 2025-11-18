package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "VendedorPJ")
public class VendedorPJ extends Vendedor{
    private long cnpj;
}
