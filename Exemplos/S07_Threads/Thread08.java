package Exemplos.S07_Threads;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Thread08 extends JFrame {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;
	
    Animacao modem1 = new Animacao(5, 360, 425);
    Animacao modem2 = new Animacao(5, 100, 425);
	
    ImageIcon fundo = new ImageIcon("C:/Fontes/cidade.png");
	
    public void atualizar() {}

    public void desenharGraficos() {
        Graphics g = getGraphics();	
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.drawImage(fundo.getImage(),0,0,this);
		
        bbg.drawImage(modem1.cenas[modem1.cena].getImage(), modem1.x, modem1.y, this);
        modem1.animarMaisLento50();	
		
        bbg.drawImage(modem2.cenas[modem2.cena].getImage(), modem2.x, modem2.y, this);
        modem2.animarMaisLento50();	
        
        g.drawImage(backBuffer, 0, 0, this);
    }

    public void inicializar() {
        setTitle("Titulo da Tela!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
		
        
        modem1.cenas[0] = new ImageIcon("C:/Fontes/modem01.gif");
        modem1.cenas[1] = new ImageIcon("C:/Fontes/modem02.gif");
        modem1.cenas[2] = new ImageIcon("C:/Fontes/modem03.gif");
        modem1.cenas[3] = new ImageIcon("C:/Fontes/modem04.gif");
        modem1.cenas[4] = new ImageIcon("C:/Fontes/modem05.gif");
        modem1.largura = 100; // largura
        modem1.altura =  200; // altura
		
        modem2.cenas[0] = new ImageIcon("C:/Fontes/modem01.gif");
        modem2.cenas[1] = new ImageIcon("C:/Fontes/modem02.gif");
        modem2.cenas[2] = new ImageIcon("C:/Fontes/modem03.gif");
        modem2.cenas[3] = new ImageIcon("C:/Fontes/modem04.gif");
        modem2.cenas[4] = new ImageIcon("C:/Fontes/modem05.gif");
        
        modem2.largura = 100;	
        modem2.altura =  200;	
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
        Thread08 tela = new Thread08();
        tela.run();
    }
}