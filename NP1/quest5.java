/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NP1;

/**
 *
 * @author Juliano Pimentel
 */
public class quest5 {
    String texto;
    
    public String avalicaoNP1(){
        
        String buff="";
        int i =1;
        int tamanho = texto.length();
        
        while (i<= tamanho){
           
            buff+=texto.charAt(5);
            i+=1;
            

           
            
        }
        return buff;
    }
    public static void main(String[] args) {
        quest5 prova = new quest5();
        prova.texto ="java, sempre nota 10!";
        
        System.out.println(prova.avalicaoNP1().concat(prova.texto));
    }
    
    
    
}
