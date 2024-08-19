package app;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements ContaAdmin {

    //Constantes
    protected static int AGENCIA_PADRAO = 001;
    protected static int SEQUENCIAL = 1;
    protected static int TRANSFERID = 0;

    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected static double juros;
    protected List<String> transacoes = new ArrayList<>();

    //Métodos static (Sem instanciar)
    public static void mudarJuros(double novoJuros){
        Conta.setJuros(novoJuros);
        System.out.println(String.format("Juros alterado: %.2f", novoJuros));
    }

    //Métodos interface ContaAdmin
    @Override
    public void depositar(double valor){
        saldo += valor;
        int transacId = this.TRANSFERID++;
        transacoes.add("deposito: $" + valor + " " + "ID: " + transacId);
    }
    @Override
    public void sacar(double valor){
        saldo -= valor;
        int transacId = this.TRANSFERID++;
        transacoes.add("saque: $" + valor + " " + "ID: " + transacId);
    }
    @Override
    public void saqueTransferencia(double valor){ //Não registra como um saque
        saldo -= valor;
        int transacId = this.TRANSFERID++;
        transacoes.add("Enviou transferencia: $" + (valor * -1) + " " + "ID: " + transacId);
    }
    @Override
    public void depositoTransferencia(double valor){ //Não registra como um saque
        saldo += valor;
        int transacId = this.TRANSFERID++;
        transacoes.add("Recebeu transferencia: $" + valor  + " " + "ID: " + transacId);
    }
    @Override
    public void transeferir(double valor, Conta contaDestino ){
        this.saqueTransferencia(valor);
        contaDestino.depositoTransferencia(valor);
    }
    @Override
    public void dadosConta(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Id: %d", this.cliente.getId()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(this.transacoes);
    }

    //Construtores
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.juros = 15.5;
    }

    //Geters and Setters
    public int getConta() {
        return numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public static double getJuros() {
        return juros;
    }
    public static void setJuros(double juros) {
        Conta.juros = juros;
    }
}