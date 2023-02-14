import java.util.ArrayList;

public class Pessoa {
    String nome = "AAA";
    ArrayList<Pessoa> listaAmigos = new ArrayList<>();
    Integer idade = 10;
    Boolean casado = false;

    public Integer envelhecer(){
        return this.idade+=1;
    }
}
