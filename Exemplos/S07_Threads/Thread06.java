// Exercicio: trocar as imagens

package Exemplos.S07_Threads;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Thread06 extends JFrame {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;
	
    ImageIcon imagem = new ImageIcon("C:/Fontes/java-linux.png");
    ImageIcon fundo = new ImageIcon("C:/Fontes/fundo.png");
	
    public void atualizar() {}

    public void desenharGraficos1() {
        Graphics g1 = getGraphics();	
        Graphics bbg1 = backBuffer.getGraphics();
        bbg1.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
        g1.drawImage(backBuffer, 0, 0, this);
        g1.drawImage(backBuffer, 0, 0, this);
    }
    
    public void desenharGraficos2() {
        Graphics g2 = getGraphics();	
        Graphics bbg2 = backBuffer.getGraphics();
        bbg2.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
        bbg2.drawImage(imagem.getImage(),100,220,40,40,this); // imagem em (x=200,y=200), tamanho em 40%  
        g2.drawImage(backBuffer, 0, 0, this);    
    }

    public void desenharGraficos3() {
        Graphics g3 = getGraphics();	
        Graphics bbg3 = backBuffer.getGraphics();
        bbg3.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
        bbg3.drawImage(imagem.getImage(),250,100,90,90, this);       // imagem em (x=200,y=200)
        g3.drawImage(backBuffer, 0, 0, this);    
    }    
    
    public void desenharGraficos4() {
        Graphics g4 = getGraphics();	
        Graphics bbg4 = backBuffer.getGraphics();
	bbg4.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
	Graphics2D bbg2d = (Graphics2D) backBuffer.getGraphics();   
        
        bbg2d.translate((imagem.getIconWidth()/2)+300,(imagem.getIconHeight()/2)+300);
        bbg2d.rotate(45*(Math.PI/180)); //calcular 45º
        bbg2d.translate(-((imagem.getIconWidth()/2)+300), -((imagem.getIconHeight()/2)+300));
        bbg2d.drawImage(imagem.getImage(),300,300,this); //desenha a imagem
	
        g4.drawImage(backBuffer, 0, 0, this);
    }
    
    public void inicializar() {
        setTitle("Titulo do Jogo!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
    }

    public void run() {
        
        inicializar();
        
        while (true) {
            atualizar();
            
            desenharGraficos1();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
            
            desenharGraficos2();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
            
            desenharGraficos3();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
            
            desenharGraficos4();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
        }
    }

    public static void main(String[] args) {
        Thread06 tela = new Thread06();
        tela.run();
    }
}