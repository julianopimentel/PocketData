package Exemplos.S06_Classes;

public class Aluno extends Pessoa {    
    
    private String curso;
    private int matricula;    
    
    // Método de Atualização (SET)
    public void setCurso (String pCurso){
        this.curso = pCurso;
    }
    
    public void setMatricula (int pmatricula){
        this.matricula = pmatricula;
    }
    
    // Método de Retorno (GET)
    public String getCurso(){
        return curso;
    }
    
    public int getMatricula(){
        return matricula;
    }     

    
}
