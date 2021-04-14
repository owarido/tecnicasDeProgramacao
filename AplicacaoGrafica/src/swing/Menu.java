package swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
    
    public static void main(String[] args) {    
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Janela");
        
        // JMenuBar, JMenu e JMenuItem permitem criar uma barra de menu no container
        JMenuBar menuBar = new JMenuBar();  
        
        JMenu menu = new JMenu("Arquivo");
        menu.setMnemonic('A');
        
        JMenuItem menuItem = new JMenuItem("Sair");
        menuItem.setMnemonic('S');
        menu.add(menuItem);
        
        JMenu menu2 = new JMenu("Editar");
        menu2.setMnemonic('E');
        
        menuBar.add(menu);
        menuBar.add(menu2);
        
        frame.setJMenuBar(menuBar);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
