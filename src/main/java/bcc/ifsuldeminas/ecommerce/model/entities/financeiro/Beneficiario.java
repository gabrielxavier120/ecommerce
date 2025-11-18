package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Endereco;
import jakarta.persistence.*;

@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int banco;
    private int agencia;
    private long conta;
    private String nome;
    private long documento;
    private String tipoDocumento;
    @OneToOne
    private Endereco endereco;
}
