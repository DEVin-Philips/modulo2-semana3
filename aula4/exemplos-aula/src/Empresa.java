import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeEmpresa;
    private List<Funcionario> listaFuncionarios = new ArrayList<>();
    private List<Empresa> listaEmpresas = new ArrayList<>();

    static {
        System.out.println("Static Empresa");
    }


    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        //Empresa.listaEmpresas.add(empresa3)
        listaEmpresas.add(this);
    }

    public Empresa(String nomeEmpresa, List<Empresa> listaEmpresas) {
        this.nomeEmpresa = nomeEmpresa;
        //Empresa.listaEmpresas.add(empresa3)
        listaEmpresas.add(this);
    }


    public Empresa(List<Empresa> listaEmpresas, String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        //Empresa.listaEmpresas.add(empresa3)
        listaEmpresas.add(this);
    }


    public void listarEmpresas(){
        listaEmpresas.forEach(System.out::println);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.listaFuncionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        this.listaFuncionarios.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", listaFuncionarios=" + listaFuncionarios +
                '}';
    }
}
