package bcc.ifsuldeminas.ecommerce.model.entities.pessoal;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String logradouro;
    private String tipo;
    private int numero;
    private String complemento;
    private String cidade;
    private String uf;
    private long cep;
    @ManyToOne
    private Usuario usuario;
}
