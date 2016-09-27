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
public class quest6 {
    
    public static class ClassMsg{
        
        public void processa (int par1, int par2){
            
            String msg= " na computacao = ";
            
            try{
                msg = msg + Double.toString(par1 / par2);
                System.out.print(msg);
            }
            catch(ArithmeticException ar){
                System.out.print( "linguagem ");
            }
            catch(Exception ex){
                System.out.print("Ex");
            }finally{
                System.out.print(" java ");
            }
            System.out.print(msg);
        }
    }
    
    public static void main(String[] args) {
        ClassMsg obj = new ClassMsg();
        obj.processa(0,0);
        System.out.print(100/10);
        
    }
            
                
            }
       