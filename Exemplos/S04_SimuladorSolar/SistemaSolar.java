package S04_SimuladorSolar;

/*
SistemaSolar.java
Projeto Base para Simulação de Sistema Solar
Autor: Guilherme Bezerra Fernandes
Data: 11/09/2012
Link: https://aulasguilherme.wordpress.com/2014/10/07/projeto-09-base-simulacao-do-sistema-solar-em-java/
 */

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class SistemaSolar extends JPanel {
    
    private Image fundo; //estrelas
    private Image sol;    //sol
    private Image mercurio; //mercúrio
    
    //variáveis de mercúrio
    int x_merc,y_merc,dx_merc,dy_merc;
    int tam_merc; //tamanho da trajetória de mercúrio
    int i = 0;
    
    Timer tempo = new Timer();
    
    public SistemaSolar() {
        
        tam_merc = 100; //tamanho do raio da trajetória de mercúrio
        dx_merc = 500; //posição x inicial do circulo de mercurio
        dy_merc = 300; //posição y inicial do circulo de mercurio
        x_merc = 0; y_merc = 0;
        
        mercurio = Toolkit.getDefaultToolkit().getImage("C:/Desenvolvimento/Java/imagens/mercurio.jpg");
        sol = Toolkit.getDefaultToolkit().getImage("C:/Desenvolvimento/Java/imagens/sol.jpg");
        fundo = Toolkit.getDefaultToolkit().getImage("C:/Desenvolvimento/Java/imagens/estrelas.jpg");
        
        //ajusta a velocidade do movimento
        tempo.schedule(new temp(),0,20);
    }

    public void paintComponent(Graphics g) {
        
        //Desenha o Fundo com estrelas
        g.drawImage(fundo,0,0,800,600,this);//Carrega a imagem das estrelas 800x600
        
        //Desenha o Sol
        g.drawImage(sol,485,245,130,130,this);//Carrega a imagem do sol130x130
        
        //Planeta Mercúrio...
        //Cor do nome do planeta vermelha
        g.setColor(Color.red);
        
        //Imagem do planeta mercurio
        g.drawImage(mercurio,x_merc + dx_merc, y_merc + dy_merc,10,10,this);
        
        //Texto com o nome do planeta
        g.drawString("Mercúrio", x_merc + dx_merc, y_merc + dy_merc);
        //        -------
    }




    private class temp extends TimerTask { public void run() {
            
            y_merc = (int)(Math.sin((3.14 * (i+10))/180 )* tam_merc );
            x_merc = (int)(Math.cos((3.14 * (i+10))/180 )* tam_merc * 1.5);
            i++;
            repaint();
            
        }
    }
}
