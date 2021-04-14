package lectureNote4;

import java.util.Scanner;

public class olaMundinho {

    public void digaOla(){
        System.out.println("Olá mundinho mais avançado!");
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Olá mundinho!\n");
        
        olaMundinho mundinho = new olaMundinho();
        mundinho.digaOla();
        
        int k = 10;
        System.out.println("k = " + k);
        
        String nome = new String();
        float a;
        System.out.print("Digite um nome: ");
        nome = scan.nextLine();        
        System.out.println("Nome informado: " + nome);
        System.out.print("Informe o valor: ");
        a = scan.nextFloat();
        System.out.println("Valor informado: " + a);
                
        scan.close();
    }
}
