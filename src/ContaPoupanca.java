public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1;



    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }


    }






