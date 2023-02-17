package model;

public class Pessoa implements PessoaInteface{
    private static Integer contadoPessoas=0;
    private Integer idade =0;

    public Pessoa(){
        contadoPessoas++;
    }

    public static Integer getContadoPessoas() {
        return contadoPessoas;
    }

    public void setContadoPessoas(Integer contadoPessoas) {
        Pessoa.contadoPessoas = contadoPessoas;
    }

    @Override
    public Integer envelhecer() {
        return idade++;
    }
}
