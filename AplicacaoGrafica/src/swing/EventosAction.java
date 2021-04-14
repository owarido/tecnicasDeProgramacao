package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EventosAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
            
        JButton botao = (JButton) ae.getSource();
        String nome = botao.getText();
        JOptionPane.showMessageDialog(null, nome + " foi pressionado");
    }
    
    
    
}
