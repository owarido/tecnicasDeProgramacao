package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eventos {
    
    public static void main(String[] args) {
        /* O modelo de eventos em Swing é composto 
           por event sources e event listeners  */
        
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Janela");
        frame.setLayout(new GridLayout(1, 2));
        
        EventosAction action = new EventosAction();
        
        JButton botao1 = new JButton("Botão 1");
        botao1.addActionListener(action);
        
        JButton botao2 = new JButton("Botão 2");
        // é comum o uso de classes anônimas no tratamento de eventos em Swing
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JButton botao = (JButton) ae.getSource();
                String nome = botao.getText();
                JOptionPane.showMessageDialog(null, nome + " foi pressionado!");
            }            
        });
        
        frame.add(botao1);
        frame.add(botao2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
