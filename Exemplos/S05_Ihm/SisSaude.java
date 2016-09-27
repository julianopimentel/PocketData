package Exemplos.S05_Ihm;

/*
 * UNIP - Universidade Paulista - Campus Manaus
 * Curso: Tecnologia em Desenvolvimento e Analise de Sistemas
 * Prof. Cristiano
 * Data: 07/01/2015
 * SisMedico Versao 4.0
 */

import java.awt.*;  	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import S07_BancoDados.BdPgSaude;
//import S07_BancoDados.BdWsSaude;

public class SisSaude extends JFrame implements ActionListener {
	
    // Declaracao de Variaveis
    public static JLabel 
        jlTitulo, jlNome, jlPaciente, jlDadosClinicos, jlDataNascimento, jlAltura, jlPeso, jlIMC; 
        
    //public static Font 
        //F1, F2, fonteSansSerif;
    
    public static JTextField 
        jtfPaciente, jtfEndereco, jtfDataNascimento, jtfAltura, jtfPeso, jtfIMC;
    
    public static JButton 
        jbIMC, jbCadastra, jbCancela, jbConfirma, jbSair;
    
    public static String 
        sPaciente, sEndereco, sDataNascimento, sAltura, sPeso, sIMC;
    
    public static Double 
        dAltura, dPeso, dIMC;
    
    public static JTextArea 
        jtacadastro;
    
    // Metodo que desenha a tela
    public void Tela() {
        getContentPane().setLayout(null);   // Padrao de tela
        setTitle("PACIENTES - CADASTRO");   // jlTitulo
        setLocation(200,20);    // Localizacao
        setSize(780,500);       // Tamanho
        setVisible(false);      // Visibilidade
        setResizable(false);    // Ajuste
        getContentPane().setBackground(Color.lightGray);    // Cores
    }
	
    // Metodo que desenha as etiquetas (labels)
    public void Etiquetas() {	
		
        // Fontes
        Font Ft1 = new Font("Sans Serif",Font.ITALIC,18);	
        Font Ft2 = new Font("Sans Serif",Font.BOLD,14);
        Font Ft3 = new Font("Sans Serif",Font.BOLD,12);
		
        // Label jlTitulo
        JLabel labelTitulo = new JLabel();
        labelTitulo.setLocation(150,10);	
        labelTitulo.setSize(500,30);
        labelTitulo.setFont(Ft1);
        labelTitulo.setText("SISTEMA MEDICO - CADASTRO DE PACIENTES");	
        labelTitulo.setForeground(Color.blue);	
        this.jlTitulo = labelTitulo ;	
        getContentPane().add(labelTitulo);
		
        // Label jlNome
        JLabel labelNome = new JLabel();
        labelNome.setLocation(10,60);	
        labelNome.setSize(200,15);
        labelNome.setFont(Ft2);
        labelNome.setText("Paciente:");
        labelNome.setForeground(Color.black);
        labelNome.setToolTipText(null);
        this.jlNome = labelNome;
        getContentPane().add(labelNome);
		
        // Label sEndereco do sPaciente
        JLabel labelPaciente = new JLabel();
        labelPaciente.setLocation(10,110);	
        labelPaciente.setSize(200,15);
        labelPaciente.setFont(Ft2);
        labelPaciente.setText("Endereco:");
        labelPaciente.setForeground(Color.black);
        labelPaciente.setToolTipText(null);
        this.jlPaciente = labelPaciente;
        getContentPane().add(labelPaciente);
        
        // Label Dados Clinicos
        JLabel labelDadosClinicos = new JLabel();
        labelDadosClinicos.setLocation(70,170);	
        labelDadosClinicos.setSize(250,15);
        labelDadosClinicos.setFont(Ft2);
        labelDadosClinicos.setText("DADOS CLINICOS DO PACIENTE");
        labelDadosClinicos.setForeground(Color.RED);
        labelDadosClinicos.setToolTipText(null);
        this.jlDadosClinicos = labelDadosClinicos;
        getContentPane().add(labelDadosClinicos);
        
        // Label Data de Nascimento
        JLabel labelDataNascimento = new JLabel();
        labelDataNascimento.setLocation(10,200);	
        labelDataNascimento.setSize(200,15);
        labelDataNascimento.setFont(Ft3);
        labelDataNascimento.setForeground(Color.black);
        labelDataNascimento.setText("Data Nascimento");
        this.jlDataNascimento = labelDataNascimento;
        getContentPane().add(labelDataNascimento);
	
        // Label sAltura
        JLabel labelAltura = new JLabel();
        labelAltura.setLocation(120,200);	
        labelAltura.setSize(250,15);
        labelAltura.setFont(Ft3);
        labelAltura.setForeground(Color.black);
        labelAltura.setText("Altura");
        this.jlAltura = labelAltura;
        getContentPane().add(labelAltura);
	
        // Label sPeso
        JLabel labelPeso = new JLabel();
        labelPeso.setLocation(170,200);	
        labelPeso.setSize(200,15);
        labelPeso.setFont(Ft3);
        labelPeso.setForeground(Color.black);
        labelPeso.setText("Peso");
        this.jlPeso = labelPeso;
        getContentPane().add(labelPeso);
        
        // Label IMC
        JLabel labelIMC = new JLabel();
        labelIMC.setLocation(10,250);	
        labelIMC.setSize(200,15);
        labelIMC.setFont(Ft3);
        labelIMC.setForeground(Color.black);
        labelIMC.setText("IMC");
        this.jlIMC = labelIMC;
        getContentPane().add(labelIMC);
	
    }
	
    // Metodo que desenha as caixas de textos (jtextfield)
    public void CxTextos() {
		
        Font fonteSansSerif = new Font("Sans Serif",Font.ITALIC,10);
		
        // Cx Txt jlNome do sPaciente
        JTextField textoPaciente = new JTextField();
        textoPaciente.setLocation(10,80);	
        textoPaciente.setSize(200,25);
        textoPaciente.setToolTipText("Por favor, informe o nome do paciente");
        this.jtfPaciente = textoPaciente ;
        getContentPane().add(textoPaciente);
		
        // Cx Txt sEndereco do sPaciente
        JTextField textoEndereco = new JTextField();
        textoEndereco.setLocation(10,130);	
        textoEndereco.setSize(200,25);
        textoEndereco.setFont(fonteSansSerif);
        textoEndereco.setToolTipText("Por favor, informe o endereco do cliente");
        this.jtfEndereco = textoEndereco;
        getContentPane().add(textoEndereco);
        
        // Cx Txt Data de Nascimento do sPaciente
        JTextField textoDNascimento = new JTextField();
        textoDNascimento.setLocation(10,220);	
        textoDNascimento.setSize(70,25);
        textoDNascimento.setToolTipText("Por favor, informe a data de nascimento do paciente");
        this.jtfDataNascimento = textoDNascimento;
        getContentPane().add(textoDNascimento);
        
        // Cx Txt sAltura do sPaciente
        JTextField textoAltura = new JTextField();
        textoAltura.setLocation(120,220);	
        textoAltura.setSize(30,25);
        textoAltura.setToolTipText("Por favor, informe a altura do paciente");
        textoAltura.setText("0.0");
        this.jtfAltura = textoAltura;
        getContentPane().add(textoAltura);
        
        // Cx Txt sPeso do sPaciente
        JTextField textoPeso = new JTextField();
        textoPeso.setLocation(170,220);	
        textoPeso.setSize(30,25);
        textoPeso.setToolTipText("Por favor, informe o peso do paciente");
        textoPeso.setText("0.0");
        this.jtfPeso = textoPeso;
        getContentPane().add(textoPeso);
        
        // Cx Txt IMC do sPaciente
        JTextField textoIMC = new JTextField();
        textoIMC.setLocation(120,270);	
        textoIMC.setSize(200,25);
        textoIMC.setToolTipText("IMC do paciente");
        textoIMC.setEditable(false);
        //jtfImc.setText("0.0");
        this.jtfIMC = textoIMC;
        getContentPane().add(textoIMC);
    }
	
    // Metodo que desenha os botoes (JButton)
    public void Botoes(){
		
        // Botao IMC
        JButton botaoIMC = new JButton("IMC");
        botaoIMC.setLocation(10,270);	
        botaoIMC.setSize(100,35);
        botaoIMC.setToolTipText("Calcular o IMC do Paciente");
        //botaoIMC.setIcon(new ImageIcon(getClass().getResource("calculator.png")));
        botaoIMC.addActionListener(this);
        this.jbIMC = botaoIMC;
        getContentPane().add(botaoIMC); 
		
        // Botao Cadastrar sPaciente
        JButton botaoCadastra = new JButton("Cadastrar");
        botaoCadastra.setLocation(10,320);	
        botaoCadastra.setSize(150,35);
        botaoCadastra.setToolTipText("Cadastrar Pacientes");
        //botaoCadastra.setIcon(new ImageIcon(getClass().getResource("add.png")));
        botaoCadastra.addActionListener(this);
        this.jbCadastra = botaoCadastra;
        getContentPane().add(botaoCadastra); 
	
        // Botao Cancelar
        JButton botaoCancela = new JButton("Cancela");
        botaoCancela.setLocation(161,320);	
        botaoCancela.setSize(170,35);
        botaoCancela.setToolTipText("Limpar Dados");
        //botaoCancela.setIcon(new ImageIcon(getClass().getResource("clear.png")));
        botaoCancela.addActionListener(this);
        this.jbCancela = botaoCancela;
        getContentPane().add(botaoCancela);	
        
        // Botao Confirma
        ImageIcon iconeConfirma = new ImageIcon("C:/Java/fontes/botoes/confirm.png");
        JButton botaoConfirma = new JButton("Confirma",iconeConfirma);
        botaoConfirma.setLocation(400,380);	
        botaoConfirma.setSize(150,35);
        botaoConfirma.setToolTipText("Confirmar Dados");
        //botaoConfirma.setIcon(new ImageIcon(getClass().getResource("confirm.png")));
        botaoConfirma.addActionListener(this);
        this.jbConfirma = botaoConfirma;
        getContentPane().add(botaoConfirma);
		
        // Botao Sair
        ImageIcon iconeSair = new ImageIcon("C:/Java/fontes/botoes/exit.png");
        JButton botaoSair = new JButton("Sair",iconeSair);
        botaoSair.setLocation(570,380);	
        botaoSair.setSize(170,35);
        botaoSair.setToolTipText("Sair do Sistema");
        //botaoSair.setIcon(new ImageIcon(getClass().getResource("exit.png")));
        botaoSair.addActionListener(this);
        this.jbSair = botaoSair;
        getContentPane().add(botaoSair);	
    }
	
    // Metodo que desenha a area de texto (JTextArea)
    public void AreaTexto() {
        JTextArea jtaCadastro = new JTextArea();
        jtaCadastro.setBorder(BorderFactory.createLineBorder(Color.black,2));
        jtaCadastro.setLocation(400,60);	
        jtaCadastro.setSize(350,300);
        jtaCadastro.setText("# # # # #  Sistema Medico - Cadastro de Pacientes  # # # # #\n");
        jtaCadastro.setEditable(false);
        this.jtacadastro = jtaCadastro;
        getContentPane().add(jtaCadastro);
    }
	
    public void actionPerformed(ActionEvent e) {
		 
        // Eventos Botao IMC
        if (e.getSource() == jbIMC) {			
			
            sAltura = jtfAltura.getText();
            sPeso = jtfPeso.getText();
		
            dAltura = Double.parseDouble(sAltura);
            dPeso = Double.parseDouble(sPeso);
			
            dIMC = (dPeso/(dAltura*dAltura));
            sIMC = Double.toString(dIMC);
            jtfIMC.setText(sIMC);
			
            //Ta.append(" \nPaciente Cadastrado: \n" + sPaciente);
            //Ta.append(" \nEndere?o: \n" + sEndereco);
            //Ta.append(" \nNascimento: \n" + sDataNascimento);
            //Ta.append("\n\nConfirma? ");
        }
		
        // Eventos Botao Cadastrar
        if (e.getSource() == jbCadastra) {
            sPaciente = jtfPaciente.getText();
            sEndereco = jtfEndereco.getText();
            sDataNascimento = jtfDataNascimento.getText();
            jtacadastro.append(" \nPaciente Cadastrado: \n" + sPaciente);
            jtacadastro.append(" \nEndereco: \n" + sEndereco);
            jtacadastro.append(" \nNascimento: \n" + sDataNascimento);
            jtacadastro.append("\n\nConfirma? ");
        }
		 
        // Eventos Botao Cancela
        if (e.getSource() == jbCancela) {
            jtfPaciente.setText("");
            jtfEndereco.setText("");
            jtfDataNascimento.setText("");
            jtfAltura.setText("0.0");
            jtfPeso.setText("0.0");
            jtfIMC.setText("");
            jtacadastro.setText("SISTEMA MEDICO - CADASTRO DE PACIENTES\n");			
         }
		 
         // Eventos Botao Confirma
         if (e.getSource() == jbConfirma) {
                
            //BdSaude bd = new BdPgSaude();         // BD Local
            //BdWsSaude bd = new BdWsSaude();  // BD Server
		
            //bd.TestaConexaoPG();
            //bd.CadastraDados(
                //"INSERT INTO pacientes(nome, datanasc, imc)"+  // Codigo SQL
                //"VALUES('"+sPaciente+"','"+sDataNascimento+"','"+sIMC+"');"); 
                //"VALUES('lucas','0101001','22');"); 

            jtfPaciente.setText("");
            jtfEndereco.setText("" );
            jtacadastro.setText("SISTEMA MEDICO - CADASTRO DE PACIENTES\n");
            jtacadastro.append ("\nPaciente Cadastrado com sucesso!\n");
         }
         
        // Eventos Botao Sair
        if (e.getSource() == jbSair) {
            System.exit(0);			
        }
    }
	
    // Classe Cadastro de Pacientes
    public void CadastroPaciente() {
        Tela();
        Etiquetas();
        CxTextos();
        AreaTexto();
        Botoes();
        setVisible(true);               
    }
    
    // Metodo principal
    public static void main (String[] args) {      
        
        SisSaude setorTriagem = new SisSaude();
        setorTriagem.CadastroPaciente();
        
    }
}

