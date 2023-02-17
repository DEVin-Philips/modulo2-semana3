package repository;

import model.Pessoa;

public interface PessoaRepository {
    void adicionarPessoa(Pessoa pessoa);
    Pessoa removerPessoa(Integer id);
}
