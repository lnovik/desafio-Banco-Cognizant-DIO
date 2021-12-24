
public class Main {
    public static void main(String[] args) {



        Conta corrente = new ContaCorrente(new Cliente("Luan Novik"));
        Conta poupanca = new ContaPoupanca(new Cliente("Breno Cabral"));

        corrente.depositar(100);
        corrente.transferir(100,corrente);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();






    }

}
