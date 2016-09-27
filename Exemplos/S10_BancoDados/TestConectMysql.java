/*
 * UNIP - Universidade Paulista - Campus Manaus
 * Curso: Tecnologia em Desenvolvimento e Analise de Sistemas
 * Prof. Cristiano
 * Data: 24/04/2014
 * TestConectMysql Versao 1.0
 */

package Exemplos.S10_BancoDados;

import java.awt.*;  	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestConectMysql extends JFrame implements ActionListener {
	
    // Declaracao de Variaveis
    public static JLabel jlTitulo, jlUrl, jlUsuario, jlSenha, jlSql;    
    public static Font F1, F2, F3;    
    public static JTextField txUrl, txUsuario, txSenha, txSql;    
    public static JButton btnCadastra, btnTestaConexao, btnValidaParametros, btnCancela,  btnSair;    
    public static String Url, Usuario, Senha, Sql;    
    public static JTextArea Ta;
    
    ImageIcon Im1;
	
    // Classe Cadastro de Pacientes
    public TestConectMysql() {
        Tela();
        Etiquetas();
        CxTextos();
        AreaTexto();
        Botoes();
        setVisible(true);       
    }
	
    // Metodo que desenha a tela
    public void Tela() {
        getContentPane().setLayout(null);   // Padrao de tela
        setTitle("Testa Conexao");          // Titulo
        setLocation(200,20);                // Localizacao
        setSize(780,500);                   // Tamanho
        setVisible(false);                  // Visibilidade
        setResizable(false);                // Ajuste
        getContentPane().setBackground(Color.lightGray); // Cores
    }
	
    // Metodo que desenha as etiquetas (labels)
    public void Etiquetas() {	
		
        // Fontes
        Font F1 = new Font("Sans Serif",Font.ITALIC,18);	
        Font F2 = new Font("Sans Serif",Font.BOLD,14);
        Font F3 = new Font("Sans Serif",Font.BOLD,12);
		
        // Label Titulo
        JLabel jlTitulo = new JLabel();
        jlTitulo.setLocation(150,10);	
        jlTitulo.setSize(500,30);
        jlTitulo.setFont(F1);
        jlTitulo.setText("Testa Base de Dados");	
        jlTitulo.setForeground(Color.blue);	
        this.jlTitulo = jlTitulo ;	
        getContentPane().add(jlTitulo);
		
        // Label Url
        JLabel jlUrl = new JLabel();
        jlUrl.setLocation(10,60);	
        jlUrl.setSize(200,15);
        jlUrl.setFont(F2);
        jlUrl.setText("Url");
        jlUrl.setForeground(Color.black);
        jlUrl.setToolTipText(null);
        this.jlUrl = jlUrl;
        getContentPane().add(jlUrl);
		
        // Usuario
        JLabel jlUsuario = new JLabel();
        jlUsuario.setLocation(10,110);	
        jlUsuario.setSize(200,15);
        jlUsuario.setFont(F2);
        jlUsuario.setText("Usuario");
        jlUsuario.setForeground(Color.black);
        jlUsuario.setToolTipText(null);
        this.jlUsuario = jlUsuario;
        getContentPane().add(jlUsuario);
        
        // Senha
        JLabel jlSenha = new JLabel();
        jlSenha.setLocation(10,170);	
        jlSenha.setSize(200,15);
        jlSenha.setFont(F2);
        jlSenha.setForeground(Color.black);
        jlSenha.setText("Senha");
        this.jlSenha = jlSenha;
        getContentPane().add(jlSenha);
	
        // Label Sql
        JLabel jlSql = new JLabel();
        jlSql.setLocation(10,220);	
        jlSql.setSize(250,15);
        jlSql.setFont(F2);
        jlSql.setForeground(Color.black);
        jlSql.setText("Sql");
        this.jlSql = jlSql;
        getContentPane().add(jlSql);
	
    }
	
    // Metodo que desenha as caixas de textos (jtextfield)
    public void CxTextos() {
		
        Font F3 = new Font("Sans Serif",Font.ITALIC,10);
		
        // CxTxt Url
        JTextField ctUrl = new JTextField();
        ctUrl.setLocation(10,80);	
        ctUrl.setSize(300,25);
        ctUrl.setText("jdbc:mysql://192.168.56.102:3306/...");
        ctUrl.setToolTipText("Por favor, informe a URL");
        this.txUrl = ctUrl ;
        getContentPane().add(ctUrl);
		
        // CxTxt Usuario
        JTextField ctUsuario = new JTextField();
        ctUsuario.setLocation(10,130);	
        ctUsuario.setSize(300,25);
        //Tx2.setFont(F3);
        ctUsuario.setToolTipText("Por favor, informe o Usuario");
        this.txUsuario = ctUsuario;
        getContentPane().add(ctUsuario);
        
        // CxTxt Senha
        JTextField ctSenha = new JTextField();
        ctSenha.setLocation(10,190);	
        ctSenha.setSize(300,25);
        ctSenha.setToolTipText("Por favor, informe a Senha");
        this.txSenha = ctSenha;
        getContentPane().add(ctSenha);
        
        // CxTxt Sql
        JTextField jtfSql = new JTextField();
        jtfSql.setLocation(10,240);	
        jtfSql.setSize(300,75);
        jtfSql.setToolTipText("Por favor, informe Sql");
        //jtfSql.setText("0.0");
        this.txSql = jtfSql;
        getContentPane().add(jtfSql);
        
    }
	
    // Metodo que desenha os botoes (JButton)
    public void Botoes(){
		
        // Botao Cadastrar Informacao
        btnCadastra = new JButton("Cadastrar Dados");
        btnCadastra.setLocation(10,330);	
        btnCadastra.setSize(200,25);
        btnCadastra.setToolTipText("Cadastrar Dados");
        btnCadastra.addActionListener(this);
        this.btnCadastra = btnCadastra;
        getContentPane().add(btnCadastra); 
		
        // Botao Valida Parametros
        btnValidaParametros = new JButton("Valida Parametros");
        btnValidaParametros.setLocation(400,380);	
        btnValidaParametros.setSize(150,25);
        btnValidaParametros.setToolTipText("Valida Parametros");
        btnValidaParametros.addActionListener(this);
        this.btnValidaParametros = btnValidaParametros;
        getContentPane().add(btnValidaParametros);
		
        // Botao Testa Conexão
        btnTestaConexao = new JButton("Testa Conexao");
        btnTestaConexao.setLocation(400,420);	
        btnTestaConexao.setSize(150,25);
        btnTestaConexao.setToolTipText("Testa Conexao com BD");
        btnTestaConexao.addActionListener(this);
        this.btnTestaConexao = btnTestaConexao;
        getContentPane().add(btnTestaConexao);
	
        // Botao Cancelar
        btnCancela = new JButton("Cancela");
        btnCancela.setLocation(600,380);	
        btnCancela.setSize(150,25);
        btnCancela.setToolTipText("Limpar Dados");
        btnCancela.addActionListener(this);
        this.btnCancela = btnCancela;
        getContentPane().add(btnCancela);
        
        // Botao Sair
        ImageIcon Im1 = new ImageIcon("C:/Java/fontes/imagens/exit.png");
        btnSair = new JButton("Sair");
        btnSair.setLocation(600,420);	
        btnSair.setSize(150,25);
        btnSair.setToolTipText("Sai do Sistema");
        btnSair.addActionListener(this);
        this.btnSair = btnSair;
        getContentPane().add(btnSair);
    }
	
    // Metodo que desenha a area de texto (JTextArea)
    public void AreaTexto() {
        Ta = new JTextArea();
        Ta.setBorder(BorderFactory.createLineBorder(Color.black,2));
        Ta.setLocation(400,60);	
        Ta.setSize(350,300);
        Ta.setText("PARAMENTROS DE CONEXAO\n");
        Ta.setEditable(false);
        this.Ta = Ta;
        getContentPane().add(Ta);
    }
	
    public void actionPerformed(ActionEvent e) {
		 
        // Eventos Botao Cadastrar
        if (e.getSource() == btnCadastra) {
            
            Url = txUrl.getText();
            Usuario = txUsuario.getText();
            Senha = txSenha.getText();
            Sql = txSql.getText();
                 
            Ta.append(" \nURL: " + Url);
            Ta.append(" \nUsuario: " + Usuario);
            Ta.append(" \nSenha: " + Senha);
            Ta.append(" \nSql: " + Sql);
            Ta.append("\n\nConfirma? ");
        }
		 
        // Eventos Botao Cancela
        if (e.getSource() == btnCancela) {
            txUrl.setText("jdbc:postgresql://localhost/...");
            txUsuario.setText("");
            txSenha.setText("");
            txSql.setText("");
            Ta.setText("PARAMENTROS DE CONEXAO\n");			
        }
		 
        // Eventos Botao Valida Parametros
        if (e.getSource() == btnValidaParametros) {
            ConectBdMysql bd = new ConectBdMysql(); // BD Postgres Local
            bd.TestaConexao(Url, Usuario, Senha, Sql);
            Ta.setText("PARAMENTROS DE CONEXAO\n");				
        }
        
        	 
        // Eventos Botao Testa Conexao
        if (e.getSource() == btnTestaConexao) {
            
            ConectBdMysql bd = new ConectBdMysql(); // BD Postgres Local
            
            bd.AutenticaConexao();
        }
        
        // Eventos Botao Sair
        if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }
	
    // Metodo principal
    public static void main (String[] args) {
        TestConectMysql tbd = new TestConectMysql();
    }
}

