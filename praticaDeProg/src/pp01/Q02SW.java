package pp01;

import java.util.Scanner;

public class Q02SW {
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        float a, b;
        int k;
        
        System.out.print("\nQuestão 2 usando Switch\n");
        System.out.print("\nInforme o valor de a: ");
        a = scan.nextFloat();
        System.out.print("\nInforme o valor de b: ");
        b = scan.nextFloat();
        System.out.print("\nOperações:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.print("\nInforme o número para realizar a operação desejada: ");
        k = scan.nextInt();
        
        switch(k){
            case 1:
                System.out.println("Soma: " + a + " + " + b + " = " + (a + b));                
                break;
            case 2:
                System.out.println("Subtração: " + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplicação: " + a + " x " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println("Divisão: " + a + " ÷ " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Operação Inválida!");
        }
        
        scan.close();
    }
    
}
