package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.Entity;

@Entity
public class Comprador extends Usuario{
    private long cpf;
}
