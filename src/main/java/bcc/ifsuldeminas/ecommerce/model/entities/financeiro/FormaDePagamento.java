package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
public class FormaDePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
