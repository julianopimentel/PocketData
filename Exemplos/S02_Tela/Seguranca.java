package Exemplos.S02_Tela;

import javax.swing.*;

public class Seguranca {
    
    JLabel area;
    
    // Autenticacao
    static String login, senha, log;
    static String user = "cristiano";
    static String password = "teste123";
    
    // Conversao
    static String sx, sy;             
    static double x,y;    
    
    // Selecao
    static String sistema, titulo, sisEsc;  
    
    public static void Autenticacao(){    
        
        login = JOptionPane.showInputDialog(null,"Digite o login: ");
        senha = JOptionPane.showInputDialog(null,"Digite a senha: ");
        
        if( login.equals(user) )	{
            log = ("Usuario autenticado");
            JOptionPane.showMessageDialog(null, log, "Autenticação", 1);
        }
 
        else {
            log = ("Usuario não autenticado");
            JOptionPane.showMessageDialog(null, log, "Autenticação", 1);
        }
        
        System.exit(0);
    }
    
    public static void ConvertStringDouble(){    
        
        sx = JOptionPane.showInputDialog(null,"Digite o valor de x = ");
        sy = JOptionPane.showInputDialog(null,"Digite o valor de y = ");
    
        x = Double.parseDouble(sx);
        y = Double.parseDouble(sy);
	
        if( x == y ) {
            String st = "Sao iguais !";
            JOptionPane.showMessageDialog(null,st,"Resultado da Comparação", 1);
        }
	
        if( x != y ) {
            String st = "Sao diferentes !";
            JOptionPane.showMessageDialog(null,st,"Resultado da Comparação", 1);
        }   
        
        System.exit(0);
    }    
      
    public static void SelectSis(){
        
        sistema = "Sistemas para Acesso  " +
                  "\n( 1 ) - SisAmbiental" +
                  "\n( 2 ) - SisSeguranca" +
                  "\n( 3 ) - SisSaude    ";
		
	String op = JOptionPane.showInputDialog(null,sistema);        
        int opcao = Integer.parseInt(op);
			    
        switch(opcao) {		
            
            case 1: 
                sistema = "Sistema Ambiental";
                break ;
            
            case 2: 
                sistema = "Sistema Seguranca";
                break ;
            
            case 3: 
                sistema = "Sistema Saude";
                break ;
            
            default: 
                sistema = "Sistema Inexistente!";
        }
		 
        titulo = "Sistema Computacional";
        sisEsc = "\nLiberado acesso para -> ";
        log = titulo + sisEsc + sistema;
		
        JOptionPane.showMessageDialog(null, log, sistema, 1);
		
        System.exit(0);
        
    }      
}
