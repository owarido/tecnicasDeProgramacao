package swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JanelaMenus extends JFrame {
    
    public JanelaMenus() {
       setTitle("Minha Aplicação");
       setSize(600, 300);
       setLocation(350, 200);
       
       JMenuBar menuBar = new JMenuBar();
       JMenu menuArquivo = new JMenu("Arquivo");
       menuArquivo.setMnemonic('A');
       JMenuItem itemNovo = new JMenuItem("Novo");
       itemNovo.setMnemonic('N');
       JMenuItem itemSair = new JMenuItem(new JanelaMenuAction());
       itemSair.setText("Sair");
       itemSair.setMnemonic('S');
       
       JMenu menuEditar = new JMenu("Editar");
       menuEditar.setMnemonic('E');
       JMenuItem itemCopiar = new JMenuItem("Copiar");
       itemCopiar.setMnemonic('C');
       
       menuArquivo.add(itemNovo);
       menuArquivo.add(itemSair);
       
       menuEditar.add(itemCopiar);
       
       menuBar.add(menuArquivo);
       menuBar.add(menuEditar);
              
       setJMenuBar(menuBar);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
    }
    
    public static void main(String[] args) {
        new JanelaMenus();
    }
    
}
