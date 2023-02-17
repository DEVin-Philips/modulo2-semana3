package model;

public class PessoaCliente implements PessoaInteface{
    private static Integer contadoPessoas=0;
    private Integer idade =0;

    private boolean cliente = true;

    PessoaCliente(){
        contadoPessoas++;
    }

    public static Integer getContadoPessoas() {
        return contadoPessoas;
    }

    public void setContadoPessoas(Integer contadoPessoas) {
        PessoaCliente.contadoPessoas = contadoPessoas;
    }

    @Override
    public Integer envelhecer() {
        return idade++;
    }
}
