package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormaDePagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
}
