package edu.urfrn.webii.model;

import java.util.Date;

public class CompraReabastecimento {
    private Long id;
    private Compra compra;
    private Reabastecimento reabastecimento;
    private Date date;
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Reabastecimento getReabastecimento() {
        return reabastecimento;
    }

    public void setReabastecimento(Reabastecimento reabastecimento) {
        this.reabastecimento = reabastecimento;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
