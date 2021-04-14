package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrevendoArquivoTexto {
    
    public static void main(String[] args) {
        String pathDir = "/home/lucas/NetBeansProjects/ManipulacaodeArquivos/POO/EscrevendoArquivoTexto";
        File diretorio = new File(pathDir);
        if(!diretorio.isDirectory()) {
            diretorio.mkdir();
        }
        
        try {
            String pathArquivo = pathDir + "/" + "ArquivoTexto.txt";
            FileWriter arquivo = new FileWriter(pathArquivo);
            PrintWriter gravador = new PrintWriter(arquivo);
            for(int i = 0; i < 5; i++) {
                gravador.println("Linha[" + i + "] LIXO-Texto");
            }
            gravador.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
