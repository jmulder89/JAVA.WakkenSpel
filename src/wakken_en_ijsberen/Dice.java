package wakken_en_ijsberen;
import java.awt.*;
import javax.swing.*;


public class Dice extends JPanel{
    /**
	 * Deze klasse verzorgd de Locatie, vorm en random kant van de dobbelsteen.
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int side, wakken, beren, pinguins;
 
	
	/**
	 * Hier word de positie en de maat van de dobbelsteen en ook de ogen bepaald.
	 * De start Positie van de stenen word bepaald in <i><b>Panel.java</b></i>
	 * vandaar dat de start positie op nul staat.
	 * ook word aan de hand van de getallen 1 tot en met 6 de gezichten van de dobbelsteen bepaald.
	 * 
	 */
	public void paintComponent(Graphics q){
		if(side != 0){
			q.setColor( Color.WHITE );
	    	q.fillRoundRect(0, 0, 70, 70, 20, 20);
	    	q.setColor( Color.BLACK );
	    	q.drawRoundRect(0, 0, 70, 70, 20, 20);
		}
    	if (side == 1){
			q.fillOval(30, 30, 10, 10);
		}
		else if (side == 2){
			q.fillOval(15, 15, 10, 10);
			q.fillOval(45, 45, 10, 10);
		}
		else if (side == 3){
			q.fillOval(15, 15, 10, 10);
			q.fillOval(30, 30, 10, 10);
			q.fillOval(45, 45, 10, 10);
		}
		else if (side == 4){
			q.fillOval(15, 15, 10, 10);
			q.fillOval(45, 15, 10, 10);
			q.fillOval(15, 45, 10, 10);
			q.fillOval(45, 45, 10, 10);
		}
		else if (side == 5){
			q.fillOval(15, 15, 10, 10);
			q.fillOval(45, 15, 10, 10);
			q.fillOval(15, 45, 10, 10);
			q.fillOval(45, 45, 10, 10);
			q.fillOval(30, 30, 10, 10);
		}
		else if (side == 6){
			q.fillOval(15, 15, 10, 10);
			q.fillOval(45, 15, 10, 10);
			q.fillOval(15, 45, 10, 10);
			q.fillOval(45, 45, 10, 10);
			q.fillOval(15, 30, 10, 10);
			q.fillOval(45, 30, 10, 10);
		}
	}
 
	
	/**
	 * @return
	 * De <i><b>roll()</b></i> kiest willekeurig een getal tussen de 1 en de 6, 
	 * deze getallen zijn weer gelinkt aan de verschillende gezichten van de dobbelsteen.
	 * In de willekeurig <i><b>paintComponent</b></i> hierboven.
	 * 
	 */
    public int roll(){
        side = (int) (6 * Math.random() + 1);
        return side;
    }

    
    /**
     * @return
     * <i><b>wak_sol()</b></i> geeft voor iedere uitkomst het aantal wakken.
     * en stopt deze in de <i><b>Integer</b></i> wakken.  
     * 
     */
    public int wak_sol(){
    	if(side == 1 || side == 3 || side == 5){
    		wakken = 1;
    	}
    	else{
    		wakken = 0;
    	}
		return wakken;
    }

    
    /*
     * <i><b>beer_sol()</b></i> geeft voor iedere uitkomst het aantal beren
     * en stopt deze in de <i><b>Integer</b></i> beren.
     * 
     */
    public int beer_sol(){
    	if(side == 3)
    	{
    		beren = 2;
    	}
    	else if(side == 5){
    		beren = 4;
    	}
    	else{
    		beren = 0;
    	}
    	return beren;
    }
 
    
    /**
     * @return
     * <i><b>ping_sol()</b></i> geeft voor iedere uitkomst het aantal pinguins.
     * en stopt deze in de <i><b>Integer</b></i> pinguins.
     * 
     */
    public int ping_sol(){ 
    	if(side == 1){
    		pinguins = 6;
    	}
    	else if(side == 3){
    		pinguins = 4;
    	}
    	else if(side == 5){
    		pinguins = 2;
    	}
    	else{
    		pinguins = 0;
    	}
    	return pinguins;
    }
    
    
    /**
     * reset de <i><b>Integer</b></i> side naar 0 zodat er opnieuw gegooid kan worden.
     * 
     */
    public void reset(){
    	side = 0;
    }
}