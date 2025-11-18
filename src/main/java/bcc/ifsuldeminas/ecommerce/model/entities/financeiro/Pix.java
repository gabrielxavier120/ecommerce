package bcc.ifsuldeminas.ecommerce.model.entities.financeiro;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "Pix")
public class Pix extends FormaDePagamento{
    private String codigo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date validadeDoCodigo;
}
