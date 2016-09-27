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
public class quest2 
{
            private int x;
            private int y;

public quest2 (int x, int y){
setCoordenadas(x,y);
}
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return ("" + x + "," + y + "");
    }
    public static void main ( String arg[]) {
          
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 6;
    
    quest2 p = new quest2(a,b);
    quest2 q = new quest2(c,d);
    quest2 r = p;
            
    c=5;
            
    p.setCoordenadas(c, d);
        System.out.println(p + " 1");
        System.out.println(q + " 2");
        System.out.println(r + " 3");
       r.setCoordenadas(a, b );
        
        a=b;
        
               
        q.setCoordenadas(b, c);
        System.out.println(p + " 4");
        System.out.println(q + " 5");
        System.out.println(r + "6");
           }



           
    
}
