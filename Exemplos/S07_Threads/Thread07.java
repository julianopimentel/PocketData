package Exemplos.S07_Threads;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Thread07 extends JFrame {

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;
	
    ImageIcon imagem = new ImageIcon("C:/Fontes/java-linux.png");
    ImageIcon fundo1 = new ImageIcon("C:/Fontes/u2-new-years-day.gif");
    ImageIcon fundo2 = new ImageIcon("C:/Fontes/led-zeppellin-stariway-to-heaven.gif");
     
    Sequencer player; 
    String musica1 = "C:/Fontes/u2-new-years-day.mid";
    String musica2 = "C:/Fontes/led-zeppellin-stariway-to-heaven.mid";
    
    
    public void tocarMusica(String nome, int repetir){
        try {
            player = MidiSystem.getSequencer();		
            Sequence musica = MidiSystem.getSequence(new File(nome));
            player.open();	
            player.setSequence(musica);	
            player.setLoopCount(repetir); 
            player.start();	
        } catch(Exception e){
            System.out.println("Erro ao tocar: "+nome);
        }
    }
	
    public void atualizar() {}

    public void desenharGraficos() {
        Graphics g = getGraphics();	
        Graphics bbg = backBuffer.getGraphics();	
        bbg.drawImage(fundo2.getImage(),0,0,this); // fundo (500x500)
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
	tocarMusica(musica2, 999); 
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
        Thread07 tela = new Thread07();
        tela.run();
    }
}