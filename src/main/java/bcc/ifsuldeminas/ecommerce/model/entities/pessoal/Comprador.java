package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Comprador")
public class Comprador extends Usuario{
    private long cpf;
}
