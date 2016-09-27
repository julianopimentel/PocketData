package Exemplos.S10_BancoDados;

import java.sql.*;
import javax.swing.*;

public class BdWsSaude {
	
    public void TestaConexaoPG(){
		
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e1) {
            System.exit(0);
        }
        
        try {            
            String url1 = "jdbc:postgresql://192.168.1.10/saude";
            String usuario1 = "cristiano";
            String senha1 = "teste123";
            
            Connection con1 = DriverManager.getConnection(url1, usuario1, senha1);
            
            JOptionPane.showMessageDialog(
                null, 
                "Conexao com Banco de Dados Saude testada com sucesso!", 
                "Mensagem", 1);
			
            // criar Statement
            Statement stmt1 = con1.createStatement();
            //stmt.executeUpdate(Cadastra);  
            stmt1.close();  

            // fecha a conexao
            con1.close();
            
            JOptionPane.showMessageDialog(
                null, 
                "Conexao com Banco de Dados Saude finalizada com sucesso!", 
                "Mensagem",1);
            
            //System.exit(0);
            
        } catch(SQLException e2) {
            JOptionPane.showMessageDialog(null, ""+e2.getMessage(),"Mensagem",1);
        }
    }
	
    public void CadastraDados(String Cadastra){

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e3) {
            System.exit(0);
        }
        
        try {
            String url2 = "jdbc:postgresql://192.168.1.10/saude";
            String usuario2 = "postgres";
            String senha2 = "teste123";
            Connection con2 = DriverManager.getConnection(url2, usuario2, senha2);
            
            JOptionPane.showMessageDialog(
                null, 
                "Conexao com BD-Saude para cadastro testada com sucesso!", 
                "Mensagem", 1);
			
            Statement stmt2 = con2.createStatement();  
            stmt2.executeUpdate(Cadastra);  
            stmt2.close();  

            //con2.commit();
            //JOptionPane.showMessageDialog(null, "Base de Dados Atualizada!", "Mensagem",1);
			
            con2.close();
            JOptionPane.showMessageDialog(
                null, 
                "Conexao com BD-Saude para cadastro finalizada com sucesso!", 
                "Mensagem",1);
			
            //System.exit(0);
        }
	
        //catch(ClassNotFoundException e2) {
        //    JOptionPane.showMessageDialog(null,"Driver JDBC-ODBC n�o encontrado ","Mensagem",1);
            //System.exit(0);
	//}
	
        catch(SQLException e4) {
            JOptionPane.showMessageDialog(null, ""+e4.getMessage(),"Mensagem",1);
            //System.exit(0);
        }
    }
    
    /*	
	public String ConsultaDados(String Pesquisa){
		
		try {

			// Obter conex�o
			String Url2 = "jdbc:odbc:JavaMedico";
		    Connection Con2 = DriverManager.getConnection(Url2);
		    ConsultaBD = "";
		    int contador = 0;
		    
		    // Criar Statement
		    Statement Stmt2 = Con2.createStatement();
		      
		    // Executar consulta
		    ResultSet RS = Stmt2.executeQuery("select * from Pacientes");
		    
		    while (RS.next()) {
		    	
		    	ConsultaBD = ConsultaBD + "Paciente " + contador + "\n" + 
		    				 "Nome : "	+ RS.getString("Nome") 		+ "\n" +
		    				 "Nasc.: " 	+ RS.getString("DataNasc") 	+ "\n" +
		    				 "IMC  : " 	+ RS.getString("IMC") + " \n\n";
		    	
		    	contador = contador + 1;
				
		    }
		        
		    // Encerrar recursos
		    RS.close();
		    Stmt2.close();
		    Con2.close();
		        
		  	} 
		
			catch (SQLException sql1) {
				System.out.println("Erro: "+sql1);
			}
			
			return ConsultaBD;
	}

	*/
    
    public static void main (String Consulta) {
        BdWsSaude bds = new BdWsSaude();
    }
}