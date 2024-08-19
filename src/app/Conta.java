package app;

public abstract class Conta {

    //Constantes
    protected static int AGENCIA_PADRAO = 001;
    protected static int SEQUENCIAL = 1;

    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //Métodos
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void transeferir(double valor, Conta contaDestino ){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void dadosConta(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Id: %d", this.cliente.getId()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    //Construtores
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
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

}