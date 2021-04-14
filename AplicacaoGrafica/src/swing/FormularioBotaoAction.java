package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioBotaoAction implements ActionListener {
    
    private JTextField text = new JTextField();
    
    public FormularioBotaoAction(JTextField text) {
        this.text = text;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nome = text.getText();
        
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);    
    }
    
}
