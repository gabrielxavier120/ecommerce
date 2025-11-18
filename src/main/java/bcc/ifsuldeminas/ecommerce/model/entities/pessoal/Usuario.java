package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String senha;
    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDaCriacao;
    private boolean ativo;
}
