public class Conta {
    // escopo da classe: métodos e atributos

    Cliente cliente = new Cliente();
    Double saldo;

    public Boolean depositar(Double valor){
        // escopo método: atributos da classe, outros métodos, as variáveis internas do métodos, parâmetros
        if(valor<0){
            System.out.println("Sr(a). " + cliente.nome + " o Valor depositado é negativo");

            return false;
        }
        saldo+=valor;
        return true;
    }

    public Boolean retirar(Double valor){
        if(valor>saldo) {
            System.out.println("Sr(a). " + cliente.nome + " o Saldo é de Insuficiente, saldo atual: " + saldo);
            return false;
        }
        saldo -= valor;
        System.out.println("Sr(a). " + cliente.nome + " o Valor sacado é de "+ valor+ ", saldo atual: "+ saldo);
        return true;
    }

    public void transferir(Double valor, Conta contaDestino){
        //conta1.retirar, é interno ao objeto
        this.retirar(valor);
        //conta2.depositar
        contaDestino.depositar(valor);
    }

    public String validaEmprestimo(Double valor){
        if(cliente.idade > 80 || saldo*3 < valor){
            return "Negado";
        }
        return "Concedido";
    }

    public Integer recursao(Integer valor){
        Integer resultado=valor-1;
        System.out.println(valor);

        if(valor<=0){
            return null;
        }

        return recursao(resultado);
    }
}
