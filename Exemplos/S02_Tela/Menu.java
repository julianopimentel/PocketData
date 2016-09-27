package Exemplos.S02_Tela;

// Importa a classe Frame
import java.awt.*;

// Importa a classe JFrame
import javax.swing.*; 

public class Menu extends Frame {
    
    public Menu() {
        setTitle("Sistemas Desktop");
        setResizable(false);
        setSize(400,300);
        setLocation(100,100);
        setBackground(Color.red);
    }
    
    public void montaTela1(){
        setTitle("Sistemas Academico");
        setResizable(false);
        setSize(400,300);
        setLocation(100,100);
        setBackground(Color.green);
        setVisible(true);
    }
    
    public void montaTela2(){
        setTitle("Sistemas Biblioteca");
        setResizable(false);
        setSize(400,300);
        setLocation(200,200);
        setBackground(Color.yellow);
        setVisible(true);
    }
    
    public void montaTela3(){
        setTitle("Sistemas Secretaria");
        setResizable(false);
        setSize(400,300);
        setLocation(300,300);
        setBackground(Color.blue);
        setVisible(true);
    }
    
    public void montaTela4(){
        setTitle("Sistemas Seguranca");
        setResizable(false);
        setSize(400,300);
        setLocation(400,400);
        setBackground(Color.white);
        setVisible(true);
    }

    public static void main ( String arg[]) {
        new Menu().setVisible(true);
    } 
}