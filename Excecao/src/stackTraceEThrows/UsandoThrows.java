package stackTraceEThrows;

import java.util.Scanner;

public class UsandoThrows {
    
    public static void main(String[] args) {
        System.out.print("Entre com um decimal: ");
        try{
            double num = leNumero();
            System.out.println("Dado informado: " + num);
        }
        catch(Exception e) {
            System.out.println("Entrada inválida!");
            e.printStackTrace();
        }
    }
    
    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
           
}
