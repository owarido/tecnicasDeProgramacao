package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LendoArquivoByte {
    
    public static void main(String[] args) {
        File diretorio = new File("/home/lucas/NetBeansProjects/ManipulacaodeArquivos/POO/LendoArquivoByte");
        if(!diretorio.isDirectory()) {
            diretorio.mkdir();
        }
        File arquivo = new File(diretorio, "ArquivoByte.lsr");
        if(arquivo.isFile() && arquivo.canRead()) {
            try {
                FileInputStream leitor = new FileInputStream(arquivo);
                byte conteudo[] = new byte[(int) arquivo.length()];
                leitor.read(conteudo);
                leitor.close();
                for(int i = 0; i < conteudo.length; i++)
                    System.out.println((char)conteudo[i]);
            }
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
        } else {
            System.out.println("Arquivo aberto ou inexistente");
        }
    }
    
}
