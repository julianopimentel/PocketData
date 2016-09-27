package Exemplos.S07_Threads;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;

public class Thread05 extends JFrame {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;

    public void atualizar() {}

    public void desenharTexto() {
        
        Graphics g = getGraphics();
        Graphics bbg = backBuffer.getGraphics();
	
        bbg.setColor(new Color(100,200,100));   // muda a cor!
        bbg.setFont(new Font("Comic Sans MS",Font.BOLD,20)); // fonte, estilo negrito(bold), tamanho
        bbg.drawString("TELA EM JAVA 1", 100, 200); // texto nas coordenadas X=100 e Y=200
	
        /*bbg.setColor(Color.RED);
        bbg.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        bbg.drawString("TELA EM JAVA 2 ", 150, 225);
	
        bbg.setColor(Color.YELLOW);
        bbg.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        bbg.drawString("TELA EM JAVA 3 ", 100, 250);
	*/		
        g.drawImage(backBuffer, 0, 0, this);
    }

    public void desenharTexto1() {
        
        Graphics g1 = getGraphics();
        Graphics bbg1 = backBuffer.getGraphics();
	
        bbg1.setColor(Color.RED);
        bbg1.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        bbg1.drawString("TELA EM JAVA 2 ", 150, 225);
	
        g1.drawImage(backBuffer, 0, 0, this);
    }

    public void desenharTexto2() {
        
        Graphics g2 = getGraphics();
        g2.setColor(new Color(255,255,0)); 
        
        Graphics bbg2 = backBuffer.getGraphics();
	
        bbg2.setColor(Color.YELLOW);
        bbg2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        bbg2.drawString("TELA EM JAVA 3 ", 175, 250);
			
        g2.drawImage(backBuffer, 0, 0, this);
    }
    
        public void desenharTexto3() {
        
        Graphics g2 = getGraphics();
        g2.setColor(new Color(255,255,0)); 
        
        Graphics bbg2 = backBuffer.getGraphics();
	
        bbg2.setColor(Color.PINK);
        bbg2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        bbg2.drawString("TELA EM JAVA 4 ", 200, 275);
			
        g2.drawImage(backBuffer, 0, 0, this);
    }


    public void desenharTexto4() {
        
        Graphics g2 = getGraphics();
        g2.setColor(new Color(255,255,0)); 
        
        Graphics bbg2 = backBuffer.getGraphics();
	
        bbg2.setColor(Color.YELLOW);
        bbg2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        bbg2.drawString("Desligando os Sistemas ...", 200, 400);
			
        g2.drawImage(backBuffer, 0, 0, this);
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
        
            try {
                Thread.sleep(3000);
                desenharTexto();
                Thread.sleep(3000);
                desenharTexto1();
                Thread.sleep(3000);                
                desenharTexto2();
                Thread.sleep(3000);
                desenharTexto3();
                Thread.sleep(3000);
                desenharTexto4();
                Thread.sleep(5000);
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
            
        }
    }
    
    public static void main(String[] args) {
        Thread05 tela = new Thread05();
        tela.run();
    }
}