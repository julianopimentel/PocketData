/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_solar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Juliano P
 */
public class quiznovo extends JFrame implements ActionListener{
	String [][] perguntas = new String[3][6];
	JRadioButton [] jrPerguntas = new JRadioButton[4];
	JLabel jlPergunta = new JLabel("");
	JLabel jlPontuacao = new JLabel("Pontuação: 0");
	int posAtual = 0;
	int pontos = 0;
	JButton jbResponder = new JButton("Responder");
	ButtonGroup bgOp = new ButtonGroup();
	public quiznovo() {
		super("Perguntas e Respostas");
		setLayout(new GridLayout(7,1));
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		carregaPerguntas();
		for (int id=0;id<4;id++){
			jrPerguntas[id] = new JRadioButton();
			bgOp.add(jrPerguntas[id]);
		}
		montaTela();
		jlPontuacao.setHorizontalAlignment(JTextField.RIGHT);
		add(jlPergunta);
		add(jrPerguntas[0]);
		add(jrPerguntas[1]);
		add(jrPerguntas[2]);
		add(jrPerguntas[3]);
		add(jlPontuacao);
		add(jbResponder);
		jbResponder.addActionListener(this);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
                setLocation(300,100);
                setSize(700,350);
	}
	public void carregaPerguntas(){
            
                perguntas =new String[10][6];
                
                        perguntas[0][0]="1)Quais são os quatro planetas mas proximo ao sol?";
                        perguntas[0][1]="a-Mercúrio,Vênus,Terra e Marte";
                        perguntas[0][2]="b-Júpiter,Terra,Urano e Vênus";
                        perguntas[0][3]="c-Terra,Marte,Saturno e Mercurio";
                        perguntas[0][4]="Nenhuma das opções";
                        perguntas[0][5] = "1";

                        perguntas[1][0]="2)Quais são os quatro gigantes gasosos?";
                        perguntas[1][1]="a-Mercúrio,Marte,Terra e Plutão";
                        perguntas[1][2]="b-Júpiter,Saturno,Urano e Neturno";
                        perguntas[1][3]="c-Saturno,Neturno,Terra e Marte.";
                        perguntas[1][4]="Nenhuma das opções.";
                        perguntas[1][5] = "2";
                       
                        perguntas[2][0]="3)O sistema solar de acordo com a teoria de hoje mais aceita,\n" +
"a partir de que esse sistema teve origem?";
                        perguntas[2][1]="a-nuvem gasosa";
                        perguntas[2][2]="b-nuvem molecular";
                        perguntas[2][3]="c-nuvem naturais";
                        perguntas[2][4]="Nenhuma das opções.";
                        perguntas[2][5] = "2";

                        perguntas[3][0]="4)Quantos dias leva para o planeta Mercúrio completar seu periodo de translação?";
                        perguntas[3][1]="a-dois dias";
                        perguntas[3][2]="b-quarenta e dois dias";
                        perguntas[3][3]="c-oitenta e oito dias";
                        perguntas[3][4]="Nenhuma das opções";
                        perguntas[3][5] = "3";

                        perguntas[4][0]="5)A atmosfera venusiana e composta primariamente do quê?";
                        perguntas[4][1]="a-dróxido de carbono e vapores de ácido sulfúrico";
                        perguntas[4][2]="b-gás carbono e vapores";
                        perguntas[4][3]="c-h2o e hidrogênio";
                        perguntas[4][4]="Nenhuma das opções";
                        perguntas[4][5] = "1";

                        perguntas[5][0]="6)Qual e o maior planeta telúrico?";
                        perguntas[5][1]="a-Vênus";
                        perguntas[5][2]="b-Terra";
                        perguntas[5][3]="c-Marte";
                        perguntas[5][4]="Nenhuma das opções";
                        perguntas[5][5] = "2";

                        perguntas[6][0]="7)Como e constituido o núcleo da terra?";
                        perguntas[6][1]="a-rocha";
                        perguntas[6][2]="b-água";
                        perguntas[6][3]="c-ferro";
                        perguntas[6][4]="Nenhuma das opções";
                        perguntas[6][5] = "3";

                        perguntas[7][0]="8)Qual o maior planeta do sistema solar?";
                        perguntas[7][1]="a-Saturno";
                        perguntas[7][2]="b-Júpiter";
                        perguntas[7][3]="c-Urano";
                        perguntas[7][4]="Nenhuma das opções";
                        perguntas[7][5] = "2";

                        perguntas[8][0]="9)Como e denominado a galáxia espiral?";
                        perguntas[8][1]="a-via láctea";
                        perguntas[8][2]="b-via sagitario";
                        perguntas[8][3]="c-via estelares";
                        perguntas[8][4]="Nenhuma das opções";
                        perguntas[8][5] = "1";
                        
                        perguntas[9][0]="10)Quantos planetas e composto o sistema solar?";
                        perguntas[9][1]="a-sete";
                        perguntas[9][2]="b-cinco";
                        perguntas[9][3]="c-oito";
                        perguntas[9][4]="Nenhuma das opções";
                        perguntas[9][5] = "3";
	}
	public void montaTela() {
		jlPergunta.setText(perguntas[posAtual][0]);
		for (int id=0;id<4;id++){
			jrPerguntas[id].setText(perguntas[posAtual][id+1]);
		}
	}
	public static void main(String [] args){
		new quiznovo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int respostaCerta = Integer.parseInt(perguntas[posAtual][5]);
		
		if (jrPerguntas[respostaCerta-1].isSelected()){
			pontos++;
		}else{
                    JOptionPane.showMessageDialog(this,"Você errou! :/");
		}
                
		jlPontuacao.setText("Pontuação: " + pontos);
		if (posAtual<9)
			posAtual++;
		else
			JOptionPane.showMessageDialog(this,"Você acertou " + pontos+".");
		montaTela();
		
		
	}

}
