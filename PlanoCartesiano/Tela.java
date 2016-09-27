package PlanoCartesiano;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Tela extends Canvas{
        
    int[] x1,x2,x3,y1,y2,y3;
    char[] plano = {'X', 'Y'};    
    char[] modulo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    public Tela() {        
    }
    
    @Override
    public void paint(Graphics g) {
                
        g.setColor(Color.black);
          
        
        x1 = new int[] {268, 278, 288};
        y1 = new int[] {90, 80, 90};
        
        x2 = new int[] {595, 595, 605};
        y2 = new int[] {391, 410, 401 };
        
        g.fillPolygon(x1, y1, 3);     
        g.fillPolygon(x2, y2, 3);    
        
        g.fillRect(276, 85, 3, 400);
        
        g.fillRect(196, 400, 400, 3);
                        
        //Y
        g.drawChars(plano, 1, 1, 276, 70);  
        //X
        g.drawChars(plano, 0, 1, 620, 405);                       
        //ponto
        g.fillOval(272, 396, 10, 10);

        //modulos x
        g.drawChars(modulo, 1, 1, 302, 435);
        g.drawChars(modulo, 2, 1, 332, 435);
        g.drawChars(modulo, 3, 1, 362, 435);
        g.drawChars(modulo, 4, 1, 392, 435);
        g.drawChars(modulo, 5, 1, 422, 435);
        g.drawChars(modulo, 6, 1, 452, 435);
        g.drawChars(modulo, 7, 1, 482, 435);
        g.drawChars(modulo, 8, 1, 512, 435);
        g.drawChars(modulo, 9, 1, 542, 435);
        g.drawChars(modulo, 1, 1, 572, 435);        
        g.drawChars(modulo, 0, 1, 578, 435);        
        
        //modulo y
        g.drawChars(modulo, 1, 1, 243, 377);
        g.drawChars(modulo, 2, 1, 243, 347);
        g.drawChars(modulo, 3, 1, 243, 317);
        g.drawChars(modulo, 4, 1, 243, 287);
        g.drawChars(modulo, 5, 1, 243, 257);
        g.drawChars(modulo, 6, 1, 243, 227);
        g.drawChars(modulo, 7, 1, 243, 197);
        g.drawChars(modulo, 8, 1, 243, 167);
        g.drawChars(modulo, 9, 1, 243, 137);
        g.drawChars(modulo, 1, 1, 237, 107);
        g.drawChars(modulo, 0, 1, 243, 107);
        
        //quadrado
        
        g.setColor(Color.red);
        g.drawRect(277, 227, 178, 174);
        
    }
}
