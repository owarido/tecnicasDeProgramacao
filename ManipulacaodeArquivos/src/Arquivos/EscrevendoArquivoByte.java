package Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrevendoArquivoByte {
    
    public static void main(String[] args) {
        File diretorio = new File("/home/lucas/NetBeansProjects/ManipulacaodeArquivos/POO/EscrevendoArquivoByte");
        if(!diretorio.isDirectory()) {
            diretorio.mkdir();
        }
        
        File arquivo = new File(diretorio, "ArquivoByte.lsr");
        
        try {
            FileOutputStream gravador = new FileOutputStream(arquivo);
            byte conteudo[] = {'L', 'I', 'X', 'O'};
            gravador.write(conteudo);
            gravador.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
