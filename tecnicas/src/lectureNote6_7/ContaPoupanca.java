package lectureNote6_7;

public class ContaPoupanca extends Conta {
   
    public ContaPoupanca(String numero) {
        super(numero);
    }
    
    public void renderJuros(double taxa){
        creditar(getSaldo() * taxa);
    }
}
