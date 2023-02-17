import model.Cliente;
import model.Produto;
import repository.ClienteRepository;
import repository.ClienteRepositoryImpl;
import repository.ProdutoRepository;
import service.ClienteService;

public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepositoryImpl();
        clienteRepository.adicionarCliente(new Cliente("a",12.0));

        ProdutoRepository.adicionarProduto(new Produto("pa",6.0));

        ClienteService service = new ClienteService( clienteRepository );
        System.out.println(clienteRepository.retornarCliente(0).getSaldo());

        System.out.println(service.comprarProduto(0,0));

        System.out.println(clienteRepository.retornarCliente(0).getSaldo());
    }
}