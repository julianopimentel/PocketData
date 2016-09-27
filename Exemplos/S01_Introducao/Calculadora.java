package Exemplos.S01_Introducao;

public class Calculadora {
    
    public static void somarDoisNumeros() {
        
        // Entrada de Dados
        int n1 = 2;
        int n2 = 3;        
        int soma;
        String result = "\nClasse Calculadora, inicializando variaveis ..";
        
        try {
            System.out.print(result); 
            Thread.sleep (4000);
        } catch (InterruptedException ie1) {} 
                
        // Processamento de Dados
        result = "\nProcessando Calculadora ..";
        
        try {
            System.out.print(result); 
            Thread.sleep (4000);
        } catch (InterruptedException ie2) {} 
        
        soma = n1 + n2;

        // Saida de Dados
        result = "\nA soma de n1 + n2 e igual ->";
        
        try {
            System.out.print(result); 
            Thread.sleep (4000);
        } catch (InterruptedException ie3) {} 
        
        System.out.print(" " + soma + "\n");

    }
}
