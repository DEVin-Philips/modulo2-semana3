package service;

import model.Cliente;
import model.Produto;
import repository.ClienteRepository;
import repository.ClienteRepositoryImpl;
import repository.ProdutoRepository;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Double comprarProduto(int idCliente, int idProduto){
        Cliente cliente = repository.retornarCliente(idCliente);
        Produto produto = ProdutoRepository.retornarProduto(idProduto);

        cliente.setSaldo(cliente.getSaldo()-produto.getValorProduto());
        return cliente.getSaldo();
    }

}
