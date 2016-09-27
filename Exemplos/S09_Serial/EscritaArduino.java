package Exemplos.S09_Serial;

public class EscritaArduino {

    public static void main(String[] args){
        
        SerialCom serialEscrita = new SerialCom("COM1", 9600, 0);
        serialEscrita.HabilitarEscrita();
        serialEscrita.ObterIdDaPorta();
        
        //serialEscrita.EnviarUmaString("Java acessando porta serial!");
        
        try { 
            
            Thread.sleep(3000);
            System.out.println("\n...Sicronizando RS-232...");
            
            Thread.sleep(3000);
            System.out.println("\n...OPEN COM1...\n");
            serialEscrita.AbrirPorta();
            
            Thread.sleep(3000);
            System.out.print("Enviando bit -> ");                
            serialEscrita.EnviarUmaString("1");
            Thread.sleep(3000);
            System.out.println("\n...Alarme ON...");
            
            System.out.print("Tempo: ");                
            for (int i=1; i<11; i++){
                System.out.print(i + " - ");
                Thread.sleep(1000); 
            }
            System.out.print("segundos\n");                
            
            System.out.print("\nEnviando bit -> ");                
            serialEscrita.EnviarUmaString("0");
            Thread.sleep(3000);
            System.out.println("\n...Alarme OFF...\n");
            
            Thread.sleep(3000);
            serialEscrita.FecharCom();
            System.out.println("\n...OFF COM1...");
            
            Thread.sleep(3000);
            
        } catch (Exception e1) { 
            System.out.println("Thread interrompida!"); 
        }
        
        
    }

}
