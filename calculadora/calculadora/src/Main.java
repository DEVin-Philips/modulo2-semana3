public class Main {
    public static void main(String[] args) {
        // classe    objeto
        // tipo      instancia
        Calculadora calculadora = new Calculadora();
        Integer valorQualquer=0;

        System.out.println(
                calculadora.soma(1.13687126347861, 2.182738916723, 3d)
        );

        System.out.println(
            calculadora.calculoEspecifico(1.13687126347861, 2.182738916723, 3d)
        );

    }
}
