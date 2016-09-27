package GraficoBandeira;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

public class Controle extends JFrame {
    
    public static JLabel L1, L2;
    public static Font F1, F2;
    public static Canvas canvasTela;
    public static JButton btnDesenhar, btnApagar;
    public static JComboBox cmbBandeiras;
    public static MouseListener canvasClick; 
    public static ArrayList<Point> listaPontos;
    
    public Controle() {
        gerarInterface();
    }
     
    
    public void gerarInterface() {
        
        //JFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        getContentPane().setLayout(null);
        setTitle("Bandeiras");
        setLocation(300, 100);
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        // Tela(Canvas)        
        
        canvasTela  = new Canvas();        
        canvasTela .setLocation(18, 95);
        canvasTela .setSize(760, 460);
        canvasTela .setVisible(true);         
        canvasTela.addMouseListener(new MouseListener() {             
            public void mouseDragged(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {                                
                System.out.println(e.getX() + "," + e.getY());
            }            
        });        
        this.canvasTela  = canvasTela ;
        getContentPane().add(canvasTela );
                
        // Labels        
        L1 = new JLabel();
        L1.setLocation(345,20);	
        L1.setSize(500,30);
        //L1.setFont(F1);
        L1.setText("BANDEIRAS");	
        L1.setForeground(Color.blue);	
        this.L1 = L1 ;	
        getContentPane().add(L1);

        /*
        L2 = new JLabel();
        L2.setLocation(210,65);	
        L2.setSize(400,15);
        //L2.setFont(F2);
        L2.setText("Desenhar Controle");
        L2.setForeground(Color.black);
        L2.setToolTipText(null);
        this.L2 = L2;
        getContentPane().add(L2);               
        */
        
        // Botoes(JButtons)
        btnDesenhar = new JButton("Desenhar");
        btnDesenhar.setLocation(330, 60);
        btnDesenhar.setSize(125, 25);
        btnDesenhar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerarGrafico(cmbBandeiras.getSelectedItem().toString());
            }
        });
        this.btnDesenhar = btnDesenhar;
        getContentPane().add(btnDesenhar);
        
        btnApagar = new JButton("Apagar");
        btnApagar.setLocation(150, 60);
        btnApagar.setSize(125, 25);
        btnApagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                apagarGrafico();
            }
        });
        this.btnApagar = btnApagar;
        getContentPane().add(btnApagar);     

        // JComboBox                  
        cmbBandeiras = new JComboBox<>();
        cmbBandeiras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Brasil", "Amazonas", "Sergipe", "Acre"}));
        cmbBandeiras.setSize(125, 25);  
        cmbBandeiras.setLocation(500, 60);    
        cmbBandeiras.setSelectedIndex(0);        
        cmbBandeiras.setEditable(false);
        cmbBandeiras.setLightWeightPopupEnabled(false);                    
        cmbBandeiras.setVisible(true);
        this.cmbBandeiras = cmbBandeiras;        
        getContentPane().add(cmbBandeiras);
    }
 
    public void gerarGrafico(String nomeBandeira) {
        Graphics g = canvasTela .getGraphics();
        
        switch(nomeBandeira)
        {
            case "Brasil":
                                
                //Retângulo
                g.setColor(new Color(29, 126, 29));
                g.fillRect(0, 0, 760, 460);
                
                //Losango
                g.setColor(Color.YELLOW);
                g.fillPolygon(new int[] {30, 380, 730, 380}, new int[] {230, 30, 230, 430}, 4);
                
                //Circulo
                g.setColor(Color.BLUE);
                g.fillOval(235, 85, 290, 290);
                
                //Arco
                g.setColor(Color.WHITE);
                g.fillPolygon(new int[] {244, 260, 275, 293, 314,
                                         341, 367, 401, 431, 459,
                                         484, 505, 522, 524, 525,
                                         519, 508, 481, 435, 380,
                                         341, 289, 265, 241, 236,
                                         236, 239, 243},
                        
                              new int[] {178, 176, 173, 171, 169,
                                         169, 169, 173, 178, 183,
                                         190, 195, 201, 219, 244,
                                         267, 259, 250, 239, 230,
                                         229, 228, 231, 232, 234,
                                         213, 197, 182},
                              28);
                
                g.setColor(Color.BLACK);
                g.setFont(new Font("Tahoma", Font.BOLD, 25));
                g.drawString("Ordem e Progresso", 260, 220);
                
                
                g.drawLine(380, 0, 380, 460);
                g.drawLine(0, 230, 760, 230);
                
                //g.fillPolygon(xLosangoBR, yLosangoBR, 4);
                
                //g.setColor(new Color(0, 120, 0));
                //g.fillRect(10, 10, 760, 460);
                break;
            case "Amazonas":
                g.setColor(Color.WHITE);
                g.fillRect(0,0, 760, 460);
                
                g.setColor(Color.RED);
                g.fillRect(0,153, 760,153);
                
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 300, 153);
                
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma", Font.BOLD, 25));
                g.drawString("*   *   *   *   *   *   *   *", 13, 35);                
                g.drawString("*   *   *   *   *   *   *   *", 13, 75);
                g.drawString("*   *   *   *   *   *   *   *", 13, 115);
                g.drawString("*   *   *   *   *   *   *   *", 13, 150);
                
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 35, 80);
                g.fillRect(110, 50, 80, 80);
                g.fillRect(220, 50, 35, 80);
                
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma", Font.BOLD, 80));
                g.drawString("*", 125, 125);
                
                break;
            case "Sergipe":
                
                g.setColor(Color.GREEN);
                g.fillRect(0, 0, 760, 460);
                                
                g.setColor(Color.YELLOW);
                g.fillRect(0, 115, 760, 115);
                
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 300, 230);
                
                g.setColor(Color.YELLOW);
                g.fillRect(0, 345, 760, 345);
                
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma", Font.BOLD, 250));
                g.drawString("*", 75, 240);
                
                g.setFont(new Font("Tahoma", Font.BOLD, 100));
                g.drawString("*      *", 0, 85);
                g.drawString("*      *", 0, 250);
                
                
                break;
                case "Acre":
                    
                g.setColor(Color.green.brighter());
    		g.fillRect(20, 20, 760, 460);   
					
	        g.setColor(Color.yellow);
                int x[] = {20,20,760};
		int y[] = {20,460,20};   
    		
		g.fillPolygon(x,y,3) ;
					
	    	g.setColor(Color.red);   
                int w[] = {75,100,75,50};    //Largura   
		int z[] = {83,90,50,90};  //Altura
                
                g.fillPolygon(w,z,4) ;
                g.setColor(Color.red);   
                int j[] = {100,75,50};    //Largura   
		int k[] = {60,82,60};  //Altura
                g.fillPolygon(j,k,3) ;
                    break;
        }                
        //g.drawLine(200, 0, 200, 400);
        //g.fillRect(10, 10, 760, 460);
    }
       
    public void apagarGrafico() {
        Graphics g = canvasTela .getGraphics();
        g.clearRect(0, 0, 760, 460);        
    }
           
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }            
        });
    }
}
