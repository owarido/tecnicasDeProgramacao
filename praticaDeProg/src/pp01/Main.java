package pp01;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha a questão a ser respondida");
        System.out.println("1 para Questão 1\n2 para Questão 2 (If)\n3 para Questão 2 (Switch)\n4 para Questão 3");
        System.out.print("Informe a opção: ");
        int i = scan.nextInt();
        
        switch(i){
            case 1:
                Q01 q01 = new Q01();
                q01.run();
                break;
            case 2:
                Q02 q02 = new Q02();
                q02.run();
                break;
            case 3:
                Q02SW qu02sw = new Q02SW();
                qu02sw.run();
                break;
            case 4:
                Q03 q03 = new Q03();
                q03.run();
                break;
            default:
                System.out.println("Questão Inexistente");
        }
        
        scan.close();
    }
    
}
