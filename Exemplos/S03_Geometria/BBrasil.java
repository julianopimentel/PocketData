package Exemplos.S03_Geometria;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class BBrasil extends JFrame implements ActionListener {
	
    public static JLabel L1, L2, LGrafico;  
    public static Font F1, F2;
    public static JButton btnDesenhar;
	
    public BBrasil() {
        Tela();
        Etiquetas();
        Botoes();
    }
	
    public void Tela() {
        getContentPane().setLayout(null);	
        setTitle("Graphics");	
        setLocation(300,100);	
        setSize(425,535);	
        setVisible(true);	
        setResizable(false);	
        getContentPane().setBackground(Color.lightGray); 
    }
	
    public void Etiquetas() {	
		
        //Font F1 = new Font("Sans Serif",Font.ITALIC,18);
        //Font F2 = new Font("Sans Serif",Font.BOLD,14);
		
        JLabel L1 = new JLabel();
        L1.setLocation(140,10);	
        L1.setSize(500,30);
        //L1.setFont(F1);
        L1.setText("GRAPHICS JAVA");	
        L1.setForeground(Color.blue);	
        this.L1 = L1 ;	
        getContentPane().add(L1);
		
        JLabel L2 = new JLabel();
        L2.setLocation(10,60);	
        L2.setSize(400,15);
        //L2.setFont(F2);
        L2.setText("Grafico da Bandeira do Brasil");
        L2.setForeground(Color.black);
        L2.setToolTipText(null);
        this.L2 = L2;
        getContentPane().add(L2);
        
        LGrafico = new JLabel();
        LGrafico.setLocation(10,100);	
        LGrafico.setSize(400,400);
        this.LGrafico = LGrafico;
        getContentPane().add(LGrafico);
        LGrafico.setVisible(true);
    }
			
    public void Botoes(){	
        btnDesenhar = new JButton("Gerar Grafico");
        btnDesenhar.setLocation(230,60);	
        btnDesenhar.setSize(125,25);
        btnDesenhar.addActionListener(this);
        this.btnDesenhar = btnDesenhar;
        getContentPane().add(btnDesenhar); 		
    }
	
    public void GBandeira(){
	
        Graphics g = LGrafico.getGraphics();
        g.setColor(new Color(255,245,180));
        g.fillRect(0,0,400,400);

        // Desenha o eixo X
        g.setColor(Color.black);
        g.drawLine(200,0,200,400);
	
        // Desenha o eixo Y
        g.setColor(Color.black);
        g.drawLine(0,200,400,200);
	
        // Paramentros do Retangulo
        // Borda
        g.setColor(Color.black);
        g.drawRect(49,99,301,201);
	
        // Preechimento
        g.setColor(new Color(29,126,29));
        g.fillRect(50,100,300,200);
	
        // Paramentros do Losango
        // Borda
        int x1[] = {200, 73,200,326};
        int y1[] = {124,200,276,200};
	
        g.setColor(Color.black);
        g.drawPolygon(x1,y1,4);
	
        // Preenchimento
        int x2[] = {200, 75,200,325};
        int y2[] = {125,200,275,200};
	
        g.setColor(Color.yellow);
        g.fillPolygon(x2,y2,4);
	
        // Paramentros do Circulo
        // Borda
        g.setColor(Color.black);
        g.drawOval(149,149,102,102);

        // Preenchimento
        g.setColor(Color.white);
        g.fillOval(150,150,100,100);
    }
	
    public void actionPerformed(ActionEvent e) {	
        if (e.getSource() == btnDesenhar) { 
            GBandeira(); 
        }
    }
		
    public static void main (String[] args) {
        BBrasil aplicacao = new BBrasil();
    }
}

