package app;

public interface ContaAdmin {
     void depositar(double valor);
     void sacar(double valor);
     void transeferir(double valor, Conta contaDestino );
     void dadosConta();
     void saqueTransferencia(double valor);
     void depositoTransferencia(double valor);
}