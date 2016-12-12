package wakken_en_ijsberen;
import javax.swing.*;


public class Start extends JFrame{
	/**
	 * Dit is de opstart klasse, hier in word gedefinieerd hoe groot het JFrame(het gedeelte wat je ziet als je de applicatie opstart.	
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		JFrame window = new JFrame();
		window.setTitle("Wakken, Ijsberen & Pinguins");
		window.setSize(800, 600);
		window.setLocation(270, 60);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new Panel() );
		window.setVisible(true);
	}
}

