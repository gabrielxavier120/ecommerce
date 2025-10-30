package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.Entity;

@Entity
public class VendedorPJ extends Vendedor {
    private long cnpj;
}
