public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
//        conta1.dono = "Andre";
        conta1.saldo = 10.01;

        if(conta1.depositar(-100.10)){
            System.out.println("Saldo adicionado com sucesso");
        }
        System.out.println(conta1.saldo);


        if(conta1.retirar(1000.10)){
            System.out.println("Saldo retirado com sucesso");
        }
        System.out.println(conta1.saldo);

        conta1.saldo = 1000000.21310;
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
//        conta2.dono = "Lucas";
        conta2.saldo = 1293791.123;

        Conta conta3 = conta2;

//        conta1.transferir(10d,conta2);
//        System.out.println("Dono: "+conta1.dono+ ", saldo:"  +conta1.saldo);
//        System.out.println("Dono: "+conta2.dono+ ", saldo:"  +conta2.saldo);
//        System.out.println("Dono: "+conta3.dono+ ", saldo:"  +conta3.saldo);

//        conta2.transferir(100d,conta1);
//        System.out.println("Dono: "+conta1.dono+ ", saldo:"  +conta1.saldo);
//        System.out.println("Dono: "+conta2.dono+ ", saldo:"  +conta2.saldo);
//        System.out.println("Dono: "+conta3.dono+ ", saldo:"  +conta3.saldo);

        conta1.recursao(10);
    }
}