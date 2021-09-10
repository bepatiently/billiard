import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import javax.swing.*;

public class BilliardsPanel extends JFrame implements KeyListener {
	JPanel panel ;
	/*static int Yellowx = 10 ;
	static int Yellowy;
	static int Bluex = 50 ;
	static int Bluey;
	static int Whitex = 100 ;
	static int Whitey;
*/
  public BilliardsPanel (){
    	 
    	 panel = new Balls();
    	 panel.setVisible(true);
    	 panel.setBackground(Color.GREEN);
    	 add(panel);
    	JLabel l2 = new JLabel("time:"); 
    	l2.setBounds(0, 0, 15,15);
    	l2.setVisible(true);
    	 
    	 addKeyListener( this);
    	 
    	/* Yellowx = 10 ;
    	 Bluex = 50 ;
         Whitex = 100 ;*/
     }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
}
