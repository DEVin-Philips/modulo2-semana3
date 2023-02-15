package model;

public class Cliente {

    public void teste(){
        Conta conta = new Conta();
        conta.cliente = new Cliente();

        conta.teste();
        conta.teste2();
        conta.teste3();
    }
}
