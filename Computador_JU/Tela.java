/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador_JU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel; 

/**
 *
 * @author Juliano P
 */
public class Tela extends JFrame {
    
     JLabel area;    
  
    // ----- Quadrado - Painel-------------------------------------- //   
    public void geoPainel(){                   
       
        // Painel ---------------------------------------------------------- 
        getContentPane().setLayout(null); // Padrao de tela
        setTitle("Computador 1.0"); // areaDesenho
        setBounds(50,50,700,500); // Localizacao e Tamanho
        setVisible(false); // Visibilidade
        setResizable(false); // Ajuste
        getContentPane().setBackground(new Color(255,255,255)); // Cor
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Botao X, fecha o sistema
       
        // Container para adicionar
        Container ctn = getContentPane();
        ctn.setLayout(new BorderLayout());

        // Cria um JLabel
        area = new JLabel();      
        ctn.add(area, BorderLayout.CENTER);

        // Cria um botao
        JButton btn = new JButton("Desenhar Computador");
   
        // Adiciona um evento ao botao
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
              
                    try {
                        Thread.sleep(2000);
                        computador();
                    } catch (InterruptedException ie1) {}
                
                   
                } // ActionEvent
            } // ActionListener
        ); // btn.add

        // Adiciona o botao na janela
        ctn.add(btn, BorderLayout.SOUTH);
    }     
    // ----- FIM do Painel ------------------------------------------ //
   
    // ----- Computador ------------------------------------------------------ //   
    public void computador(){ // Grafico que desenha quadrado no geoPainel              
   
        // Define a aea do Grafico e o desenha (x0, y0, largura, altura)
        Graphics g1 = area.getGraphics();
       
        g1.setColor(new Color(255,255,255));
        g1.fillRect(3,3,685,435);
       
      
        //Desenhar Tela
        g1.setColor(Color.black);
g1.drawRect(100,50,220,180);
        g1.drawRect(110,60,200,160);
       
        //Suporte Tela
        g1.setColor(Color.black);
        g1.drawOval(150, 232, 120, 30);
       
        //Teclado
        g1.setColor(Color.black);
        g1.drawRect(100, 300, 250, 80);
        //Vertical
        g1.drawLine(100, 310, 350, 310);
        g1.drawLine(100, 320, 350, 320);
        g1.drawLine(100, 330, 350, 330);
        g1.drawLine(100, 340, 350, 340);
        g1.drawLine(100, 350, 350, 350);
        g1.drawLine(100, 360, 350, 360);
        g1.drawLine(100, 370, 350, 370);
        g1.drawLine(100, 380, 350, 380);
        //Horizontal
        g1.drawLine(110, 380, 110, 300);
        g1.drawLine(120, 380, 120, 300);
        g1.drawLine(130, 380, 130, 300);
        g1.drawLine(140, 380, 140, 300);
        g1.drawLine(150, 380, 150, 300);
        g1.drawLine(160, 380, 160, 300);
        g1.drawLine(170, 380, 170, 300);
        g1.drawLine(180, 380, 180, 300);
        g1.drawLine(190, 380, 190, 300);
        g1.drawLine(200, 380, 200, 300);
        g1.drawLine(210, 380, 210, 300);
        g1.drawLine(220, 380, 220, 300);
        g1.drawLine(230, 380, 230, 300);
        g1.drawLine(240, 380, 240, 300);
        g1.drawLine(250, 380, 250, 300);
        g1.drawLine(260, 380, 260, 300);
        g1.drawLine(270, 380, 270, 300);
        g1.drawLine(280, 380, 280, 300);
        g1.drawLine(290, 380, 290, 300);
        g1.drawLine(300, 380, 300, 300);
        g1.drawLine(310, 380, 310, 300);
        g1.drawLine(320, 380, 320, 300);
        g1.drawLine(330, 380, 330, 300);
        g1.drawLine(340, 380, 340, 300);
        g1.drawLine(350, 380, 350, 300);
       
        //Mouse
        g1.setColor(Color.black);
        g1.drawOval(460, 322, 80, 30);
       
        //Cabo do mouse
        g1.setColor(Color.black);
        g1.drawArc(345, 340, 200, 80, 80, 80);
       
        //Texto Alunos
        g1.drawString("Alunos:", 380, 100);
        g1.drawString("Juliano Pimentel", 430, 100);
        g1.drawString("Anderson do Nascimento", 430, 120);
       
    }  
   
    // ----- FIM de Computador ----------------------------------------------- //   

//Inicia
     public static void main(String[] args) {
        // TODO code application logic here
        Tela computador = new Tela();
        computador.geoPainel();
        computador.setVisible(true);
    } 
}
//Fim
