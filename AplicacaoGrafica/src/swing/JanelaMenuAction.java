package swing;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class JanelaMenuAction extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
}
