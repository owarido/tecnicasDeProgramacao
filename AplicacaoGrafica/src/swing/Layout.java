package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Janela");
        
        /* Layout Managers
            - Permitem organizar os componentes dentro de containers ou outros componentes   */
        
        // Border Layout: Organiza os componentes em 5 regiões
        /*frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.NORTH, new JButton("NORTH"));
        frame.add(BorderLayout.CENTER, new JButton("CENTER"));
        frame.add(BorderLayout.SOUTH, new JButton("SOUTH"));
        frame.add(BorderLayout.EAST, new JButton("EAST"));
        frame.add(BorderLayout.WEST, new JButton("WEST"));*/
        
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        // Flow Layout: Organiza os componentes em sequência
        /*frame.setLayout(new FlowLayout());
        frame.add(new JButton("Comp 1"));
        frame.add(new JButton("Comp 2"));
        frame.add(new JButton("Comp 3"));
        frame.add(new JButton("Comp 4"));*/
        
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        // Grid Layout: Dispõe os componentes em grade
        frame.setLayout(new GridLayout(2, 4)); // 2 é o número de linhas e 4 é o de colunas
        for (int i = 1; i < 9; i++) {
            frame.add(new JButton("Comp " + i));
        }
        
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);        
    }
    
}
