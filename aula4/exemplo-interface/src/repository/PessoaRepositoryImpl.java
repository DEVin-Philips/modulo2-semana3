package repository;

import model.Pessoa;

public class PessoaRepositoryImpl implements PessoaRepository{
    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        System.out.println("adicionar");
    }

    @Override
    public Pessoa removerPessoa(Integer id) {
        return null;
    }
}
