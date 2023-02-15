import model.Conta;
import service.ContaService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ContaService service = new ContaService();
        service.depositar(10.10, new Conta());

        service.teste();
    }
}