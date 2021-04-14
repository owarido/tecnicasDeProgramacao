package pp01;

import java.util.Scanner;

public class Q01 {
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        int a, b;
        
        System.out.print("\nQuestão 1\n");
        System.out.print("\nInforme um valor: ");
        a = scan.nextInt();
        System.out.print("\nInforme outro valor: ");
        b = scan.nextInt();
        
        if(a > b){
            System.out.println("o valor " + a + " é maior que " + b);
        } else if(b > a){
            System.out.println("o valor " + b + " é maior que " + a);
        } else{
            System.out.println("Os valores " + a + " e " + b + " são iguais");
        }
        
        scan.close();
    }
    
}
