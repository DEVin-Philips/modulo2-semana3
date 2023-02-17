package service;

import model.Pessoa;
import repository.PessoaRepository;
import repository.PessoaRepositoryImpl;

public class PessoaService {

    private final PessoaRepository pessoaRepository; //receber um objeto do tipo Pessoa Repository

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoaRepository.adicionarPessoa(pessoa);
    }

    public void removerPessoa(Integer id){
        pessoaRepository.removerPessoa(id);
    }
}
