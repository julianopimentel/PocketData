package Sistema_Solar;

/*
Principal_Solar.java
Projeto Base para Simulação de Sistema Solar
Autor: Guilherme Bezerra Fernandes
Data: 11/09/2012
Link: https://aulasguilherme.wordpress.com/2014/10/07/projeto-09-base-simulacao-do-sistema-solar-em-java/
 */

import static Sistema_Solar.Controle.login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.DISPOSE_ON_CLOSE;

public class Principal_Solar extends JFrame{
    
    public static JButton btnEntrar;
        
    SistemaSolar sl;
    
    public Principal_Solar() {
        setLayout(new BorderLayout());
        setSize(1200,700);
        sl = new SistemaSolar();
        getContentPane().setBackground(Color.black);
        add(BorderLayout.CENTER, sl);
        
		

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(50,70);
        setTitle("Base-Simula Sistema Solar");   
        setVisible(true);
              
    }   
}

