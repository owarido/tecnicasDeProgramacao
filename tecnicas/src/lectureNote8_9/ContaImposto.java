package lectureNote8_9;

public class ContaImposto extends Conta {
    
    public ContaImposto(String numero){
        super(numero);
    }    
    
    public void debitar(double valor){
        saldo = saldo - (valor + (valor * 0.001));
    }
}