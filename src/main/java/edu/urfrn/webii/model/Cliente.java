package edu.urfrn.webii.model;

import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {
    private List<Endereco> enderecos;

    public Cliente(Long id, String email, String nome, Date dataNascimento, String telefone ) {
        super(id, email, nome, dataNascimento, telefone);

    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
