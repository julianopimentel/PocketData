package Exemplos.S08_AcessoIO;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TecladoGame extends JFrame implements KeyListener{

    BufferedImage backBuffer;	
    int FPS = 30;
    int janelaW = 500;
    int janelaH = 500;

    //AQUI DECLARAMOS O NOSSO MENU COM:
    //4 itens, coordenadas x e y = 100, a ativo = true
    //agora olhe esse método abaixo cenarios()
    Teclado menuPrincipal = new Teclado(4, 100, 100, true);
	
    //esse método vai desenhar na tela alguns possíveis cenários do nosso game
    //lá em Menu.java cenario foi definido como -1
    //se cenario == 0 muda a cor do fundo e mostra um texto
    //se cenario == 1 muda a cor do fundo e mostra um texto
    //se cenario == n muda a cor do fundo e mostra um texto...
	
    //agora obser o nosso método desenharGraficos()
    public void cenarios(){
	
        Graphics bbg = backBuffer.getGraphics();
        bbg.setFont(new Font("Arial",Font.BOLD,20));
            
        if(menuPrincipal.cenario == 0){
            bbg.setColor(new Color(255,100,100));
            bbg.fillRect(0, 0, janelaW, janelaH);
            bbg.setColor(Color.BLACK);
            bbg.drawString("Você escolheu Jogar", 100, 200);
            //aqui você pode escolher o que irá aparecer caso o usuario escolha essa item do menu!
        }
	
        if(menuPrincipal.cenario == 1){
            bbg.setColor(new Color(100,255,100));
            bbg.fillRect(0, 0, janelaW, janelaH);
            bbg.setColor(Color.BLACK);
            bbg.drawString("Você escolheu Opções", 100, 200);
        }
	
        if(menuPrincipal.cenario == 2){
            bbg.setColor(new Color(100,100,255));
            bbg.fillRect(0, 0, janelaW, janelaH);
            bbg.setColor(Color.BLACK);
            bbg.drawString("Desenvolvido por Juliano P", 100, 200);
        }
	
        if(menuPrincipal.cenario == 3){
            System.exit(0);//esse comando fecha o nosso game!
        }
    }
	
	public void atualizar() {

	}

    public void desenharGraficos() {
        
        Graphics g = getGraphics();	//ISSO JÁ ESTAVA AQUI
        Graphics bbg = backBuffer.getGraphics();//ISSO TAMBÉM JÁ ESTAVA AQUI...
        bbg.setColor(Color.WHITE);
        bbg.fillRect(0, 0, janelaW, janelaH);	//PINTA O FUNDO COM UM QUADRADO BRANCO
		
        menuPrincipal.desenharMenu();//isso desenhará nosso menu
        cenarios(); //isso irá desenhar os cenários que escolhermos no menu
                    //agora observe o método inicializar()
		
        //==================================================================================	
        g.drawImage(backBuffer, 0, 0, this);//OBS: ISSO DEVE FICAR SEMPRE NO FINAL!
    }

    public void inicializar() {
        setTitle("Titulo do Jogo!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
		
        //AQUI ESTAMOS ADICIONANDO UM ESCUTADOR DE TECLAS
        addKeyListener(this);
		
        //aqui definimos o texto de cada item do nosso menu
        menuPrincipal.itens[0] = "Jogar";
        menuPrincipal.itens[1] = "Opções";
        menuPrincipal.itens[2] = "Ajuda";
        menuPrincipal.itens[3] = "Sair";
        //aqui fazemos o método desenhaMenu() que fica lá em Menu.java
        //desenhar no nosso buffer
        //.. agora para finalizar observe o método de evento keyPressed() mais abaixo...
        menuPrincipal.bbg = backBuffer.getGraphics();
    }

    public void run() {
        
        inicializar();
        
        while (true) {
            
            atualizar();
            desenharGraficos();
	
            try {
                Thread.sleep(1000/FPS);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        //aqui, chamamos os métodos que irá controlar o menu pelo teclado
        menuPrincipal.controlar(e);//esse controla o menu
        menuPrincipal.voltarAoMenu(e);//esse faz voltar para o menu quando pressionarmos "Esc"
    }
	
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
        
    public static void main(String[] args) {
        TecladoGame game = new TecladoGame();
        game.run();
    }

}