package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Boleto extends FormaDePagamento {
    private String codigo;
    @Temporal(TemporalType.DATE)
    private Date vencimento;
    private double valor;
    private long numeroDoDocumento;
    @Temporal(TemporalType.DATE)
    private Date dataProcessamento;
    private Beneficiario beneficiario;
}
