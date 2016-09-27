package Exemplos.S08_AcessoIO;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Movimento extends JFrame implements KeyListener{

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 800;
    int janelaH = 500;
	
    char teclaPressionada;
    
    // Posicao do Circulo
    int xBola = 156;
    int yBola = 220;
    
    boolean fimCurso = false;
    
    //ImageIcon mira = new ImageIcon("C:/Java/mouse/mira.png");
    ImageIcon imagem = new ImageIcon("C:/Fontes/canhao1.png");
    ImageIcon fundo = new ImageIcon("C:/Fontes/fundo.jpg");
	
    public void atualizar() {}

    public void disparo(){

        while (xBola < 700) {
        
            xBola = xBola + 10; 
            
            try {
                Thread.sleep(50);
            } 
            catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
        }
        
        fimCurso = true;
    }
    
    public void resetar(){
        fimCurso = false;
        xBola = 156; 
    }
    
    // Eventos do Teclado
    public void keyPressed(KeyEvent e) {
		
        // Variavel recebe o valor UNICODE de tecla pressionada
        teclaPressionada = e.getKeyChar();
		
        // Obs: e.VK_ depois pressione ctrl+espaço (teclas teclado)
        
        if(e.getKeyCode() == e.VK_1) { 
            System.out.print("teste da letra E"); 
        }
        
        // Left = xBola diminue 10
        if(e.getKeyCode() == e.VK_LEFT) { 
            xBola -= 10; 
        }
	
        // Rigth = xBola aumenta 10
        if(e.getKeyCode() == e.VK_RIGHT) { 
            xBola += 10; 
        }
	
        // Up = yBola diminue 10
        if(e.getKeyCode() == e.VK_UP) {
            yBola -= 10; 
        }
        
        // Down = yBola aumenta 10
        if(e.getKeyCode() == e.VK_DOWN) { 
            yBola += 10; 
        }		

        if(e.getKeyCode() == e.VK_F) { 
            disparo();
        }
        
        if(e.getKeyCode() == e.VK_R) { 
            resetar();
        }

    }
    
    public void keyReleased(KeyEvent e) {}
    
    public void keyTyped(KeyEvent e) {}

    public void simulacao() {
        Graphics g = getGraphics();	
        Graphics bbg = backBuffer.getGraphics();
        bbg.setColor(Color.WHITE);
        bbg.fillRect(0, 0, janelaW, janelaH);	
	bbg.setColor(Color.RED);
        bbg.setFont(new Font("helvica",Font.BOLD,20));
        bbg.drawString("Você pressionou: "+teclaPressionada, 50, 100); 
        //bbg.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
        //bbg.drawImage(imagem.getImage(),100,100,100,100,this); // imagem em (x=200,y=200), tamanho em 40%  
        bbg.drawImage(imagem.getImage(),50,200,this); // imagem em (x=200,y=200), tamanho em 40%  
        bbg.fillOval(xBola, yBola, 15, 15);
        
        if (fimCurso) {
            bbg.setColor(Color.BLACK);
            bbg.fillOval(xBola, yBola, 15, 15);
        }
        else {
            bbg.setColor(Color.BLACK);
            //bbg.fillOval(xBola, yBola, 15, 15);
        }
        
        g.drawImage(backBuffer, 0, 0, this);
    }

    public void inicializar() {
        setTitle("Equacao Horaria do Movimento - MRU!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
	addKeyListener(this); // lista de acao das teclas
    }

    public void run() {
        
        inicializar();  // monta a tela
            
        while (true) {
            atualizar(); // comunicacao arduino
            simulacao();
            try { Thread.sleep(1000/FPS); }
            catch (Exception e) { System.out.println("Thread interrompida!"); }
        }
    }

    public static void main(String[] args) {
        Movimento Simulacao = new Movimento();
        Simulacao.run();
    }
}