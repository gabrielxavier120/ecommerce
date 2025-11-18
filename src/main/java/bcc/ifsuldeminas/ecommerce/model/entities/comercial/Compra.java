package bcc.ifsuldeminas.ecommerce.model.entities.comercial;

import bcc.ifsuldeminas.ecommerce.model.entities.financeiro.Pagamento;
import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Endereco;
import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Usuario;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numero;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDaCompra;
    @ManyToOne
    private Usuario comprador;
    @ManyToOne
    private Endereco enderecoDeEntrega;
    @OneToMany(mappedBy = "compra")
    private List<ItemDaCompra> itens;
    @OneToMany(mappedBy = "compra")
    private List<Pagamento> pagamentos;
}
