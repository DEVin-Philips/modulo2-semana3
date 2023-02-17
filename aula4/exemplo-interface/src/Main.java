import model.Pessoa;
import model.PessoaCliente;
import model.PessoaInteface;
import repository.PessoaRepository;
import repository.PessoaRepositoryImpl;
import service.PessoaService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa pessoa = new Pessoa(); // this -> pessoa; static -> Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        System.out.println(
                Pessoa.getContadoPessoas()
        );

        PessoaInteface pessoaInteface = new Pessoa();
        PessoaInteface pessoaInteface2 = new PessoaCliente();

        pessoaInteface.envelhecer();


//        PessoaRepository repository = new PessoaRepositoryImpl();
//        PessoaService service = new PessoaService(repository);
//
//        service.adicionarPessoa(new Pessoa());
//        service.removerPessoa(0);




    }
}