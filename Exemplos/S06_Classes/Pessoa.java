package Exemplos.S06_Classes;

public class Pessoa {

    private String nome;   
    private String sexo;

    private int nascimento;
    private int identidade;
    private int cpf;
    
    // Método de Atualização (SET)
    public void setNome (String pnome){
        this.nome = pnome;
    }
    
    // Método de Retorno (GET)
    public String getNome(){
        return nome;
    }     
}
