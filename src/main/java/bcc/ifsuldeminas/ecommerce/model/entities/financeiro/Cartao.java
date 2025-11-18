package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Usuario;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "Cartao")
public class Cartao extends FormaDePagamento{
    private long numero;
    private String titular;
    private int cvv;
    @Temporal(TemporalType.DATE)
    private Date validade;
    @ManyToOne
    private Usuario usuario;
}
