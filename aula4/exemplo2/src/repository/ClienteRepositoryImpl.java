package repository;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {
    private static List<Cliente> listaCliente = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public Boolean removerCliente(Cliente cliente){
        return listaCliente.remove(cliente);
    }

    public Cliente removerCliente(int id){
        return listaCliente.remove(id);
    }

    public Cliente retornarCliente(int id){
        return listaCliente.get(id);
    }
}
