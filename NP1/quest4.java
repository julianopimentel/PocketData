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
public class quest4 {
    private static void somaTres(int x[])
    {
        x[0] += 5;
        System.out.println("x posicao 0");
    }
    
    private static void somaDois(int x)
    {
        x +=4;
    }
    
    public static void main(String[] args) {
        int x = 0;
        int y[] = {0};
        
        somaDois(x);
        somaTres(y);
        somaDois(y[0]);
        
        System.out.println(x + " , " + y[0]);
        
    }
    
}
