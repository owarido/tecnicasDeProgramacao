package pp01;

import java.util.Scanner;
import java.lang.Math;

public class Q03 {
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        double a, b, c, delta, x, x1;
        
        System.out.print("\nQuestão 3\n");
        System.out.println("Equação do Segundo Grau");
        System.out.print("Informe o valor de a: ");
        a = scan.nextDouble();
        System.out.print("\nInforme o valor de b: ");
        b = scan.nextDouble();
        System.out.print("\nInforme o valor de c: ");
        c = scan.nextDouble();
        System.out.print("\nEquação: " + a + "x² + " + b + "x + " + c + " = " + " 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.print("\nDelta = " + delta);
        
        if(delta < 0){
            System.out.print("\n\nNão existe raiz pois o delta é menor que 0\nValor do delta: " + delta);
        } else if(delta == 0){
            x =  (-b / (2 * a));
            System.out.print("\nExiste apenas uma raiz para equação, pois o delta é 0.\nRaiz da equação: " + x);
        } else{
            x = (-b + Math.sqrt(delta)) / (2 * a);
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("\nRaízes da equação " + a + "x² + " + b + "x + " + c + " = " + " 0" + ":\nx' = " + x + "\nx'' = " + x1);
        }
        
        scan.close();
    }
    
}
