import app.Cliente;
import app.ClienteAdmin;
import app.ContaCorrente;
import app.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        //Instanciar objetos
        app.Cliente cliente = new Cliente();
        cliente.setNome("Damian Costa");
        app.ContaCorrente corrente = new ContaCorrente(cliente);
        app.ContaPoupanca poupanca = new ContaPoupanca(cliente);

        //Métodos dos objetos
        corrente.depositar(800000);
        corrente.transeferir(500000, poupanca);
        corrente.extrato(); //300000
        poupanca.extrato(); //500000
        cliente.mudarNome(cliente, "Julia Roberts");
        corrente.extrato(); //Julia Roberts

    }
}