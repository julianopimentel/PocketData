package Exemplos.S04_SimuladorSolar;

/*
Principal_Solar.java
Projeto Base para Simulação de Sistema Solar
Autor: Guilherme Bezerra Fernandes
Data: 11/09/2012
Link: https://aulasguilherme.wordpress.com/2014/10/07/projeto-09-base-simulacao-do-sistema-solar-em-java/
 */

import S04_SimuladorSolar.SistemaSolar;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Principal_Solar extends JFrame {
    
    SistemaSolar sl;
    
    public Principal_Solar() {
        setLayout(new BorderLayout());
        setSize(800,600);
        sl = new SistemaSolar();
        getContentPane().setBackground(Color.black);
        add(BorderLayout.CENTER, sl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(140,70);
        setTitle("Base-Simula Sistema Solar");
        setVisible(true);
    }

    public static void main(String[] args){
        new SistemaSolar();
      
    }
}

