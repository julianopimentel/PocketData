package Exemplos.S08_AcessoIO;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EquacaoHoraria extends JFrame 
    implements KeyListener, MouseListener, MouseMotionListener {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 800;
    int janelaH = 600;
	
    // Posicao do Circulo
    int xBola = 156;
    int yBola = 220;
    
    // Posica Mira
    int xMira = 0;
    int yMira = 0;
    
    char teclaPressionada;
    boolean fimCurso = false;
    
    // Velocidade
    int velocidade = 0;
    int espaco = 0;
    int espacoFinal = 0;
    int tempo = 0;
    
    //ImageIcon mira = new ImageIcon("C:/Java/mouse/mira.png");
    ImageIcon imagem = new ImageIcon("C:/Fontes/canhao1.png");
    ImageIcon fundo = new ImageIcon("C:/Fontes/fundo.jpg");
	
    public void atualizar() {}

    public void calcEspaco(){
        espaco = velocidade * tempo;
    }
    
    public void disparo(){
    
        while (xBola < 700) {
        
            xBola = xBola + 10; 
            
            try {
                Thread.sleep(1000/velocidade);
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
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    
    public void keyPressed(KeyEvent e) {
        
        teclaPressionada = e.getKeyChar();
        
        if(e.getKeyCode() == e.VK_1) {System.out.print("teste da letra E");}
        if(e.getKeyCode() == e.VK_LEFT) {xBola -= 10;}
	if(e.getKeyCode() == e.VK_RIGHT) {xBola += 10;}
	if(e.getKeyCode() == e.VK_UP) {yBola -= 10;}
        if(e.getKeyCode() == e.VK_V) {velocidade += 10;}		
        if(e.getKeyCode() == e.VK_C) {velocidade -= 10;}
	if(e.getKeyCode() == e.VK_T) {tempo += 1;}		
        if(e.getKeyCode() == e.VK_R) {tempo -= 1;}
	if(e.getKeyCode() == e.VK_RIGHT) {xBola += 10;}
        if(e.getKeyCode() == e.VK_A) {disparo();}
        if(e.getKeyCode() == e.VK_Z) {resetar();}
    }
    
    
    // Eventos do Mouse    
    public void mouseDragged(MouseEvent e1) {}
    public void mouseEntered(MouseEvent e1) {}
    public void mouseExited(MouseEvent e1) {}
    public void mousePressed(MouseEvent e1) {}
    public void mouseReleased(MouseEvent e1) {}
    public void mouseClicked(MouseEvent e1) {
        //JOptionPane.showMessageDialog(null, "Você clicou!!!!");
        disparo();
    }
    
    public void mouseMoved(MouseEvent e1) {
        xMira = e1.getX();
        yMira = e1.getY();
    }

    public void simulacao() {
        
        Graphics g = getGraphics();	
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(Color.WHITE);
        bbg.fillRect(0, 0, janelaW, janelaH);	
        
        bbg.setColor(Color.RED);
        bbg.setFont(new Font("helvica",Font.BOLD,20));
        
        //bbg.drawString("X=: "+xMira+"  Y="+yMira, 50, 100); //EXIBE UM TEXTO + O VALOR DA TECLA PRESSIONADA
	//bbg.drawImage(mira.getImage(), xMira-25, yMira-25, this);
		
	
        bbg.setColor(Color.RED);
        bbg.setFont(new Font("helvica",Font.BOLD,20));
        bbg.drawString("Você pressionou: "+teclaPressionada, 50, 100); 
        
        //bbg.drawImage(fundo.getImage(),0,0,this); // fundo (500x500)
        //bbg.drawImage(imagem.getImage(),100,100,100,100,this); // imagem em (x=200,y=200), tamanho em 40%  
        
        bbg.drawImage(imagem.getImage(),50,200,this); // imagem em (x=200,y=200), tamanho em 40%  
        bbg.fillOval(xBola, yBola, 15, 15);
        
        bbg.drawString("X=: "+xMira+"  Y="+yMira, 50, 50); //EXIBE UM TEXTO + O VALOR DA TECLA PRESSIONADA
	
        bbg.drawString("Velocidade: " + velocidade + " (m/s)", 180, 400); //EXIBE UM TEXTO + O VALOR DA TECLA PRESSIONADA
	bbg.drawString("Tempo: " + tempo + " (s)", 380, 400); //EXIBE UM TEXTO + O VALOR DA TECLA PRESSIONADA
	
        
        bbg.setColor(Color.BLACK);
        bbg.drawLine(200,300,700,300); // linha xP1=250,yP1=250),(xP2=300,yP2=300)
        
        bbg.drawLine(200,285,200,315);// traço na posição 200
	bbg.setFont(new Font("helvica",Font.BOLD,10));
        bbg.drawString("x = 0 m",190,330); 
	
        bbg.drawLine(700,285,700,315);// traço na posição 700
	bbg.setFont(new Font("helvica",Font.BOLD,10));
        bbg.drawString("x = 400 ms",690,330); 
        
        bbg.drawString("Velocidade",180,350); 
        
        if (fimCurso) {
            bbg.setColor(Color.BLACK);
            bbg.fillOval(xBola, yBola, 15, 15);
        }
        else {
            bbg.setColor(Color.BLACK);
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
	addKeyListener(this); 
        addMouseListener(this);
        addMouseMotionListener(this);
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
        EquacaoHoraria Simulacao = new EquacaoHoraria();
        Simulacao.run();
    }
}