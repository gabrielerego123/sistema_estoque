package edu.urfrn.webii.model;

import java.util.Date;
import java.util.List;

public class Compra {
    private Long id;
    private Date dataRealizaccao;
    private String status;
    private Date dataEntrega;
    private List<ItemCompra> itens;
    private Fornecedor fornecedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataRealizaccao() {
        return dataRealizaccao;
    }

    public void setDataRealizaccao(Date dataRealizaccao) {
        this.dataRealizaccao = dataRealizaccao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
