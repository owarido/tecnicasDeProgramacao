package lectureNote8_9;

public class Conta extends ContaAbstrata {
    private String numero;
    protected double saldo;
    
    public Conta(String numero){
        super(numero);
        saldo = 0;
    }   
    
    public void creditar(double valor){
        saldo = saldo + valor;
    }
    
    public void debitar(double valor){
        saldo = saldo - valor;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
