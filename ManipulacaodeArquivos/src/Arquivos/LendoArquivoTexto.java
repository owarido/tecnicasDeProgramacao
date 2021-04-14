package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoTexto {

    public static void main(String[] args) {
        try {
            String pathDir = "/home/lucas/NetBeansProjects/ManipulacaodeArquivos/POO/LendoArquivoTexto";
            String pathArquivo = pathDir + "/" + "ArquivoTexto.txt";
            FileReader arquivo = new FileReader(pathArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);
            String conteudo = leitor.readLine();
            while(conteudo != null) {
                System.out.println(conteudo);
                conteudo = leitor.readLine();
            }
            leitor.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
