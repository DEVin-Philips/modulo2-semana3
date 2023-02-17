package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeLoja;
    private List<Produto> produtos = new ArrayList<>();
    private String nomeDono;
    private Double saldoLoja;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Double getSaldoLoja() {
        return saldoLoja;
    }

    public void setSaldoLoja(Double saldoLoja) {
        this.saldoLoja = saldoLoja;
    }
}
