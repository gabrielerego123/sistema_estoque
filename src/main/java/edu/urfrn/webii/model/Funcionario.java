package edu.urfrn.webii.model;

import java.util.Date;

public class Funcionario extends Usuario{
    private Loja loja;

    public Funcionario(Long id, String email, String nome, Date dataNascimento, String telefone, Loja loja) {
        super(id, email, nome, dataNascimento, telefone);
        this.loja = loja;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
}
