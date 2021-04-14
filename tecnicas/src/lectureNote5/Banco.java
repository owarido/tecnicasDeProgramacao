package lectureNote5;

public class Banco {
    private Conta[] contas;
    private int indice = 0;
    
    public Banco(){
        contas = new Conta[100];
    }
    
    public void cadastrar(Conta conta){
        contas[indice] = conta;
        indice++;
    }
    
    private Conta procurar(String numero){
        int i = 0;
        boolean achou = false;
        while((!achou) && (i < indice)){
            if(contas[i].getNumero().equals(numero)){
                achou = true;
            } else{
                i++;
            }
        }
        
        if(achou == true){
            return contas[i];
        } else{
            return null;            
        }
    }
    
    public void debitar(String numero, double valor){
        Conta conta;
        conta = procurar(numero);
        if(conta != null){
            conta.debitar(valor);
        } else{
            System.out.println("Conta inexistente!");
        }
    }
}
   