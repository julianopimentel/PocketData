package Exemplos.S06_Classes;

import javax.swing.JOptionPane;

public class Cadastro {

    public static void main (String args[]) {
    
        String opcao = JOptionPane.showInputDialog(null, ""
                + "------ Menu Principal ------"
                + "\n[1] - Cadastrar Aluno"
                + "\n[2] - Cadastrar Professor"
                + "\n[3] - Sair");
        

        // Cadastro de Aluno
        if (opcao.equals("1")){

            Aluno joao = new Aluno();
            
            // Recebe os dados via teclado
            String novoAluno = JOptionPane.showInputDialog(null, "Nome do Aluno: ");
	    JOptionPane.showMessageDialog(null,novoAluno,"Nome do Aluno Cadastrado!",1);	
	
            String novoCurso = JOptionPane.showInputDialog(null, "Nome do Curso: ");
	    JOptionPane.showMessageDialog(null,novoCurso,"Nome do Curso Cadastrado!",1);	
	
            // Mobilia a classe com os dados recebidos
            joao.setNome(novoAluno);
            joao.setCurso(novoCurso);
            
            // Saida de Dados
            System.out.println("\n--------- Saida de Dados ---------");
            System.out.println("Modulo: Cadastro de Aluno");
            System.out.println("Nome: " + joao.getNome());
            System.out.println("Matricula: " + joao.getCurso());
            System.out.println("Matricula: " + joao.getMatricula());
            System.out.println("\n");
        } 
        
        // Cadastro de Professor
        else if (opcao.equals("2")){
            System.out.println("\n--------- Saida de Dados ---------");
            System.out.println("Modulo: Cadastro de Professor");
            System.out.println("\n");
        }
        
        // Sair do Sistema
        else if (opcao.equals("3")){
            System.out.println("\n--------- Saida de Dados ---------");
            System.out.println("Sistema desenvolvido por: ");
            System.out.println("\n");
            System.exit(0);
        }
    }
}


//import java.util.Scanner;
//Scanner in = new Scanner(System.in);
//String nome = in.nextLine();
//int idade = in.nextInt();

