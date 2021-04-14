package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("Janela");
        frame.setSize(300, 200);
        frame.setLocation(500, 300);
        
        JPanel painel = new JPanel();
        JLabel label = new JLabel("Digite seu nome");
        JTextField textField = new JTextField(10);
        JButton botao = new JButton("OK");
        FormularioBotaoAction botaoAction = new FormularioBotaoAction(textField);
        botao.addActionListener(botaoAction);
        
        painel.add(label);
        painel.add(textField);
        painel.add(botao);
        
        frame.add(painel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
