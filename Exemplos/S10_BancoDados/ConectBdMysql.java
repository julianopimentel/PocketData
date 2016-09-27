package Exemplos.S10_BancoDados;

import java.sql.*;
import javax.swing.*;


public class ConectBdMysql {
	
    // Declaração de Variáveis
    ImageIcon imgCon    = new ImageIcon("C:/Java/fontes/database/database_accept.png");
    ImageIcon imgStmt   = new ImageIcon("C:/Java/fontes/database/database_process.png");
    ImageIcon imgSql    = new ImageIcon("C:/Java/fontes/database/database_search.png");
    ImageIcon imgDown   = new ImageIcon("C:/Java/fontes/database/database_down.png");
    ImageIcon imgResult = new ImageIcon("C:/Java/fontes/database/database2.png");
    ImageIcon imgClose  = new ImageIcon("C:/Java/fontes/database/database_remove.png");
    
    
    public void AutenticaConexao() {
		
        
        // Verifica Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException etcpg) {
            System.exit(0);
        }
        
        // Verifica Permissões
        try {            
            
            // Parâmetros
            String url1 = "jdbc:mysql://192.168.56.101:3306/domotica";
            String usuario1 = "aluno";
            String senha1 = "teste123";
            
            
            // Define conexão
            Connection con1 = DriverManager.getConnection(url1, usuario1, senha1);
                JOptionPane.showMessageDialog(null, "Conexao com Banco de Dados testada com sucesso!", "Mensagem", 1);

            // Cria Statement
            Statement stmt1 = con1.createStatement();
            stmt1.close();  

            // Fecha a conexao
            con1.close();
            
            JOptionPane.showMessageDialog(
                null, "Conexao com Banco de Dados Domotica finalizada com sucesso!", "Mensagem",1);
            
        } catch(SQLException esql1) {
            JOptionPane.showMessageDialog(null, ""+esql1.getMessage(),"Mensagem",1);
        }
    }
    
    public void TestaConexao(String pUrl, String pUsuario, String pSenha, String pSql) {
		
        // Verifica driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        
        catch (ClassNotFoundException exdrpg) {
            System.exit(0);
        }
        
        // Verifica permissões
        try {            
            
            // Define conexão
            Connection con2 = DriverManager.getConnection(pUrl, pUsuario, pSenha);
                //JOptionPane.showMessageDialog(null, "Conexao com Banco de Dados testada com sucesso!", "Mensagem", 1);

                JOptionPane.showMessageDialog(
                    null, "Conexao com BD testada com sucesso!", "Mensagem" , 1, imgCon);
            		            
                
            // Criar Statement (performance)
            Statement stmt1 = con2.createStatement();
                JOptionPane.showMessageDialog(
                    null, "Statement criado com sucesso!", "Mensagem", 1, imgStmt);

            // Executa SQL 
            stmt1.executeQuery(pSql);
                JOptionPane.showMessageDialog(
                    null, "Query SQL realizada com sucesso!", "Mensagem", 1, imgSql);
            
            // Executa consulta
            ResultSet rs = stmt1.executeQuery(pSql);
                JOptionPane.showMessageDialog(
                    null, "Resultados recebidos com sucesso!", "Mensagem", 1, imgDown );

            
            String ResultadoSQL;
            ResultadoSQL = "";
            
            while (rs.next()) {            
                for (int i=1; i <= rs.getMetaData().getColumnCount(); ++i){
                   ResultadoSQL = ResultadoSQL + (rs.getObject(i)) + "\n";
                }
            }
		        
            JOptionPane.showMessageDialog(null, ResultadoSQL, "Mensagem", 1, imgResult);

            // Encerrar recursos
            rs.close();
            
            // Fecha Statement
            stmt1.close();  

            // Fecha a Conexao
            con2.close();
            
            JOptionPane.showMessageDialog(
                null, "Conexao com Banco de Dados Domotica finalizada com sucesso!", "Mensagem",1, imgClose);
            
        } 
        
        catch(SQLException esql2) {
            JOptionPane.showMessageDialog(null, ""+esql2.getMessage(),"Mensagem",1);
        }
    }
}
