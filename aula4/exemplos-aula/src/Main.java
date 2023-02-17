

public class Main {
    public static void main(String[] args) {

//        Empresa empresa1 = new Empresa("empresa1");
//        empresa1.listarEmpresas();
//        System.out.println("================");
//
//        Empresa empresa2 = new Empresa("empresa2");
//        empresa1.listarEmpresas();
//        System.out.println("================");
//
//        Empresa empresa3 = new Empresa("empresa3");
//        empresa1.listarEmpresas();
//        System.out.println("================");
//
//        empresa1.adicionarFuncionario(new Funcionario("Igor", "Programador Junior"));
//        empresa1.adicionarFuncionario(new Funcionario("Giovanni", "Programador Junior"));
//        empresa1.adicionarFuncionario(new Funcionario("George", "Programador Junior"));
//        empresa1.adicionarFuncionario(new Funcionario("Gustavo", "Programador Junior"));
//
//        empresa1.listarFuncionarios();
//        System.out.println("================");
//
//        empresa2.adicionarFuncionario(new Funcionario("André","PO"));
//        empresa2.adicionarFuncionario(new Funcionario("Rodolfo","Severino"));
//        empresa2.listarFuncionarios();
//        System.out.println("================");
//
//        empresa1.listarEmpresas();

//        Empresa empresa = new Empresa("empresa");
//        Funcionario funcionario = new Funcionario("funcionario", "gerente");
//
//        Empresa empresa1 = new Empresa("empresa");


        Funcionario funcionario = new Funcionario("a","a");
        Funcionario funcionario2 = new Funcionario("a","a");

        Funcionario.Carro carro = new Funcionario.Carro();
        carro.setMarca("Ford");
        carro.setAno("1928");
        carro.setNumeroPlaca("123");

        funcionario.setCarroFuncionarios(carro);

        Funcionario.Carro.teste();

        System.out.println(funcionario.getCarroFuncionarios().getAno());
        System.out.println(funcionario2.getCarroFuncionarios().getAno());

    }
}