package Sistema_Solar;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class QuizProgram extends JFrame implements ActionListener{
            JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            HashMap<Integer, String> map;

            QuizProgram(){
                     initializedata();
                     setTitle("Perguntas e Respostas");
                     setDefaultCloseOperation(EXIT_ON_CLOSE);
                     setSize(430,350);
                     setLocation(300,100);
                     setResizable(false);
                     Container cont=getContentPane();
                     cont.setLayout(null);                                
                     cont.setBackground(Color.GRAY);
                     bg=new ButtonGroup();     
                     choice1=new JRadioButton("Choice1",true);
                     choice2=new JRadioButton("Choice2",false);
                     choice3=new JRadioButton("Choice3",false);
                     choice4=new JRadioButton("Choice4",false);
                     bg.add(choice1);                    
                     bg.add(choice2);
                     bg.add(choice3);
                     bg.add(choice4);                    
                     lblmess=new JLabel("Escolha a resposta correta");                    
                     lblmess.setForeground(Color.BLUE);
                     lblmess.setFont(new Font("Arial", Font.BOLD, 11));
                     btnext=new JButton("Próximo");    
                     btnext.setForeground(Color.GREEN);                              
                     btnext.addActionListener(this);
                     btnext.setEnabled(true);
                     panel=new JPanel();
                     panel.setBackground(Color.LIGHT_GRAY);
                     panel.setLocation(10,10);
                     panel.setSize(400,300);
                     panel.setLayout(new GridLayout(6,2));
                     panel.add(lblmess);
                     panel.add(choice1);
                     panel.add(choice2);
                     panel.add(choice3);
                     panel.add(choice4);
                     panel.add(btnext);
                     cont.add(panel);
                     setVisible(true);
                     qaid=0;
                     readqa(qaid);
           
            	}
            	public void moveNext(){
            		if(qaid<9){
                        
                        map.put(qaid,getSelection());
                        qaid++;
                        readqa(qaid);
                        }
            		else {
                        map.put(qaid,getSelection());
                        //btnext.setText("Show answers");
                        new Report();
                       
                     }
            	}
                   public void actionPerformed(ActionEvent e){
           
                        if(btnext.getText().equals("Próximo")){
                                    moveNext();
                                    }
                        else if(btnext.getText().equals("Show answers")){
                                    new Report();
                        }
                       
            }
           

           
        public void initializedata(){
                        //qpa stores pairs of question and its possible answers
                        qpa=new String[10][5];

                        qpa[0][0]="1)Quais são os quatro planetas mas proximo ao sol?";
                        qpa[0][1]="a-Mercúrio,Vênus,Terra e Marte";
                        qpa[0][2]="b-Júpiter,Terra,Urano e Vênus";
                        qpa[0][3]="c-Terra,Marte,Saturno e Mercurio";
                        qpa[0][4]="Nenhuma das opções";

                        qpa[1][0]="2)Quais são os quatro gigantes gasosos?";
                        qpa[1][1]="a-Mercúrio,Marte,Terra e Plutão";
                        qpa[1][2]="b-Júpiter,Saturno,Urano e Neturno";
                        qpa[1][3]="c-Saturno,Neturno,Terra e Marte.";
                        qpa[1][4]="Nenhuma das opções.";
                       
                        qpa[2][0]="3)O sistema solar de acordo com a teoria de hoje mais aceita,\n" +
"a partir de que esse sistema teve origem?";
                        qpa[2][1]="a-nuvem gasosa";
                        qpa[2][2]="b-nuvem molecular";
                        qpa[2][3]="c-nuvem naturais";
                        qpa[2][4]="Nenhuma das opções.";

                        qpa[3][0]="4)Quantos dias leva para o planeta Mercúrio completar seu periodo de translação?";
                        qpa[3][1]="a-dois dias";
                        qpa[3][2]="b-quarenta e dois dias";
                        qpa[3][3]="c-oitenta e oito dias";
                        qpa[3][4]="Nenhuma das opções";

                        qpa[4][0]="5)A atmosfera venusiana e composta primariamente do quê?";
                        qpa[4][1]="a-dróxido de carbono e vapores de ácido sulfúrico";
                        qpa[4][2]="b-gás carbono e vapores";
                        qpa[4][3]="c-h2o e hidrogênio";
                        qpa[4][4]="Nenhuma das opções";

                        qpa[5][0]="6)Qual e o maior planeta telúrico?";
                        qpa[5][1]="a-Vênus";
                        qpa[5][2]="b-Terra";
                        qpa[5][3]="c-Marte";
                        qpa[5][4]="Nenhuma das opções";

                        qpa[6][0]="7)Como e constituido o núcleo da terra?";
                        qpa[6][1]="a-rocha";
                        qpa[6][2]="b-água";
                        qpa[6][3]="c-ferro";
                        qpa[6][4]="Nenhuma das opções";

                        qpa[7][0]="8)Qual o maior planeta do sistema solar?";
                        qpa[7][1]="a-Saturno";
                        qpa[7][2]="b-Júpiter";
                        qpa[7][3]="c-Urano";
                        qpa[7][4]="Nenhuma das opções";

                        qpa[8][0]="9)Como e denominado a galáxia espiral?";
                        qpa[8][1]="a-via láctea";
                        qpa[8][2]="b-via sagitario";
                        qpa[8][3]="c-via estelares";
                        qpa[8][4]="Nenhuma das opções";

                        qpa[9][0]="10)Quantos planetas e composto o sistema solar?";
                        qpa[9][1]="a-sete";
                        qpa[9][2]="b-cinco";
                        qpa[9][3]="c-oito";
                        qpa[9][4]="Nenhuma das opções";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="Quais são os quatro planetas mas proximo ao sol?";
                        qca[0][1]="a-Mercúrio,Vênus,Terra e Marte";

                        qca[1][0]="Quais são os quatro gigantes gasosos?";
                        qca[1][1]="b-Júpiter,Saturno,Urano e Neturno.";

                        qca[2][0]="O sistema solar de acordo com a teoria de hoje mais aceita,\n" +
"a partir de que esse sistema teve origem?";
                        qca[2][1]="b-nuvem molecular";

                        qca[3][0]="Quantos dias leva para o planeta Mercúrio completar seu periodo de translação?";
                        qca[3][1]="c-oitenta e oito dias";


                        qca[4][0]="A atmosfera venusiana e composta primariamente do quê?";
                        qca[4][1]="a-dróxido de carbono e vapores de ácido sulfúrico";

                        qca[5][0]="Qual e o maior planeta telúrico?";
                        qca[5][1]="b-Terra";

                        qca[6][0]="Como e constituido o núcleo da terra?";
                        qca[6][1]="c-ferro";
                       
                        qca[7][0]="Qual o maior planeta do sistema solar?";
                        qca[7][1]="b-Júpiter";
                       
                        qca[8][0]="Como e denominado a galáxia espiral?";
                        qca[8][1]="a-via láctea";

                        qca[9][0]="Quantos planetas e composto o sistema solar?";
                        qca[9][1]="c-oito";
                       
                       
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                       
                        }
       public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements(); 
                        while(buttons.hasMoreElements()) 
                        { 
                        JRadioButton temp=(JRadioButton)buttons.nextElement(); 
                        if(temp.isSelected()) 
                                    { 
                                                selectedChoice=temp.getText();
                                    } 
                         }  
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true);
                        //delay the next screen 5 seconds
                        try{
                        Thread.sleep(20000);
                        moveNext();
                        }catch(InterruptedException ie){}
                        
                   
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Próximo");
                        }
        public int calCorrectAnswer(){
                        int qnum=10;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }
       public class Report extends JFrame{
                        Report(){
                                    setTitle("Questionário");
                                    setSize(850,550);
                                    setBackground(Color.WHITE);
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        //reset();
                                                            }
                                                });
                                    Draw d=new Draw();                                  
                                    add(d);
                                    setVisible(true);
                                    }
                       
                       
                    class Draw extends Canvas{
                                    public void paint(Graphics g){
                                                int qnum=10;
                                                int x=10;
                                                int y=20;
                                                for(int i=0;i<qnum;i++){
                                                            //print the 1st column
                                                            g.setFont(new Font("Arial",Font.BOLD,12));                                         
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=30;           
                                                            g.setFont(new Font("Arial",Font.PLAIN,12));                             
                                                            g.drawString("      Resposta Correta:"+qca[i][1], x,y);
                                                            y+=30;
                                                            g.drawString("      Você Respondeu:"+map.get(i), x,y);
                                                            y+=30;
                                                            //print the 2nd column
                                                            if(y>400)
                                                            {y=20;
                                                              x=450;
                                                            }
                                                           
                                                }
                                                //Show number of correct answers
                                                int numc=calCorrectAnswer();
                                                g.setColor(Color.BLUE);
                                                g.setFont(new Font("Arial",Font.BOLD,14));
                                                g.drawString("Numero de respostas corretas:"+numc,300,500);
                       
                                               
                                    }
                        }
                                   
            }                  


}
