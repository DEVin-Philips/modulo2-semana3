
public class Calculadora {
//acesso, tipo retorno, nome, parametros
    public Double soma(Double numero1, Double numero2, Double numero3){
        // para a execução e retorna o valor que está logo a sua direita
        return numero1+numero2+numero3;
    }

    public Double divisao (Double numero1, Double numero2){
        return numero1/numero2;
    }

    public Double calculoEspecifico(Double numero1, Double numero2, Double numero3){
        Double resultado = soma(numero1,numero2, numero3);
        resultado = divisao(resultado,numero3);
        return resultado;
    }
}
