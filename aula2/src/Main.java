public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Pessoa pessoaAndre = new Pessoa();
//        System.out.println(pessoaAndre.nome + " tem a idade de "+pessoaAndre.idade);
//
//        pessoaAndre.nome="Andre";
//        pessoaAndre.idade = 23;
//
//        Pessoa pessoaGeorge = new Pessoa();
//        System.out.println(pessoaGeorge.nome + " tem a idade de "+pessoaGeorge.idade);
//        System.out.println(pessoaGeorge.listaAmigos);
//        System.out.println(pessoaGeorge.casado);
//
//        pessoaGeorge.nome="George";
//        pessoaGeorge.idade = 20;
//
//        pessoaAndre.envelhecer();
//        pessoaAndre.envelhecer();
//        pessoaAndre.envelhecer();
//        System.out.println(pessoaAndre.nome + " tem a idade de "+pessoaAndre.idade);
//
//        pessoaGeorge.envelhecer();
//        pessoaGeorge.envelhecer();
//        System.out.println(pessoaGeorge.nome + " tem a idade de "+pessoaGeorge.idade);


        Cliente cliente = new Cliente();
        System.out.println(cliente.nomeCliente);

        Conta conta1 = new Conta();
        System.out.println(conta1.cliente);

        Agencia agencia = new Agencia();
        agencia.contas.add(conta1);
    }
}