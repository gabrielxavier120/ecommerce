package bcc.ifsuldeminas.ecommerce.model.entities.comercial;

import bcc.ifsuldeminas.ecommerce.model.entities.pessoal.Vendedor;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @NotBlank
    private String nome;
    @NotNull
    private String descricao;
    @NotNull
    @DecimalMin(value="0.01")
    private double preco;
    @NotNull
    private int qtdeDisponivel;
    @NotNull
    private String informacoesAdicionais;
    private byte[] fotos;
    @ManyToOne
    private Vendedor vendedor;

    public Produto(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public byte[] getFotos() {
        return fotos;
    }

    public void setFotos(byte[] fotos) {
        this.fotos = fotos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
