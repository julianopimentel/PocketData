// Exercicio: fazer as cores da Bandeira do Brasil

package Exemplos.S20_Temp;
import javax.swing.JFrame;
import java.util.Scanner;

public class Estrutura01_If extends JFrame {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String sensorSeguranca;
        
        System.out.print("Qual valor do sensor -> ");
        sensorSeguranca = in.nextLine();
        
        System.out.println("Valor do sensor -> " + sensorSeguranca);

        if (sensorSeguranca.equals("1")) {
            Tela menu = new Tela();
            menu.segurancaOn();
        }
        /*else if (sensorSeguranca.equals("0")) {
            Tela menu = new Tela();
            menu.segurancaOff();
        }*/
    }    
}