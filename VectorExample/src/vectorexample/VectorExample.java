package vectorexample;

import java.io.*;
import java.util.*;

public class VectorExample {

    public static void main(String[] args) {
        // Tamanho do Vector
        int n = 5;
        
        // Declarando o Vector com tamanho inicial n 
        Vector<Integer> v = new Vector<Integer>(n);
        
        // Anexando novos elementos em todo o Vector 
        for(int i = 1; i <= n; i++)
            v.add(i);
        
        // Mostrando todos os elementos 
        System.out.println(v);
        
        // Removendo elemento no índice 3
        v.remove(3);
        
        // Exibindo o Vector após a remoção
        System.out.println(v);
        
        // Mostrando todos os elementos um por um
        for(int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
        
        System.out.println("\n\n\n");
        
        // 1 - ADICIONANDO ELEMENTOS
        
        // Criação padrão do Vector
        Vector v1 = new Vector();
        
        // Adicionando elementos usando o método add()
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);
        
        // Mostrando o Vector
        System.out.println("Vector v1 is: " + v1);
        
        // Criando Vector genérico
        Vector<Integer> v2 = new Vector<Integer>();
        
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Vector v2 is: " + v2);
        
        System.out.println("\n\n\n");
        
        // 2 - MUDANDO ELEMENTOS
        
        // Criando um Vector vazio
        Vector<Integer> vec_tor = new Vector<Integer>();
        
        // Usando método add() para adicionar elementos no Vector
        vec_tor.add(12);
        vec_tor.add(23);
        vec_tor.add(22);
        vec_tor.add(10);
        vec_tor.add(20);
        
        // Exibindo o Vector
        System.out.println("Vector: " + vec_tor);
        
        // Usando método set() para substituir 12 por 21
        System.out.println("O objeto substituído foi: " + vec_tor.set(0, 21));
        
        // Usando método set() para substituir 20 por 50
        System.out.println("O objeto substituído foi: " + vec_tor.set(4, 50));
        
        // Exibindo o Vector modificado
        System.out.println("O novo Vector é: " + vec_tor);
        
        System.out.println("\n\n\n");
        
        // 3 - REMOVENDO ELEMENTOS
        
        /* É possível remover elementos de duas formas:
           
            == remove(Object): método usado para simplesmente remover um objeto do Vector. 
                Se houver vários desses objetos, a primeira ocorrência do objeto é removida
           
            == remove(int index): Como um vetor é indexado, este método assume um valor inteiro 
                que simplesmente remove o elemento presente naquele índice específico no Vector. 
                Após a remoção do elemento, todos os elementos são movidos para a esquerda para
                preencher o espaço e os índices dos objetos são atualizados. */
        
        // Criando Vector padrão de capacidade 10
        Vector v3 = new Vector();
        
        // Add elementos usando método add()
        v3.add(1);
        v3.add(2);
        v3.add("geeks");
        v3.add("forGeeks");
        v3.add(4);
        
        // Removendo o primeiro elemento de ocorrência na posição 1 
        v3.remove(1);
        
        // Checando o Vector
        System.out.println("Vector após a remoção: " + v3);
        
        System.out.println("\n\n\n");
        
        // 4 - VECTOR ITERATIVO
        
        // Criando a instância de um Vector
        Vector<String> v4 = new Vector<>();
        
        // Adicionando elementos usando método add()
        v4.add("Geeks");
        v4.add("Geeks");
        v4.add(1, "For");
        
        // Usando o método Get
        for(int i = 0; i < v4.size(); i++)
            System.out.print(v4.get(i) + " ");
        
        System.out.println();
        
        // Using the for eachv loop
        for(String str : v4)
            System.out.print(str + " ");
    }
}
