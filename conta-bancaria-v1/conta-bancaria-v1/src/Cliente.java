import java.time.LocalDate;

public class Cliente {
    String nome;
    Integer idade;
    LocalDate dataNascimento;
    Endereco endereco = new Endereco();

    public Integer aniversarioClinte(){
        this.idade ++;
        return idade;
    }
}
