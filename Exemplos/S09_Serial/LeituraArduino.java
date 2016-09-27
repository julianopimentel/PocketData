package Exemplos.S09_Serial;

public class LeituraArduino {
    
    static String portaCom, dadosRecebidosArduino; // parametros de comunicação
    
    public static void main(String[] args){

        SerialCom serialLeitura = new SerialCom("COM1", 9600, 0);
        serialLeitura.HabilitarLeitura();
        serialLeitura.ObterIdDaPorta();
        serialLeitura.AbrirPorta();
        serialLeitura.LerDados();
        
        try {
            Thread.sleep(10000);            
            dadosRecebidosArduino = serialLeitura.getMicrocontrolador();
        } catch (InterruptedException ex) {
            System.out.println("Erro na Thread: " + ex);
	}

        serialLeitura.FecharCom();
        System.out.println(dadosRecebidosArduino);

        if (dadosRecebidosArduino == "1") {
            System.out.println("Lampada Acessa!");
        } 
        
        if (dadosRecebidosArduino == "0") {
            System.out.println("Lampada Apagada!");
        }
    }
}
