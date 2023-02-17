package repository;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public interface ClienteRepository {
    void adicionarCliente(Cliente cliente);
    Boolean removerCliente(Cliente cliente);
    Cliente removerCliente(int id);
    Cliente retornarCliente(int id);
}
