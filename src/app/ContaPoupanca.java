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
    public double jurosCompostos(int anos, double valor){
        if(super.saldo >= valor){
            for(int i = 0; i < anos; i++){
                valor += valor * (super.juros/100);
            }
            super.depositar(valor);
        }
        else{
            System.out.println("Saldo insuficiente para aplicação");
        }
        return valor;
    }
}
