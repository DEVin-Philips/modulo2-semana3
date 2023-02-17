public class Funcionario {
    private String nomeFuncionario;
    private String cargo;

    private Carro carroFuncionarios;

    static class Carro{
        private String numeroPlaca;
        private String ano;
        private String marca;

        public static void teste(){}

        public String getNumeroPlaca() {
            return numeroPlaca;
        }

        public void setNumeroPlaca(String numeroPlaca) {
            this.numeroPlaca = numeroPlaca;
        }

        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }
    }


    static {
        System.out.println("Static Funcionario");
    }

    public Funcionario(String nomeFuncionario, String cargo) {
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeFuncionario='" + nomeFuncionario + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Carro getCarroFuncionarios() {
        return carroFuncionarios;
    }

    public void setCarroFuncionarios(Carro carroFuncionarios) {
        this.carroFuncionarios = carroFuncionarios;
    }
}
