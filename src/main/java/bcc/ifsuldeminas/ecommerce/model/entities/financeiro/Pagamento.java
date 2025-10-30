package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import java.util.Date;
import java.util.List;
import bcc.ifsuldeminas.ecommerce.model.entities.comercial.Compra;
import jakarta.persistence.*;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDoPagamento;
    private double valor;
    private int qtdeDeParcelas;
    private String status;
    private Compra compra;
    private List<FormaDePagamento> formasDePagamento;
}
