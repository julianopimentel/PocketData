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

public class MouseGame extends JFrame implements MouseListener, MouseMotionListener{

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;
	
    ImageIcon mira = new ImageIcon("C:/Fontes/mira.png");
    
    int xMira;
    int yMira;
    int lMira;
    int hMira;
    
    int quadrado2X = 225;
    int quadrado2Y = 200;
    int quadrado2L = 50;
    int quadrado2H = 50;
    
    String cor = "RED";
    
    boolean colisaoMouseQuadrado = false;
    
    public boolean colisao(
        int obj1X, int obj1Y, int obj1W, int obj1H,
        int obj2X, int obj2Y, int obj2W, int obj2H) {
        
        if (
            (obj1X >= obj2X && obj1X <= obj2X + obj2W) && 
            (obj1Y >= obj2Y && obj1Y <= obj2Y + obj2H)) {
            return true;
        } else if (
            (obj1X + obj1W >= obj2X && obj1X + obj1W <= obj2X + obj2W) &&
            (obj1Y >= obj2Y && obj1Y <= obj2Y + obj2H)) {
            return true;
        } else if (
            (obj1X >= obj2X && obj1X <= obj2X + obj2W) &&
            (obj1Y + obj1H >= obj2Y && obj1Y + obj1H <= obj2Y + obj2H)) {
            return true;
        } else if (
            (obj1X + obj1W >= obj2X && obj1X + obj1W <= obj2X + obj2W) &&
            (obj1Y + obj1H >= obj2Y && obj1Y + obj1H <= obj2Y + obj2H)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void atualizar() {
        colisaoMouseQuadrado = 
            colisao(
                xMira, yMira, lMira, hMira, 
                quadrado2X, quadrado2Y, quadrado2L, quadrado2H
            );
    }
    
    public void desenharGraficos() {
        
        Graphics g = getGraphics();	
        
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(Color.WHITE);
        bbg.fillRect(0, 0, janelaW, janelaH);	
	bbg.setColor(Color.RED);
        bbg.setFont(new Font("helvica",Font.BOLD,20));
        
        bbg.drawString("X=: "+xMira+"  Y="+yMira, lMira, hMira); 
        bbg.drawImage(mira.getImage(), xMira-25, yMira-25, this);	
        
        bbg.setColor(new Color(0,255,0));
        bbg.fillRect(quadrado2X, quadrado2Y, quadrado2L, quadrado2H);
        g.drawImage(backBuffer, 0, 0, this);
        
        if (colisaoMouseQuadrado) {
            bbg.setColor(Color.BLUE);
            quadrado2X = quadrado2X - 25;
            bbg.fillRect(quadrado2X, quadrado2Y, quadrado2L, quadrado2H);
            System.out.println("Colisao mouse e quadrado!");
        }
		
        bbg.drawImage(mira.getImage(), xMira-25, yMira-25, this);		
        g.drawImage(backBuffer, 0, 0, this);

    }
    
    public void inicializar() {
        
        setTitle("Fisica - Equacao Horaria!");
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

    // Eventos do Mouse
    public void mouseClicked (MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Voce clicou!");}
    public void mouseDragged (MouseEvent e) {}
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited  (MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Colisao com borda!"); }
    public void mouseMoved   (MouseEvent e) {
        xMira = e.getX(); yMira = e.getY();}
    public void mousePressed (MouseEvent e) {
        System.out.println("teste");}
    public void mouseReleased(MouseEvent e) {}
    
    public static void main(String[] args) {
        MouseGame game = new MouseGame();
        game.run();
    }    
}