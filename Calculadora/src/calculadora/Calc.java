package calculadora;

import java.lang.Math;
import java.util.Scanner;

public class Calculadora {
    
    public Calculadora(){ }
    
    public double adicionar(double operandoA, double operandoB){
        double soma = (operandoA + operandoB);
        return soma;
    }
    
    public double subtrair(double operandoA, double operandoB){
        double dif = (operandoA - operandoB);
        return dif;
    }
    
    public double multiplicar(double operandoA, double operandoB){
        double mult = (operandoA * operandoB);
        return mult;
    }
    
    public double dividir(double operandoA, double operandoB){
        double div = (operandoA / operandoB);
        return div;
    }

}