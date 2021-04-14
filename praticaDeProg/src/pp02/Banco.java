package pp02;

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
    
    public void creditar(String numero, double valor){
        Conta conta = new Conta();
        conta = procurar(numero);
        if(conta != null){
            conta.creditar(valor);
        } else {
            System.out.println("Conta não encontrada");
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
    
    public double saldo(String numero){
        Conta conta = new Conta();
        conta = procurar(numero);
        if(conta != null){
            return conta.getSaldo();
        } else{
            return -1;
        }
    }
    
    public void transferir(String origem, String destino, double valor){
        Conta contaOrigem = new Conta();
        Conta contaDestino = new Conta();
        contaOrigem = procurar(origem);
        contaDestino = procurar(destino);
        if((contaOrigem != null) && (contaDestino != null) && (contaOrigem != contaDestino)){
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);
        } else{
            System.out.println("Não é possível fazer a transferência.");
        }
    }
}