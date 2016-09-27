/*
 * Dicas (Medidas do Painel)
   (x0, y0, Largura, Altura) -> (200,50,800,600) 
   setBounds(200,50,800,600);  // Localização e Tamanho
   setLocation(200,50); // Localização
   setSize(800,600); // Tamanho
 * 
 */

package Exemplos.S03_Geometria;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Geometria extends JFrame {	
    
    JLabel area;     
    
    
    // ----- Quadrado - Painel Básico -------------------------------------- //    
    public void geoPainel(){                    
        
        // Painel ----------------------------------------------------------  
        getContentPane().setLayout(null); // Padrao de tela
        setTitle("Sistema 3"); // areaDesenho
        setBounds(50,50,700,500); // Localizacao e Tamanho
        setVisible(false); // Visibilidade
        setResizable(false); // Ajuste
        getContentPane().setBackground(new Color(255,245,180)); // Cor
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Botão X, fecha o sistema
        
        // Container para adicionar os gráficos 
        Container ctn = getContentPane();
        ctn.setLayout(new BorderLayout());

        // Cria um JLabel 
        area = new JLabel();       
        ctn.add(area, BorderLayout.CENTER);

        // Cria um botão 
        JButton btn = new JButton("Desenhar Gráfico");
	    
        // Adiciona um evento ao botão 
        btn.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    try {
                        Thread.sleep(1000);
                        geoReta();
                    } catch (InterruptedException ie1) {} 
                    
                    try { 
                        Thread.sleep(1000);
                        geoQuadrado();
                    } catch (InterruptedException ie2) {} 
                    
                    try { 
                        Thread.sleep(1000);
                        geoTriangulo();
                    } catch (InterruptedException ie3) {} 
                                        
                    try { 
                        Thread.sleep(1000);
                        geoCirculo();
                    } catch (InterruptedException ie4) {} 
                    
                    try { 
                        Thread.sleep(1000);
                        geoArco();
                    } catch (InterruptedException ie5) {} 
                    
                    try { 
                        Thread.sleep(1000);
                        geoPoligono();
                    } catch (InterruptedException ie6) {} 
                    
                    //geoCartesiano();
                    
                    //geoSisSolar();
                    
                    //geoBandeira();
                    
                } // ActionEvent
            } // ActionListener
        ); // btn.add
	
        // Adiciona o botão na janela 
        ctn.add(btn, BorderLayout.SOUTH);
    }      
    // ----- FIM do Painel Básico ------------------------------------------ //
        
    
    
    // ----- Reta ---------------------------------------------------------- //   
    public void geoReta(){ // Gráfico que desenha retas no geoPainel    
            
        Graphics g1 = area.getGraphics();
    				
        // Define a área do Gráfico e o desenha (x0, y0, largura, altura
        g1.setColor(new Color(255,255,255));
        g1.fillRect(10,10,675,425);
	          
        // Desenha linha preta no JLabel
        g1.setColor(Color.black);
        g1.drawLine(10, 40, 100, 200);
        
        // Desenha linha azul no JLabel
        g1.setColor(Color.blue);
        g1.drawLine(20, 30, 80, 150);
        
        // Desenha linha vernha no JLabel
        g1.setColor(Color.red);
        g1.drawLine(50, 50, 120, 30);        
    }    
    // ----- FIM de Reta --------------------------------------------------- //
    
    
    
    // ----- Quadrado ------------------------------------------------------ //    
    public void geoQuadrado(){ // Gráfico que desenha quadrado no geoPainel               
    
        Graphics g2 = area.getGraphics();
        
        g2.setColor(new Color(255,255,255));
        g2.fillRect(10,10,675,425);
        
        g2.setColor(Color.green);
	g2.drawRect(150,20,200,200);    
    }   
    // ----- FIM de Quadrado ----------------------------------------------- //    
    
    
    
    // ----- Triangulo ----------------------------------------------------- //    
    public void geoTriangulo(){ // Gráfico que desenha triangulo no geoPainel               

        // Configuração do Triângulo
        int x [] = {100,430,265};
	int y [] = {300,300,70};
	
        // Desenha o Triângulo
        Graphics g3 = area.getGraphics();
        
        g3.setColor(new Color(255,255,255));
        g3.fillRect(10,10,675,425);
        
        g3.fillRect(10,10,675,425);
        g3.setColor(Color.blue);
	g3.fillPolygon(x,y,3);    
    }        
    // ----- FIM de Triangulo ---------------------------------------------- //
    
    
    
    // ----- Circulo ------------------------------------------------------- //    
    public void geoCirculo(){ // Gráfico que desenha circulo no geoPainel               
    
        Graphics g4 = area.getGraphics();
        
        g4.setColor(new Color(255,255,255));
        g4.fillRect(10,10,675,425);
        
        g4.setColor(Color.red);
        g4.fillOval(200,50,200,300);
        g4.drawOval(450,200,200,200); // desenha um circulo de raio = 200    
    }    
    // ----- FIM de Circulo ------------------------------------------------ //
    
    
    
    // ----- Arco ---------------------------------------------------------- //    
    public void geoArco(){ // Gráfico que desenha arco no geoPainel               
    
        Graphics g5 = area.getGraphics();
        
        g5.setColor(new Color(255,255,255));
        g5.fillRect(10,10,675,425);
        
        g5.setColor(new Color(0,0,0));
        g5.drawArc(50,100,300,300,0,220);
        g5.fillArc(250,100,300,300,0,30);    
    }    
    // ----- FIM de Arco --------------------------------------------------- //
    
    
    
    // ----- Pòligono ------------------------------------------------------ //    
    public void geoPoligono(){ // Gráfico que desenha poligono no geoPainel               
    
        Graphics g5 = area.getGraphics();

        int x1[] = {80, 140, 280, 330, 430, 480, 430, 300, 280, 150};
        int y1[] = {50, 270, 220, 180, 350, 160, 140, 110, 120, 60};
	
        g5.setColor(new Color(255,255,255));
        g5.fillRect(10,10,675,425);
        
        g5.setColor(Color.orange);
        g5.drawPolygon(x1,y1,10);
        g5.fillPolygon(x1,y1,7);
    }
    // ----- FIM de Pòligono ----------------------------------------------- //
    
    
    
    // ----- Sistema Cartesiano--------------------------------------------- //
    // ----- FIM de Sistema Cartesiano ------------------------------------- //



    // ----- Sistema Solar ------------------------------------------------- //
    // ----- FIM de Sistema Solar ------------------------------------------ //
    
    
    
    // ----- Sistema Bandeira ---------------------------------------------- //
    // ----- FIM de Bandeiroa ---------------------------------------------- //    
}

	