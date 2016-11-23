package Sistema_Solar;

/*
SistemaSolar.java
Projeto Base para Simulação de Sistema Solar
Autor: Guilherme Bezerra Fernandes
Data: 11/09/2012
Link: https://aulasguilherme.wordpress.com/2014/10/07/projeto-09-base-simulacao-do-sistema-solar-em-java/
 */

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SistemaSolar extends JPanel{
    
private Controle controle;
private Image fundo; //estrelas
private Image sol;    //sol
private Image mercurio; //mercúrio
private Image plutao; //plutao
private Image venus; //Venus
private Image terra;// Terra
private Image marte;//Marte
private Image jupiter; //Jupiter
private Image saturno;// Saturno
private Image urano;//Urano
private Image netuno; //Netuno
private Image lua;//Lua
            int i = 0;
            Timer tempo = new Timer();
//variáveis de mercúrio
            int x_merc,y_merc,dx_merc,dy_merc;
            int tam_merc; //tamanho da trajetória de Mercúrio            
//Variaveis de Plutao
            int x_plut,y_plut,dx_plut,dy_plut;
            int tam_plut; //tamanho da trajetória de Plutao
//Variaveis de Venus
            int x_ven,y_ven,dx_ven,dy_ven;
            int tam_ven; //tamanho da trajetoria de Venus
//Variaveis da Terra
            int x_ter,y_ter,dx_ter,dy_ter;
            int tam_ter;// tamaho da trajetoria da terra      
//Variaveis de Marte
            int x_mar,y_mar,dx_mar,dy_mar;
            int tam_mar;// tamanho da trajetoria de marte
//Variaveis de Jupiter
            int x_jup,y_jup,dx_jup,dy_jup;
            int tam_jup;
//Variaveis da Saturno
            int x_sat,y_sat,dx_sat,dy_sat;
            int tam_sat;// tamaho da trajetoria do Saturno      
//Variaveis de Urano
            int x_ura,y_ura,dx_ura,dy_ura;
            int tam_ura;// tamanho da trajetoria de Urano
//Variaveis de Netuno
            int x_net,y_net,dx_net,dy_net;
            int tam_net;
//Variaveis Lua
            int x_lua,y_lua,dx_lua,dy_lua;
            int tam_lua;
public SistemaSolar()
{
                //Imagens Interface Layout    
            sol = Toolkit.getDefaultToolkit().getImage("src/Fontes/sol.jpg");
            fundo = Toolkit.getDefaultToolkit().getImage("src/Fontes/estrelas.jpg");
/////////////////////
///////////////////// Mercurio
/////////////////////
    
        tam_merc = 60; //tamanho do raio da trajetória de mercúrio
        dx_merc = 565; //posição x inicial do circulo de mercurio
        dy_merc = 330; //posição y inicial do circulo de mercurio
        x_merc = 0; y_merc = 0;
        mercurio = Toolkit.getDefaultToolkit().getImage("src/Fontes/mercurio.jpg");
            //ajusta a velocidade do movimento mercurio
            tempo.schedule(new temp(),100,300);        
/////////////////////
///////////////////// Venus
/////////////////////
        tam_ven = 90; // tamanho do raio da trajetoria de Venus
        dx_ven = 565;  //Posicao x inicial do circulo de Venus
        dy_ven = 330;  //Posicao y inicial do circulo de Venus
        x_ven = 0; y_ven = 0;
        venus = Toolkit.getDefaultToolkit().getImage("src/Fontes/venus.jpg");
/////////////////////
///////////////////// Terra
/////////////////////
        tam_ter = 130; // tamanho do raio da trajetoria de Terra
        dx_ter = 565; // Posicao x inicial do circulo de Terra
        dy_ter = 330; // Posicao y inicial do circulo de Terra
        x_ter = 0; y_ter = 0;
        terra = Toolkit.getDefaultToolkit().getImage("src/Fontes/2.gif");
        
        /////////////////Lua
        tam_lua = 25; //tamanho do raio da trajetória de Plutao
        dx_lua = 760; //posição x inicial do circulo de Plutao
        dy_lua = 310; //posição y inicial do circulo de Plutao
        x_lua = 0; y_lua = 0;
        lua = Toolkit.getDefaultToolkit().getImage("src/Fontes/lua.jpg");
        
        
///////////////////
/////////////////// Marte
//////////////////
        tam_mar = 170; //tamanho do raio da trajetoria de Marte
        dx_mar = 565; //Posicao x inicial do circulo de Marte
        dy_mar = 330; //Posicao y inicial do Circulo de marte
        x_mar = 0;y_mar = 0;
        marte = Toolkit.getDefaultToolkit().getImage("src/Fontes/marte.jpg");
        
///////////////////
/////////////////// Jupiter
//////////////////
        tam_jup = 200; //tamanho do raio da trajetoria de jupiter
        dx_jup = 565; //Posicao x inicial do circulo de jupiter
        dy_jup = 330; //Posicao y inicial do Circulo de jupiter
        x_jup = 0;y_mar = 0;
        jupiter = Toolkit.getDefaultToolkit().getImage("src/Fontes/jupiter.jpg");
/////////////////////
///////////////////// Saturno
/////////////////////
        tam_sat = 245; // tamanho do raio da trajetoria de saturno
        dx_sat = 565; // Posicao x inicial do circulo de saturno
        dy_sat = 330; // Posicao y inicial do circulo de saturno
        x_sat = 0; y_sat = 0;
        saturno = Toolkit.getDefaultToolkit().getImage("src/Fontes/saturno.jpg");
        
///////////////////
/////////////////// Urano
//////////////////
        tam_ura = 280; ////tamanho do raio da trajetoria de urano
        dx_ura = 565; //Posicao x inicial do circulo de urano
        dy_ura = 330; //Posicao y inicial do Circulo de urano
        x_ura = 0;y_mar = 0;
        urano = Toolkit.getDefaultToolkit().getImage("src/Fontes/urano.jpg");
        
///////////////////
////////////////// Netuno
//////////////////
        tam_net = 360; //tamanho do raio da trajetoria de netuno
        dx_net = 565; //Posicao x inicial do circulo de netuno
        dy_net = 330; //Posicao y inicial do Circulo de netuno
        x_net = 0;y_net = 0;
        netuno = Toolkit.getDefaultToolkit().getImage("src/Fontes/netuno.jpg");
                                
/////////////////////
///////////////////// Plutao
/////////////////////

        tam_plut = 320; //tamanho do raio da trajetória de Plutao
        dx_plut = 565; //posição x inicial do circulo de Plutao
        dy_plut = 330; //posição y inicial do circulo de Plutao
        x_plut = 0; y_plut = 0;
        plutao = Toolkit.getDefaultToolkit().getImage("src/Fontes/plutao.jpg");                
        
        
}

    private class Painel extends JPanel{

        private Painel() {
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    System.out.println(e.getKeyCode());
                }
            });
        }
    }



public void paintComponent(Graphics g)
{
//Desenha o Fundo com estrelas
g.drawImage(fundo,0,0,1200,720,this);//Carrega a imagem das estrelas 1200x720
//Desenha o Sol
g.drawImage(sol,535,295,100,100,this);//Carrega a imagem do sol 130x130

Controle r = new Controle();
g.setColor(Color.white);
g.setFont(new Font("helvica",Font.BOLD,20));
g.drawString("Nome: " + r.getNomeJogador(), 20, 25);

g.setFont(new Font("helvica",Font.BOLD,9));
            
//Planeta Mercúrio...
            
            //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta mercurio
            g.drawImage(mercurio,x_merc + dx_merc, y_merc + dy_merc,6,5,this);
            //Texto com o nome do planeta
            g.drawString("Mercúrio", x_merc + dx_merc, y_merc + dy_merc);
            
//Planeta Venus 
            // Cor do nome do Planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Venus
            g.drawImage(venus, x_ven + dx_ven,y_ven + dy_ven,7,5,this);
            //Texto com o nome do planeta
            g.drawString("Venus",x_ven + dx_ven, y_ven + dy_ven);
//Planeta Terra
            //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Terra
            g.drawImage(terra, x_ter + dx_ter,y_ter + dy_ter,23,19, this);
            g.drawString("Terra", x_ter + dx_ter, y_ter + dy_ter);
//Planeta Marte
             //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Terra
            g.drawImage(marte, x_mar + dx_mar,y_mar + dy_mar,10,7, this);
            g.drawString("Marte", x_mar + dx_mar, y_mar + dy_mar);
//Planeta Jupiter
             //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Terra
            g.drawImage(jupiter, x_jup + dx_jup,y_jup + dy_jup,43,39, this);
            g.drawString("Jupiter", x_jup + dx_jup, y_jup + dy_jup);
//Planeta Saturno
            //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Saturno
            g.drawImage(saturno, x_sat + dx_sat,y_sat + dy_sat,23,19, this);
            g.drawString("Saturno", x_sat + dx_sat, y_sat + dy_sat);
//Planeta Urano
             //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Urano
            g.drawImage(urano, x_ura + dx_ura,y_ura + dy_ura,43,39, this);
            g.drawString("Urano", x_ura + dx_ura, y_ura + dy_ura);
//Planeta Netuno
             //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta Netuno
            g.drawImage(netuno, x_net + dx_net,y_net + dy_net,23,25, this);
            g.drawString("Netuno", x_net + dx_net, y_net + dy_net);
//Planeta plutao...
            //Cor do nome do planeta (Branco)
            g.setColor(Color.white);
            //Imagem do planeta plutao
            g.drawImage(plutao,x_plut + dx_plut, y_plut + dy_plut,10,10,this);
            //Texto com o nome do planeta
            g.drawString("Plutao", x_plut + dx_plut, y_plut + dy_plut);            

}
private class temp extends TimerTask{
public void run()
{
//Rotacao Mercurio    
            y_merc = (int)(Math.sin((-3.14 * (i+10))/160 )* tam_merc );
            x_merc = (int)(Math.cos((-3.14 * (i+10))/160 )* tam_merc * 1.5);
            i++;
            repaint();
//////////Rotaçao Venus
            y_ven = (int)(Math.sin((-3.14 * (i+10))/200 )* tam_ven );
            x_ven = (int)(Math.cos((-3.14 * (i+10))/200 )* tam_ven * 1.5);
            i++;
///////Rotacao Terra
            y_ter = (int)(Math.sin((-3.14 * (i+10))/240)* tam_ter);
            x_ter = (int)(Math.cos((-3.14 * (i+10))/240 )* tam_ter * 1.5);
            i++;
///////Rotacao Marte
            y_mar = (int)(Math.sin((-3.14 * (i+10))/280)* tam_mar);
            x_mar = (int)(Math.cos((-3.14 * (i+10))/280 )* tam_mar * 1.5);
            i++;
///////Rotacao Jupiter
            y_jup = (int)(Math.sin((-3.14 * (i+10))/1080)* tam_jup);
            x_jup = (int)(Math.cos((-3.14 * (i+10))/1080)* tam_jup * 1.5);
            i++;
///////Rotacao Saturno
            y_sat = (int)(Math.sin((-3.14 * (i+10))/2880)* tam_sat);
            x_sat = (int)(Math.cos((-3.14 * (i+10))/2880)* tam_sat * 1.5);
            i++;
///////Rotacao Urano
            y_ura = (int)(Math.sin((-3.14 * (i+10))/8280)* tam_ura);
            x_ura = (int)(Math.cos((-3.14 * (i+10))/8280)* tam_ura * 1.5);
            i++;
///////Rotacao Netuno
            y_net = (int)(Math.sin((-3.14 * (i+10))/16280)* tam_net);
            x_net = (int)(Math.cos((-3.14 * (i+10))/16280)* tam_net * 1.5);
            i++;
///////Rotaçao Plutao
            y_plut = (int)(Math.sin((-3.14 * (i+10))/24280 )* tam_plut );
            x_plut = (int)(Math.cos((-3.14 * (i+10))/24280)* tam_plut * 1.5);
            i++;
}
}

}