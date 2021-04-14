package swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContainerEComponents {

    public static void main(String[] args) {
        
        // Containers
        
        // Container JFrame: pode conter diversos componentes
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Janela Principal");
        
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        // Components
        
        // JLabel permite escrever textos
        JLabel label1 = new JLabel();
        label1.setText("Texto de um JLabel");
        
        // JTextField: caixa de texto para entrada de dados
        JTextField textF = new JTextField();
        textF.setText("Texto digitado");
        textF.setColumns(15);
        
        // JTextArea: Caixa de texto para entrada de dados com suporte a múltiplas linhas
        JTextArea textA = new JTextArea();
        textA.setText("Texto digitado\nnem mais de uma linha");
        textA.setRows(5);
        textA.setColumns(20);
        
        // JComboBox: caixa de seleção de itens
        JComboBox combo1 = new JComboBox();
        combo1.addItem("Item 1");
        combo1.addItem("Item 2");
        combo1.addItem("Item 3");
        
        // JRadioButton: Possibilita marcar determinado item de um conjunto de itens
        JRadioButton radio1 = new JRadioButton();
        radio1.setText("Item para marcar");
        
        //JCheckBox: Possibilita marcar ou não determinado item
        JCheckBox check1 = new JCheckBox();
        check1.setText("Item para marcar");
        
        //JButton: Botão para ser pressionado
        JButton botao1 = new JButton();
        botao1.setText("Cancelar");
        
        // JPanel: mesmo não sendo um container, é capaz de agrupar componentes
        JPanel painel = new JPanel();
        painel.add(new JLabel("Digite seu nome: "));
        painel.add(new JTextField(10));
        
        /*----------------------------------------------------------------------------------------------------------------------*/
        
        frame.add(label1);
        frame.add(textF);
        frame.add(textA);
        frame.add(combo1);
        frame.add(radio1);
        frame.add(check1);
        frame.add(botao1);
        frame.add(painel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
