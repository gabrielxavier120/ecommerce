package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Compra;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDoPagamento;
    private double valor;
    private int qtdeDeParcelas;
    private String status;
    @ManyToOne
    private Compra compra;
    @OneToMany
    @JoinColumn(name = "pagamento_id")
    private List<FormaDePagamento> formasDePgto;
}
