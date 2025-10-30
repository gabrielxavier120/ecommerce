package bcc.ifsuldeminas.ecommerce.model.entities.comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemDaCompra {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int qtde;
    private Compra compra;
    private Produto produto;
}
