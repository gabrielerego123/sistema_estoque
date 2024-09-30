package edu.urfrn.webii.model;

import java.util.List;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double precoCusto;
    private Double precoVenda;
    private Long quantidadeEstoque;
    private String unidadeMedida;
    private Long valorMinimoEstoque;
    private List<ItemVenda> itensVendas;
    private List<ItemCompra> itensCompras;
    private Estoque estoque;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Long getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Long quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Long getValorMinimoEstoque() {
        return valorMinimoEstoque;
    }

    public void setValorMinimoEstoque(Long valorMinimoEstoque) {
        this.valorMinimoEstoque = valorMinimoEstoque;
    }

    public List<ItemVenda> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(List<ItemVenda> itensVendas) {
        this.itensVendas = itensVendas;
    }

    public List<ItemCompra> getItensCompras() {
        return itensCompras;
    }

    public void setItensCompras(List<ItemCompra> itensCompras) {
        this.itensCompras = itensCompras;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto:\n" +
                "nome=" + nome +
                ", precoVenda=R$" + precoVenda +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", unidadeMedida=" + unidadeMedida +
                ", valorMinimoEstoque=" + valorMinimoEstoque;
    }

}