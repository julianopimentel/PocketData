package PlanoCartesiano;

import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela extends JFrame {
    JFrame frame;
    JPanel panelMain, panelForm;
    Canvas tela;
    JLabel vetx, vety;
    
    public void renderizarGUI() {        

        tela = new Tela();
        //vety = new JLabel("X", JLabel.CENTER);
        //vety.setFont(new Font("Courir New", Font.BOLD, 15));
        
        
        frame = new JFrame();                
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tela, BorderLayout.CENTER); 
        //frame.getContentPane().add(vety, BorderLayout.SOUTH);
        
        //frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
