// Exercicio: fazer as cores da Bandeira do Brasil

package Exemplos.S20_Temp;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Tela extends JFrame {

    BufferedImage backBuffer;	// buffer
    //int FPS = 30;		// taxa de atualizacao
    int janelaLargura = 500;	// largura da tela
    int janelaAltura  = 500;	// altura da tela

    
    public void atualizar() {}

    
    public void desenharGraficos1(){                 // desenhar formas geometricas        
        Graphics g1 = getGraphics();                 // g - desenhar o buffer
        g1.drawImage(backBuffer,0,0,this);           // desenhar o buffer em (0,0)
        g1.setColor(new Color(0,255,0));             // verde
        g1.fillRect( 0, 0, 300, 300);
    }
    
    public void desenharGraficos2(){                 // desenhar formas geometricas        
        Graphics g2 = getGraphics();                 // g - desenhar o buffer
        g2.drawImage(backBuffer,0,0,this);           // desenhar o buffer em (0,0)
        g2.setColor(new Color(255,255,0));           // amarelo
        g2.fillRect( 0, 0, 200, 200);
    }
    
    public void desenharGraficos3(){                 // desenhar formas geometricas        
        Graphics g3 = getGraphics();                 // g - desenhar o buffer
        g3.drawImage(backBuffer,0,0,this);           // desenhar o buffer em (0,0)
        g3.setColor(new Color(255,0,0));             // vermelho
        g3.fillRect(0,0,500,500);
    }

    public void desenharGraficos4(){                 // desenhar formas geometricas        
        Graphics g3 = getGraphics();                 // g - desenhar o buffer
        g3.drawImage(backBuffer,0,0,this);           // desenhar o buffer em (0,0)
        g3.setColor(new Color(255,255,255));             // vermelho
        g3.fillRect(0,0,500,500);
    }

    
    public void inicializar() {  // configuracoes do frame
        setTitle("Titulo da Tela!");
        setSize(janelaLargura, janelaAltura);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        backBuffer = new BufferedImage(janelaLargura, janelaAltura, BufferedImage.TYPE_INT_RGB);
    }

    public void run() {     // loop infinito        
        
        inicializar();        
        
        while (true) {            
        
            //atualizar();
            
            try { 
                Thread.sleep(3000); 
            } catch (Exception e1) { 
                System.out.println("Thread interrompida!"); 
            }
            
            desenharGraficos1();            
            
            try { 
                Thread.sleep(3000); 
            } catch (Exception e1) { 
                System.out.println("Thread interrompida!"); 
            }
            
            desenharGraficos2();            
            
            try { 
                Thread.sleep(3000); 
            } catch (Exception e2) { 
                System.out.println("Thread interrompida!"); 
            }
            
            desenharGraficos3();
            
            //System.exit(0);
        }
    }
    
    public void segurancaOn() {                 
        
        inicializar();  
        
        int cont = 0;
        
        while (cont<5) {            
            
            try {Thread.sleep(1000);
            } catch (Exception e2) {}
            
            desenharGraficos3();
            
            try {Thread.sleep(1000);
            } catch (Exception e2) {}
            
            desenharGraficos4();
            
            cont = cont + 1;
        }
        
        System.exit(0);
    }
    
    public void segurancaOff() {                 
        inicializar();        
        while (true) {            
            try {Thread.sleep(1000);} catch (Exception e2) {}
            desenharGraficos1();
            try {Thread.sleep(1000);} catch (Exception e2) {}
            desenharGraficos4();
        }
    }
    

    public static void main(String[] args) {
        Tela tela = new Tela();
        //tela.run();
        //tela.seguranca();
    }    
}