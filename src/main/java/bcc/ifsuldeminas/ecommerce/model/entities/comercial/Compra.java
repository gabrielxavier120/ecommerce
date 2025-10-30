package bcc.ifsuldeminas.ecommerce.model.entities.comercial;

import java.util.List;

import bcc.ifsuldeminas.ecommerce.model.entities.financeiro.Pagamento;
import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Endereco;
import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Usuario;
import jakarta.persistence.*;


import java.util.Date;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long numero;
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDaCompra;
    private Usuario comprador;
    private Endereco enderecoDeEntrega;
    private List<ItemDaCompra> itens;
    private List<Pagamento> pagamentos;
}
