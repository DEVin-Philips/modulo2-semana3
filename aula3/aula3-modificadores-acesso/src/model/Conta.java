package model;

public class Conta {
    private Integer codigoConta; // existe apenas na próprica classe
    public Double valorConta; // existe no código todo
    protected Cliente cliente = new Cliente(); // existe no pacote e nas classes filhas

    String nomeConta; // existe apenas no pacote da classe

    public void teste(){
        this.codigoConta = 1;
    }

    private void teste1(){
        this.codigoConta = 1;
    }

    protected void teste2(){
        this.codigoConta = 1;
    }

    void teste3(){
        this.codigoConta = 1;
    }
}
