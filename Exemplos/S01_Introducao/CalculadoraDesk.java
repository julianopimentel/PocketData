package Exemplos.S01_Introducao;

import javax.swing.*; // importa o pacote de classes visuais de Java

public class CalculadoraDesk {     
    	
    public static void somarDoisNumeros() {
            
        // Entrada de Dados
        int n1;
        int n2;        
        int soma;
        String result, nome, resposta; 
        
        // Autenticação
        
        // Apresenta uma caixa de entrada de dado
        nome = JOptionPane.showInputDialog(null,"Digite seu nome para autenticação"); 
        
        // Cria a String de saída
        resposta= "Confirmando autenticação -> " + nome ; 
	JOptionPane.showMessageDialog(null, resposta, "Autenticação", 1);
        
        //Entrada de dados
        n1 = 1;
        n2 = 3;
        result = "Acessando a Classe Calculadora Desktop\n";
        JOptionPane.showMessageDialog(null, result, "Entrada de Dados", 1);
                
        // Processamento de Dados
        soma = n1 + n2;
        result = "Processamento executado com sucesso ..\n";
        JOptionPane.showMessageDialog(null, result, "Processamento de Dados", 1);
        
        // Saída de Dados no Desktop        
        // Apresenta uma caixa de mensagem com o resultado do programa
        result = "A soma de N1 + N2 é igual a ";
        JOptionPane.showMessageDialog(null, result + " " + soma, "Resultado", 1);
        
        // Saída de Dados no Console
        result = "A soma de n1 + n2 e igual ->";        
        System.out.println(result + " " + soma);  
    }
}
