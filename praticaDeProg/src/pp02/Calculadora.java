package pp02;

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
    
    public double potencia(double base, int expoente){
        double pot = Math.pow(base, expoente);
        return pot;
    }
    
    public double raiz(double radicando){
        double raizQ = Math.sqrt(radicando);
        return raizQ;
    }
    
    public double seno(double angulo){
        double a = Math.toRadians(angulo);
        double sen = Math.sin(a);
        return sen;
    }
    
    public double coseno(double angulo){
        double a = Math.toRadians(angulo);
        double cos = Math.cos(a);
        return cos;
    }
    
    public double tangente(double angulo){
        double a = Math.toRadians(angulo);
        double tan = Math.tan(a);
        return tan;
    }   
}