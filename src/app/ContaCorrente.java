package app;

public class ContaCorrente extends Conta{

    //Construtor herança Conta
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    //Métodos
    public void extrato(){
        System.out.println("Extrato conta corrente");
        super.dadosConta();
    }
}
