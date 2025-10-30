package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import java.util.Date;

import jakarta.persistence.*;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String email;
    private String senha;
    private String nome;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDaCriacao;
    private boolean ativo;
}
