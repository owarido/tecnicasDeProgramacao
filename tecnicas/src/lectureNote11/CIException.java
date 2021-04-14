package lectureNote11;

public class CIException extends Exception {
    private String numero;
    
    public CIException(String numero){
        super("Conta Inexistente");
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
}
