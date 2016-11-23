/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema_Solar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juliano Pimentel
 */
public class Controle {

        
    JLabel area;
    
    // Autenticacao
    static String login, senha, log;
    static String user;
    
    public String getNomeJogador() {
        return this.login;
    }
                
    public static void Autenticacao(){    
        
        login = JOptionPane.showInputDialog(null,"Digite o seu nome");
        
        if(!login.equals(user) )	{
        }
 
        else {
            log = ("Usuario não autenticado");
            JOptionPane.showMessageDialog(null, log, "Autenticação", 1);
        }
      new Inicial().setVisible(true);
    }
}    