package bcc.ifsuldeminas.ecommerce.model.entities.comercial;

import jakarta.persistence.*;

@Entity
public class ItemDaCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int qtde;
    @ManyToOne
    private Compra compra;
    @ManyToOne
    private Produto produto;
}
