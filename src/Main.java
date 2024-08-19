import app.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Damian Costa");
        ContaCorrente corrente = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        corrente.depositar(50000);
        corrente.transeferir(10000, poupanca);
        corrente.extrato();
        System.out.println("");
        poupanca.extrato();
        System.out.println("");
        cliente.mudarNome(cliente, "Ju Robson");
        System.out.println("");
        corrente.extrato();
        Conta.mudarJuros(25);
        double show = poupanca.jurosCompostos(10, 10000);
        System.out.println("");
        System.out.println(String.format("Juros: %.2f", show));
        System.out.println("");
        poupanca.extrato();
    }
}