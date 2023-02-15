import banco.Agencia;
import banco.Cliente;
import banco.Conta;

import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {
        Agencia agencia = new Agencia("Agencia Laranja");


        for(int i=0; i<5;i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escreva o nome do cliente: ");
            String nomecliente = scanner.nextLine();
            System.out.println("Escreva o cpf do cliente: ");
            String cpfCliente = scanner.nextLine();
            System.out.println("Escreva a idade do cliente: ");
            Integer idadeCliente = scanner.nextInt();
            scanner.nextLine();
            Cliente cliente = new Cliente(nomecliente, cpfCliente,idadeCliente);


            System.out.println("Escreva o nome da conta: ");
            String nomeConta = scanner.nextLine();
            System.out.println("Escreva o saldo da conta: ");
            Double saldoConta = scanner.nextDouble();
            System.out.println("Escreva o numero da conta: ");
            Integer numeroConta = scanner.nextInt();
            scanner.nextLine();

            Conta conta = new Conta(nomeConta, saldoConta, numeroConta,cliente,agencia);


            System.out.println(agencia);
            System.out.println(cliente);
            System.out.println(conta);
        }
        System.out.println(agencia);
    }
}
