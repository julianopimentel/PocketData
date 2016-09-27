package Exemplos.S06_Classes;

public class Avaliacao {

    int nota1;
    int nota2;
    float media;
    
    
    // Método de Atualização (SET)
    public void setNota1 (int np1){
        this.nota1 = np1;
    }

    public void setNota2 (int np2){
        this.nota2 = np2;
    }

    // Método de Retorno (GET)
    public int getNota1(){
        return nota1;
    }   
    
    public int getNota2(){
        return nota2;
    }   

    // Polimorfismo
    public void setMedia (int np1, int np2){
        this.media = (np1+np2)/2;
    }

    public void setMedia (int pn1, int pn2, int exame){
        this.media = (pn1+pn2+exame)/3;
    }
    
    public void setMedia (int pn1, int pn2, int exame, int exec){
        this.media = (pn1+pn2+exame+exec)/4;
    }
    
    public void setMedia (int pn1, int pn2, int exame, int exec, int trab){
        this.media = (pn1+pn2+exame+exec+trab)/5;
    }
    
    public void setMedia (int pn1, int pn2, int exame, int exec, int trab, int pres){
        this.media = (pn1+pn2+exame+exec+trab+pres)/6;
    }
    

    public float getMedia(){
        return media;
    }   


}
