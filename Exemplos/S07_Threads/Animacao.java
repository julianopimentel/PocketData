package Exemplos.S07_Threads;

import javax.swing.ImageIcon;

public class Animacao {
	
	ImageIcon cenas[];	
	int x,y,largura,altura;
        int cena=0;
        int controlaVelocidade=0, velocidade5=5, velocidade50=50;					
	
	public Animacao(int numeroDeCenas, int x, int y){ // cena=3, x=200, y=300
            
            cenas = new ImageIcon[numeroDeCenas];
            this.x = x;
            this.y = y;
	}
	
	public void animar(){ // 1/30 milissegundos (30x por segundo)            
            cena += 1;            
            if(cena == cenas.length){ 
                cena = 0; 
            }
	}
	
	public void animarMaisLento5() { // 30x por segundo / 5            
            controlaVelocidade+=1;            
            if(controlaVelocidade > velocidade5){
                cena += 1;
                controlaVelocidade = 0;
                if(cena == cenas.length){ 
                    cena = 0; 
                }
            }
	}
        
        public void animarMaisLento50() { // 30x por segundo / 5            
            controlaVelocidade+=1;            
            if(controlaVelocidade > velocidade50){
                cena += 1;
                controlaVelocidade = 0;
                if(cena == cenas.length){ 
                    cena = 0; 
                }
            }
	}
        
}
