package app;

public class ContaPoupanca extends Conta{

    //Construtor herança Conta
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    //Métodos
    public void extrato(){
        System.out.println("Extrato conta poupança");
        super.dadosConta();
    }
}
