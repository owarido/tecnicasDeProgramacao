package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {
    
    public static void main(String[] args) {
        File diretorio = new File("/home/lucas/NetBeansProjects/ManipulacaodeArquivos/POO/CriarArquivo");
        diretorio.mkdir();
        File subdiretorio = new File(diretorio, "Provas");
        subdiretorio.mkdir();
        subdiretorio = new File(diretorio, "Exercicios");
        subdiretorio.mkdir();
        File arquivo = new File(diretorio, "PlanoAula.txt");
        
        try {
            FileWriter gravador = new FileWriter(arquivo);
            gravador.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        String arquivos[] = diretorio.list();
        for(int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
        }
    }
    
}
