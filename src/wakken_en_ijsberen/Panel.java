package wakken_en_ijsberen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel{
	/**
	 * Het paneel (Panel) is de opvulling voor het JFrame.
	 * in de vorige versie van dit programma had de code een andere vormgeving
	 * <i>Voorbeeld:</i>public 
	 * class voorbeerld
	 * {
	 * 		code
	 * }
	 * dit is veranderd naar 
	 * <i>Voorbeeld:</i>public 
	 * class voorbeerld{
	 * 		code
	 * } 				
	 * Mij is verteld door iemand die Bij bol.com werkt dat dit de gebruikte standaard is.			
	 */
	private static final long serialVersionUID = 1L;

	
	private JLabel 		gameTitle, 
						wak, beer, 	ping, dice_num, tips, wak_2, beer_2, ping_2, 
						tipLabel_1, tipLabel_2, throw_total_JL, tipLabel_3,	wrong_total_JL, tipLabel_4,	right_total_JL, tipLabel_5;
						
	
	private JButton		btn_newG, btn_check, btn_throw, btn_solve;
	
	
	private JTextField	wak_num, wak_num_2, beer_num, beer_num_2, ping_num, ping_num_2, dice_num_input, 
						throw_total_field, wrong_total_field, right_total_field;
	
	private Dice 		steen1, steen2, steen3, steen4, steen5, steen6, steen7, steen8, steen9, steen10, steen11, steen12;
	private int 		check_Wak, check_beer, check_ping, wrong_int, right_int;
	
	
	public Panel(){
		setBackground(new Color(120, 150, 170));
		setLayout(null);
		
		
		/**
		 * Maakt de stenen aan, voegt ze toe & zet de Locatie vast.
		 * hier word ook de start positie van ieder steen bepaald.
		 */
		steen1=new Dice();
        steen2=new Dice();
        steen3=new Dice();
        steen4=new Dice();
        steen5=new Dice();
        steen6=new Dice();
        steen7=new Dice();
        steen8=new Dice();
        steen9=new Dice();
        steen10=new Dice();
        steen11=new Dice();
        steen12=new Dice();
        
        steen1.setBounds(35, 75, 72, 72);
        steen2.setBounds(160, 75, 72, 72);
        steen3.setBounds(290, 75, 72, 72);
        steen4.setBounds(415, 75, 72, 72);
        steen5.setBounds(545, 75, 72, 72);
        steen6.setBounds(665, 75, 72, 72);
        steen7.setBounds(35, 185, 72, 72);
        steen8.setBounds(160, 185, 72, 72);
        steen9.setBounds(290, 185, 72, 72);
        steen10.setBounds(415, 185, 72, 72);
        steen11.setBounds(545, 185, 72, 72);
        steen12.setBounds(665, 185, 72, 72);
        
        add(steen1);
        add(steen2);
        add(steen3);
        add(steen4);
        add(steen5);
        add(steen6);
        add(steen7);
        add(steen8);
        add(steen9);
        add(steen10);
        add(steen11);
        add(steen12);
       
        
		/**
		 * Maakt aan en voegt toe alle elementen van de titelbalk.
		 */
		gameTitle = new JLabel("HET IJSBEREN SPEL!!!");
		gameTitle.setFont(new Font("Calibri", Font.BOLD, 24));
		gameTitle.setBounds(265, 17, 500, 30);
		add(gameTitle);
		
		btn_newG = new JButton("New Game");
		btn_newG.setBounds(630, 18, 120, 25);
		btn_newG.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_newG.addActionListener(new resetHandler() );
		add(btn_newG);
		
		
		/**
		 * Maakt aan en voegt toe alle elementen van de ribbon in het midden.
		 */
		wak = new JLabel("Wakken:");
		wak.setFont(new Font("Calibri", Font.PLAIN, 15));
		wak.setBounds(20, 297, 70, 20);
		add(wak);
		
		wak_num = new JTextField("0");
		wak_num.setBounds(78, 297, 25, 20);
		wak_num.setHorizontalAlignment(JTextField.CENTER);
		add(wak_num);
		
		beer = new JLabel("ijsberen:");
		beer.setFont(new Font("Calibri", Font.PLAIN, 15));
		beer.setBounds(110, 297, 70, 20);
		add(beer);
		
		beer_num = new JTextField("0");
		beer_num.setBounds(168, 297, 25, 20);
		beer_num.setHorizontalAlignment(JTextField.CENTER);
		add(beer_num);
		
		ping = new JLabel("Pinguins:");
		ping.setFont(new Font("Calibri", Font.PLAIN, 15));
		ping.setBounds(200, 297, 70, 20);
		add(ping);
		
		ping_num = new JTextField("0");
		ping_num.setHorizontalAlignment(JTextField.CENTER);
		ping_num.setBounds(258, 297, 25, 20);
		add(ping_num);
		
		btn_check = new JButton("Checken");
		btn_check.setBounds(310, 297, 120, 20);
		btn_check.addActionListener(new checkHandler() );
		add(btn_check);
		
		dice_num = new JLabel("Aantal Dobbelstenen:");
		dice_num.setFont(new Font("Calibri", Font.BOLD, 15));
		dice_num.setBounds(495, 297, 140, 20);
		
		add(dice_num);
		dice_num_input = new JTextField();
		dice_num_input.setHorizontalAlignment(JTextField.CENTER);
		dice_num_input.setBounds(635, 297, 25, 20);
		add(dice_num_input);
		
		btn_throw = new JButton("Gooien");
		btn_throw.setBounds(674, 290, 80, 30);
		btn_throw.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_throw.addActionListener(new throwHandler());
		add(btn_throw);	
		
		btn_solve = new JButton("Los hem op");
		btn_solve.setBounds(434, 345, 322, 30);
		btn_solve.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_solve.addActionListener(new solveHandler());
		add(btn_solve);
			
		wak_2 = new JLabel("Wakken:");
		wak_2.setBounds(425, 385, 60, 20);
		wak_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(wak_2);
		
		wak_num_2 = new JTextField("0");
		wak_num_2.setBounds(485, 385, 30, 20);
		wak_num_2.setHorizontalAlignment(JTextField.CENTER);
		wak_num_2.setEditable(false);
		add(wak_num_2);
		
		beer_2 = new JLabel("Ijsberen:");
		beer_2.setBounds(540, 385, 60, 20);
		beer_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(beer_2);
		
		beer_num_2 = new JTextField("0");
		beer_num_2.setBounds(600, 385, 30, 20);
		beer_num_2.setHorizontalAlignment(JTextField.CENTER);
		beer_num_2.setEditable(false);
		add(beer_num_2);
		
		ping_2 = new JLabel("Pinguins:");
		ping_2.setBounds(660, 385, 60, 20);
		ping_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(ping_2);
		
		ping_num_2 = new JTextField("0");
		ping_num_2.setBounds(725, 385, 30, 20);
		ping_num_2.setHorizontalAlignment(JTextField.CENTER);
		ping_num_2.setEditable(false);
		add(ping_num_2);
						
				
		/**
		 * Maakt aan en voegt toe alle elementen van het tips vak.
		 */
		tips = new JLabel("Tips:");
		tips.setBounds(190, 340, 30, 20);
		tips.setFont(new Font("Calibri", Font.BOLD, 15));
		add(tips);
		
		tipLabel_1 = new JLabel("");
		tipLabel_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		tipLabel_1.setBounds(30, 370, 330, 20);
		add(tipLabel_1);
		
		tipLabel_2 = new JLabel("");
		tipLabel_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		tipLabel_2.setBounds(30, 390, 370, 20);
		add(tipLabel_2);
		
		tipLabel_3 = new JLabel("");
		tipLabel_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		tipLabel_3.setBounds(30, 410, 370, 20);
		add(tipLabel_3);
		
		tipLabel_4 = new JLabel("");
		tipLabel_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		tipLabel_4.setBounds(30, 430, 370, 20);
		add(tipLabel_4);
		
		tipLabel_5 = new JLabel("");
		tipLabel_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		tipLabel_5.setBounds(30, 450, 370, 20);
		add(tipLabel_5);
		
		
		/**
		 * Maakt aan en voegt toe alle elementen van het antwoord en score vak.
		 */
		throw_total_JL = new JLabel("Aantal keer gegooid:");
		throw_total_JL.setBounds(450, 435, 130, 20);
		throw_total_JL.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(throw_total_JL);
		
		throw_total_field = new JTextField("0");
		throw_total_field.setBounds(690, 435, 40, 20);
		throw_total_field.setHorizontalAlignment(JTextField.CENTER);
		throw_total_field.setEditable(false);
		add(throw_total_field);
		
		wrong_total_JL = new JLabel("Aantal keer fout geraden:");
		wrong_total_JL.setBounds(450, 465, 180, 20);
		wrong_total_JL.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(wrong_total_JL);
		
		wrong_total_field = new JTextField("0");
		wrong_total_field.setBounds(690, 465, 40, 20);
		wrong_total_field.setHorizontalAlignment(JTextField.CENTER);
		wrong_total_field.setEditable(false);
		add(wrong_total_field);
		
		right_total_JL = new JLabel("Aantal keer goed geraden");
		right_total_JL.setBounds(450, 495, 180, 20);
		right_total_JL.setFont(new Font("Calibri", Font.PLAIN, 15));
		add(right_total_JL);
		
		right_total_field = new JTextField("0");
		right_total_field.setBounds(690, 495, 40, 20);
		right_total_field.setHorizontalAlignment(JTextField.CENTER);
		right_total_field.setEditable(false);
		add(right_total_field);	
	}
	
	
	
	/**
	 * Deze klasse zorgt ervoor dat als je op gooien klikt dat er ook wat gebeurt.
	 * De stenen (mochten er nog stenen liggen) worden gereset,
	 * daarna worden de <i><b>strings</b></i> uit de textvelden<b><i>throw_total_field & dice_num_input</i></b> gehaald en omgezet in <i>integers</i>.
	 * Vervolgens word er gekeken of er een legaal aantal dobbelstenen is ingevuld.
	 * Als dit niet het geval is dan krijg je een foutmelding, is dit wel het geval dan gaat de code verder en rolt de hoeveelheid stenen die zijn ingevuld.
	 * De <i><b>throw_int</b></i> word geplust, <i><b>dice_num_input</b></i> word gevuld met een lege <i><b>string</b></i> en <i><b>throw_total_field</b></i> word geupdate met het aantal worpen.\
	 *
	 */
	class throwHandler implements ActionListener{
		public void actionPerformed(ActionEvent arg0){	
			steen1.reset();
			steen2.reset();
			steen3.reset();
			steen4.reset();
			steen5.reset();
			steen6.reset();
			steen7.reset();
			steen8.reset();
			steen9.reset();
			steen10.reset();
			steen11.reset();
			steen12.reset();
			repaint();
					
			int throw_int = Integer.parseInt(throw_total_field.getText());
			int dice_int = Integer.parseInt(dice_num_input.getText());
			
			if(dice_int < 3 || dice_int > 12){
				tipLabel_1.setText("Minimaal aantal stenen is 3, maximaal is 12.");
				dice_num_input.setBackground(new Color(255, 57, 57));
				dice_num_input.setText("");
			}
			else{
				dice_num_input.setBackground(Color.WHITE);
				
				if (dice_int == 3){
					steen1.roll();	steen2.roll();
		            steen3.roll();
		        }
		        else if (dice_int == 4){
		        	steen1.roll();	steen2.roll();
		            steen3.roll();	steen4.roll();
		        }
		        else if (dice_int == 5){
		        	steen1.roll();	steen2.roll();
		            steen3.roll();	steen4.roll();
		            steen5.roll();
		        }
		        else if (dice_int == 6){
		        	steen1.roll();	steen2.roll();
		            steen3.roll();	steen4.roll();
		            steen5.roll();	steen6.roll();
		        }
		        else if (dice_int == 7){
		        	steen1.roll();	steen2.roll();
		            steen3.roll();	steen4.roll();
		            steen5.roll();	steen6.roll();
		            steen7.roll();
		        }
		        else if (dice_int == 8){
		            steen1.roll(); 	steen2.roll();
		            steen3.roll(); 	steen4.roll();
		            steen5.roll(); 	steen6.roll();
		            steen7.roll(); 	steen8.roll();
		        }
		        else if (dice_int == 9){
		        	steen1.roll(); 	steen2.roll();
		            steen3.roll(); 	steen4.roll();
		            steen5.roll(); 	steen6.roll();
		            steen7.roll(); 	steen8.roll();
		            steen9.roll();
		        }
		        else if (dice_int == 10){
		        	steen1.roll(); 	steen2.roll();
		            steen3.roll(); 	steen4.roll();
		            steen5.roll(); 	steen6.roll();
		            steen7.roll(); 	steen8.roll();
		            steen9.roll(); 	steen10.roll();
		        }
		        else if (dice_int == 11){
		        	steen1.roll();	steen2.roll();
		            steen3.roll(); 	steen4.roll();
		            steen5.roll(); 	steen6.roll();
		            steen7.roll(); 	steen8.roll();
		            steen9.roll(); 	steen10.roll();
		            steen11.roll();
		        }
		        else if (dice_int == 12){
		        	steen1.roll();	steen2.roll();
		            steen3.roll();	steen4.roll();
		            steen5.roll();	steen6.roll();
		            steen7.roll();	steen8.roll();
		            steen9.roll();	steen10.roll();
		            steen11.roll();	steen12.roll();
		        }
				
				dice_num_input.setText ("");   
				throw_int ++;
				throw_total_field.setText("" + throw_int);
			}
		}
		
	}
	
	
	
	/**
	 * In de <i><b>resetHandler</b></i> zorgt ervoor dat alle vakken weer op 0 komen en de dobbelsteen weer worden verwijderd.
	 * 
	 */
	class resetHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			wak_num.setText("0");
			beer_num.setText("0");	
			ping_num.setText("0");
			
			wak_num_2.setText("0");
			beer_num_2.setText("0");	
			ping_num_2.setText("0");	
			
			throw_total_field.setText("0");				
			wrong_total_field.setText("0");
			right_total_field.setText("0");
			
			tipLabel_1.setText("");
			tipLabel_2.setText("");
			tipLabel_3.setText("");
			tipLabel_4.setText("");
			tipLabel_5.setText("");
			wak_num.setBackground(Color.WHITE);
			beer_num.setBackground(Color.WHITE);
			ping_num.setBackground(Color.WHITE);
			dice_num_input.setBackground(Color.WHITE);
			
			steen1.reset();		steen2.reset();
			steen3.reset();		steen4.reset();
			steen5.reset();		steen6.reset();
			steen7.reset();		steen8.reset();
			steen9.reset();		steen10.reset();
			steen11.reset();	steen12.reset();
			repaint();
		}
		
	}
	
	
	
	/**
	 * In de <i><b>checkHandler</b></i> vergelijkt de user input met de antwoorden die geleverd worden door de <i><b>Dice()</b></i>.
	 * Bij een fout antwoord word de achtegrond van het tekstvak rood.
	 * Bij een goed antwoord word de achtergrond van het tekstvak groen.
	 * dit word gedaan voor de beren wakken en pinguins.
	 * zodra de drie antwoorden allemaal goed zijn word in een van de <i><b>tip labels</b></i> een bericht getoond en word <i><b>right_int</b></i> geplust en 
	 * geset in het juiste veld.
	 * zodra er een bepaald aantal keer fout geraden is worden er tips weer gegeven in het <i><b>Tip vak</b></i>.
	 * 
	 */
	class checkHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			int wakInt = Integer.parseInt(wak_num.getText());
			
			check_Wak = steen1.wak_sol() + steen2.wak_sol() + steen3.wak_sol() + steen4.wak_sol() + steen5.wak_sol() + steen6.wak_sol() 
						+ steen7.wak_sol() + steen8.wak_sol() + steen9.wak_sol() + steen10.wak_sol() + steen11.wak_sol() + steen12.wak_sol();
			if (check_Wak == wakInt){
				wak_num.setBackground(Color.GREEN);
			}
			else{
				wak_num.setBackground(new Color(255, 57, 57));
			}
			
			int beerInt = Integer.parseInt(beer_num.getText());
			check_beer = steen1.beer_sol() + steen2.beer_sol() + steen3.beer_sol() + steen4.beer_sol() + steen5.beer_sol() + steen6.beer_sol() + steen7.beer_sol() + steen8.beer_sol() + steen9.beer_sol() + steen10.beer_sol() + steen11.beer_sol() + steen12.beer_sol();
			if (check_beer == beerInt){
				beer_num.setBackground(Color.GREEN);
			}
			else{
				beer_num.setBackground(new Color(255, 57, 57));
			}
			
			int pingInt = Integer.parseInt(ping_num.getText());
			check_ping = steen1.ping_sol() + steen2.ping_sol() + steen3.ping_sol() + steen4.ping_sol() + steen5.ping_sol() + steen6.ping_sol() + steen7.ping_sol() + steen8.ping_sol() + steen9.ping_sol() + steen10.ping_sol() + steen11.ping_sol() + steen12.ping_sol();
			if (check_ping == pingInt){
				ping_num.setBackground(Color.GREEN);
			}
			else{
				ping_num.setBackground(new Color(255, 57, 57));
			}
			
			if(check_ping == pingInt && check_beer == beerInt && check_Wak == wakInt){
				wrong_int = 0;
				tipLabel_1.setText("Je hebt het goed, je hebt gewonnen!");
				tipLabel_2.setText("");
				tipLabel_3.setText("");
				tipLabel_4.setText("");
				tipLabel_5.setText("");
				right_int += 1;
				right_total_field.setText("" + right_int);
			}
			else if(check_ping != pingInt || check_beer != beerInt || check_Wak != wakInt){
				wrong_int += 1;
				wrong_total_field.setText("" + wrong_int);
			}
									
			if(wrong_int == 1){
				tipLabel_1.setText("Sorry maar dat is fout.");
			}
			else if(wrong_int == 3){
				tipLabel_2.setText("Een wak is het middelste oog van een dobbelsteen.");
			}
			else if(wrong_int == 6){
				tipLabel_3.setText("Beren zijn de ogen om een wak. Alleen om een wak zitten beren.");
			}
			else if(wrong_int == 9){
				tipLabel_4.setText("De pinguins zijn de ogen aan de achterkant van de dobbelsteen.");
			}
			else if(wrong_int == 12){
				tipLabel_5.setText("Geen wak is geen ijsberen en pinguins.");
			}
		}
	}
	
	
	
	/**
	 * Zodra er op de oplosknop gedrukt word worden de juiste aantwoorden uit <i><b>Dice()</b></i> gehaald en in de betreffende tekstvakken gezet.
	 *
	 */
	class solveHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			check_Wak = steen1.wak_sol() + steen2.wak_sol() + steen3.wak_sol() + steen4.wak_sol() + steen5.wak_sol() + steen6.wak_sol() + steen7.wak_sol() + steen8.wak_sol() + steen9.wak_sol() + steen10.wak_sol() + steen11.wak_sol() + steen12.wak_sol();
			wak_num_2.setText("" + check_Wak);
			
			check_beer = steen1.beer_sol() + steen2.beer_sol() + steen3.beer_sol() + steen4.beer_sol() + steen5.beer_sol() + steen6.beer_sol() + steen7.beer_sol() + steen8.beer_sol() + steen9.beer_sol() + steen10.beer_sol() + steen11.beer_sol() + steen12.beer_sol();
			beer_num_2.setText("" + check_beer);
			
			check_ping = steen1.ping_sol() + steen2.ping_sol() + steen3.ping_sol() + steen4.ping_sol() + steen5.ping_sol() + steen6.ping_sol() + steen7.ping_sol() + steen8.ping_sol() + steen9.ping_sol() + steen10.ping_sol() + steen11.ping_sol() + steen12.ping_sol();
			ping_num_2.setText("" + check_ping);
		}
		
	}
		
	
	/**
	 * Hier word de layout van het spel gemaakt.
	 */
	public void paintComponent(Graphics a){
		super.paintComponent(a);
		a.setColor(new Color(80, 230, 250));
		
			/**
			 * TOP BLUE BAR (WITH TITLE)
			 */
		a.fillRoundRect(10, 10, 764, 40, 20, 20);
		a.fillRect(10, 15, 764, 35);
		
		/**
		 * CENTER ELEMENT WHERE THE DICE ARE SHOWN
		 */
		a.setColor(new Color(80, 230, 250, 190));
		a.fillRect(10, 55, 764, 220);
		a.setColor(new Color(130, 130, 155));
		
		/**
		 * DICE GRID OVERLAY
		 */
		a.drawLine(20, 165, 760, 165);
		a.drawLine(126, 60, 126, 270);
		a.drawLine(256, 60, 256, 270);
		a.drawLine(384, 60, 384, 270);
		a.drawLine(512, 60, 512, 270);
		a.drawLine(640, 60, 640, 270);
		
		/**
		 * CENTER ELEMENT WITH THE THROW AND CHECK BUTTONS
		 */
		a.setColor(new Color(80, 230, 250));
		a.setColor(new Color(80, 230, 250));
		a.fillRect(10, 280, 764, 50);
		
		/**
		 * LOWER LEFT ELEMENT WITH TIPS
		 */
		a.fillRoundRect(10, 335, 400, 220, 20, 20);
		a.fillRect(10, 335, 400, 200);
		a.fillRect(20, 335, 390, 220);
		a.setColor(new Color(30, 30, 55));
		a.drawLine(30, 360, 385, 360);
		
		/**
		 * LOWER RIGHT ELEMENT
		 */
		a.setColor(new Color(80, 230, 250));
		a.fillRoundRect(415, 335, 359, 220, 20, 20);
		a.fillRect(415, 335, 359, 200);
		a.fillRect(415, 335, 350, 220);
		a.setColor(new Color(30, 30, 55));
		a.drawLine(430, 420, 750, 420);
	}
}




