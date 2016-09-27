package Exemplos.S02_Tela;

public class Sistema2 {
    	
    public static void main ( String arg[]) {

        System.out.print("Seja bemvindo ao Sistema2!");        
        
        
    // ----- Modulo Seguranca ------------------------------ //
        
        /* Acesso ao Modulo de Seguranca
         * Para acessar os métodos, basta retirar as  "//" 
         */
            
            Seguranca.Autenticacao();
            //Seguranca.ConvertStringDouble();
            //Seguranca.SelectSis();

        
    // ----- FIM do Modulo Seguranca ----------------------- //
        
        
        
    // ----- Modulo Menu ----------------------------------- //
        
        /* Acesso ao Modulo Menu
         * Define um Painel de Trabalho
         * Para acessar os métodos, basta retirar as  "/*" 
         */
                

          
        
        Menu menuPrincipal = new Menu();
       
        try { 
            Thread.sleep (3000);
            menuPrincipal.montaTela1();
        } catch (InterruptedException ie1) {} 
        
        try { 
            Thread.sleep (3000);
            menuPrincipal.montaTela2();
        } catch (InterruptedException ie2) {} 
      
        try { 
            Thread.sleep (3000);
            menuPrincipal.montaTela3();
        } catch (InterruptedException ie3) {} 
      
        try { 
            Thread.sleep (3000);
            menuPrincipal.montaTela4();
        } catch (InterruptedException ie4) {} 
        
        
        System.out.println("\nDesligando o Sistema!");
        
        try { 
            Thread.sleep (3000);
            System.exit(0);
        } catch (InterruptedException ie5) {} 
        
      
        


    // ----- FIM do Modulo Menu ---------------------------- //
                

        
    }
}
