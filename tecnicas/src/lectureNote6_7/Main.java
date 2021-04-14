package lectureNote6_7;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        ContaPoupanca poupanca = new ContaPoupanca("21.342-7");
        poupanca.creditar(500.87);
        poupanca.debitar(45.00);
        System.out.println("Saldo da Conta Poupança " + poupanca.getNumero() + ": " + poupanca.getSaldo());
        poupanca.renderJuros(0.01);
        System.out.println("Saldo atual da Conta Poupança " + poupanca.getNumero() + ": " + poupanca.getSaldo() + "\n\n");
        
        Conta conta = new ContaPoupanca("21340-7"); // Substituição
        conta.creditar(500.87);
        conta.debitar(45.00);
        System.out.println("Saldo da conta " + conta.getNumero() + ": " + conta.getSaldo() + "\n\n");
        
        /*  Coerção e Tipo Dinâmico
            Coerção: facilita a verificação estática de tipos. Porém, em tempo de execução,
                     pode levar a erros de casamento de tipo */
        
        Conta conta1 = new ContaPoupanca("21345-7"); // Substituição
        conta1.creditar(500.87);
        conta1.debitar(45.00);
        System.out.println("Saldo da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        ((ContaPoupanca) conta1).renderJuros(0.01);
        System.out.println("Saldo da conta " + conta1.getNumero() + ": " + conta1.getSaldo() + "\n\n\n");
        
        verificaPoupanca();
    }
    
    public static void verificaPoupanca(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Escolha: [1] Conta e [2] Poupança: ");
        Conta conta = null;
        
        if(scan.nextInt() == 1){
            conta = new Conta("21342-7");
        } else{
            conta = new ContaPoupanca("21342-7");
        }
        
        conta.creditar(500.87);
        conta.debitar(45.00);
        System.out.print("\n Saldo da conta: " + conta.getSaldo());
        if(conta instanceof ContaPoupanca){
            ((ContaPoupanca) conta).renderJuros(0.1);
            System.out.print("\n Saldo da conta com juros: " + conta.getSaldo());
        }
        
        scan.close();
    }
    
}
