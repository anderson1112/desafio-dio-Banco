public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        cc.transferir(100, cc);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(100, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
