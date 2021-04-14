package pp02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\n1) Testa Calculadora \n2) Testa Conta \n3) Testa Banco \nEscolha a opção desejada: ");
        int opcao = scan.nextInt();
        
        switch(opcao) {
            case 1:
                testaCalculadora();
                break;
            case 2:
                testaConta();
                break;
            case 3:
                testaBanco();
                break;
            default:
                System.out.println("Opção Inexistente!");
                break;
        }
        
        scan.close();
    }
    
    public static void testaCalculadora(){
        Scanner scan = new Scanner(System.in);
        int k = 1;
        int op;
        do {
            System.out.print("\n\n1 - Adição");
            System.out.print("\n2 - Subtração");
            System.out.print("\n3 - Multiplicação");
            System.out.print("\n4 - Divisão");
            System.out.print("\n5 - Potenciação");
            System.out.print("\n6 - Radiciação");
            System.out.print("\n7 - Seno");
            System.out.print("\n8 - Coseno");
            System.out.print("\n9 - Tangente");
            System.out.print("\nQual operação deve ser realizada: ");
            op = scan.nextInt();
            switch(op) {
                case 1:
                    Calculadora ad = new Calculadora();
                    double ad1, ad2, resAd;
                    System.out.print("\n\nInforme um valor: ");
                    ad1 = scan.nextDouble();
                    System.out.print("\nInforme outro valor: ");
                    ad2 = scan.nextDouble();
                    resAd = ad.adicionar(ad1, ad2);
                    System.out.println("Adição: " + ad1 + " + " + ad2 + " = " + resAd);
                    break;
                case 2:
                    Calculadora sub = new Calculadora();
                    double sub1, sub2, resSub;
                    System.out.print("\n\nInforme um valor: ");
                    sub1 = scan.nextDouble();
                    System.out.print("\nInforme outro valor: ");
                    sub2 = scan.nextDouble();
                    resSub = sub.subtrair(sub1, sub2);
                    System.out.println("Subtração: " + sub1 + " - " + sub2 + " = " + resSub);
                    break;
                case 3:
                    Calculadora mult = new Calculadora();
                    double mult1, mult2, resMult;
                    System.out.print("\n\nInforme um valor: ");
                    mult1 = scan.nextDouble();
                    System.out.print("\nInforme outro valor: ");
                    mult2 = scan.nextDouble();
                    resMult = mult.multiplicar(mult1, mult2);
                    System.out.println("Multiplicação: " + mult1 + " x " + mult2 + " = " + resMult);
                    break;
                case 4:
                    Calculadora div = new Calculadora();
                    double div1, div2, resDiv;
                    System.out.print("\n\nInforme um valor: ");
                    div1 = scan.nextDouble();
                    System.out.print("\nInforme outro valor diferente de zero: ");
                    div2 = scan.nextDouble();
                    resDiv = div.dividir(div1, div2);
                    System.out.println("Divisão: " + div1 + " ÷ " + div2 + " = " + resDiv);
                    break;
                case 5:
                    Calculadora pot = new Calculadora();
                    double base, resPot;
                    int exp;
                    System.out.print("\n\nInforme a base: ");
                    base = scan.nextDouble();
                    System.out.print("\nInforme o expoente: ");
                    exp = scan.nextInt();
                    resPot = pot.potencia(base, exp);
                    System.out.println(base + " elevado a " + exp + " = " + resPot);
                    break;
                case 6:
                    Calculadora rad = new Calculadora();
                    double raizQ, resRaiz;
                    System.out.print("\n\nInforme um valor: ");
                    raizQ = scan.nextDouble();
                    resRaiz = rad.raiz(raizQ);
                    System.out.println("A raiz quadrada de " + raizQ + " é: " + resRaiz);
                    break;
                case 7:
                    Calculadora sen = new Calculadora();
                    double ang, resSen;
                    System.out.print("\n\nInforme o ângulo: ");
                    ang = scan.nextDouble();
                    resSen = sen.seno(ang);
                    System.out.println("O seno do ângulo " + ang + "º é: " + resSen);
                    break;
                case 8:
                    Calculadora cos = new Calculadora();
                    double angCos, resCos;
                    System.out.print("\n\nInforme o ângulo: ");
                    angCos = scan.nextDouble();
                    resCos = cos.coseno(angCos);
                    System.out.println("O cosseno do ângulo " + angCos + "º é: " + resCos);
                    break;
                case 9:
                    Calculadora tg = new Calculadora();
                    double angTg, resTg;
                    System.out.print("\n\nInforme o ângulo: ");
                    angTg = scan.nextDouble();
                    resTg = tg.tangente(angTg);
                    System.out.println("A tangente do ângulo " + angTg + "º é: " + resTg);
                    break;
                default:
                    System.out.println("Operação não existente!");
            }
            System.out.print("\nDeseja realizar outra operação 1 - Sim | Qualquer outro número - Não: ");
            k = scan.nextInt();
        } while(k == 1);
        scan.close();
    } 
    
    public static void testaConta(){
        Conta conta1 = new Conta("40800-X");
        Conta conta2 = new Conta("40300-X");
        Conta conta3 = new Conta("40500-X");
        
        conta1.creditar(100);
        conta2.creditar(800);
        conta3.creditar(500);
        
        System.out.println("Saldo atual da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta " + conta3.getNumero() + ": " + conta3.getSaldo());
        
        conta1.debitar(70);
        conta2.debitar(350);
        conta3.debitar(250);
        
        System.out.println("Saldo atual da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta " + conta3.getNumero() + ": " + conta3.getSaldo());
    }
    
    public static void testaBanco(){
        Conta conta1 = new Conta("40800-X");
        Conta conta2 = new Conta("40300-X");
        Conta conta3 = new Conta("40500-X");
        
        Banco banco = new Banco();
        
        banco.cadastrar(conta1);
        banco.cadastrar(conta2);
        banco.cadastrar(conta3);
        
        banco.creditar("40800-X", 800);
        banco.creditar("40300-X", 700);
        banco.creditar("40500-X", 1200);
        
        System.out.println("\nSaldo atual da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta " + conta3.getNumero() + ": " + conta3.getSaldo());
        
        banco.debitar("40800-X", 150);
        banco.debitar("40300-X", 200);
        banco.debitar("40500-X", 400);
        
        System.out.println("\nSaldo atual da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta " + conta3.getNumero() + ": " + conta3.getSaldo());
        
        banco.transferir("40800-X", "40300-X", 350);
        banco.transferir("40300-X", "40500-X", 300);
        banco.transferir("40500-X", "40800-X", 700);
        
        System.out.println("\nSaldo atual da conta " + conta1.getNumero() + ": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta " + conta2.getNumero() + ": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta " + conta3.getNumero() + ": " + conta3.getSaldo());
    }  
}