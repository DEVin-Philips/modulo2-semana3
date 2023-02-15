package banco;

public class MainBanco {

    public static void main(String[] args) {
        Agencia agencia = new Agencia("Agencia Laranja");
        Cliente cliente = new Cliente("Senhor Marechal", "1369871264", 98);

        Conta conta = new Conta("Conta", 1000.0, 213,cliente,agencia);

        System.out.println(agencia);
        System.out.println(cliente);
        System.out.println(conta);
    }
}
