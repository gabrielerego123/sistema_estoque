package edu.urfrn.webii.model;

import java.util.Date;
import java.util.List;

public class Venda {
    private Long id;
    private Date data;
    private double acrescimos;
    private double valorEntrega;
    private String status;
    private Date dataEntrega;
    private double valorTotal;
    private List<ItemVenda> itens;
    private Cliente cliente;
    private Funcionario funcionario;
    private String formaPagamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getAcrescimos() {
        return acrescimos;
    }

    public void setAcrescimos(double acrescimos) {
        this.acrescimos = acrescimos;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(double valorEntrega) {
        this.valorEntrega = valorEntrega;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Venda: \n" +
                "data=" + data +
                ", status=" + status +
                ", valorTotal=" + valorTotal +
                ", cliente=" + cliente.getNome() +
                ", quantidade= " + itens.get(0).getQuantidade() +
                ", produto = " + itens.get(0).getProduto().getNome() +
                ", funcionario=" + funcionario.getNome() +
                ", formaPagamento=" + formaPagamento ;
    }
}
