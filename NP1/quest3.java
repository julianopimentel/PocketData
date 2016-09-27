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
public class quest3 {
    public static int calcular (int x){
            return x*2;
}
    public static int calcular(int y, int z){
        return z-y;
    }
    
    public static void main(String[] args) {
        int x = 5; //11
       int y = 8; //21
       int z = 10;
       
       x += calcular(y++ + ++z);
        System.out.println(x);//33
    }
}
