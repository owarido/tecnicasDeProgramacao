package lectureNote8_9;

public class BancoIndependente implements IBanco {
    private IRepositorioConta contas;
    
    public BancoIndependente(IRepositorioConta conta){
        this.contas = contas;
    }
    
    public void cadastrar(ContaAbstrata conta){
        contas.inserir(conta);
    }
    
    public void debitar(String numero, double valor){
        ContaAbstrata conta = contas.procurar(numero);
        
        if(conta != null)
            conta.debitar(valor);
        else
            System.out.println("Conta inexistente!");
    }

    @Override
    public double saldoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numeroContas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaAbstrata procurar(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creditar(String numero, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferir(String origem, String destino, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double saldo(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void renderJuros(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void renderBonus(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
