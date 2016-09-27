package Exemplos.S08_AcessoIO;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseTeste extends JFrame implements MouseListener, MouseMotionListener {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;
	
    ImageIcon mira = new ImageIcon("C:/Fontes/mira.png");
    int xMira;
    int yMira;
	
    public void atualizar() {}

    public void desenharGraficos() {
        
        Graphics g = getGraphics();	
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(Color.WHITE);
        bbg.fillRect(0, 0, janelaW, janelaH);	
		
        bbg.setColor(Color.RED);
        bbg.setFont(new Font("helvica",Font.BOLD,20));
        bbg.drawString("X=: "+xMira+"  Y="+yMira, 50, 100); 
	bbg.drawImage(mira.getImage(), xMira-25, yMira-25, this);
		
        g.drawImage(backBuffer, 0, 0, this);
    }

    // Eventos do Mouse
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Você clicou!!!!");
    }
    
    public void mouseMoved(MouseEvent e) {
        xMira = e.getX();
        yMira = e.getY();
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
        
    public void inicializar() {
    
        setTitle("Titulo do Jogo!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
		
	// Eventos do Mouse
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void run() {
        
        inicializar();
        
        while (true) {
            
            atualizar();
            desenharGraficos();
            
            try {
                Thread.sleep(1000/FPS);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
        }
    }    
        
    public static void main(String[] args) {
        MouseTeste game = new MouseTeste();
        game.run();
    }        
}