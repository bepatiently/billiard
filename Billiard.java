import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Billiard  extends JFrame { 
	JPanel p;
	JLabel l;
	JButton b1;
	JButton b2;
	FlowLayout fl;
	
	public Billiard() {
	    p = new JPanel();
		add(p); 
		// p.setBackground(Color.GREEN);
		
		p.setLayout(new GridLayout(3,2,200,100));

		
		l = new JLabel("Welcome to the Billiards game");
		l.setBackground(Color.WHITE);
		
		b1 = new JButton("Start");
		b2 = new JButton("Exit");
		
		
		p.add(l);
		p.add(b1);
		p.add(b2);
		
		// when we press Start
		b1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == b1 ) {
						JFrame f = new JFrame("Mode");
		 			f.setSize(500,500);
					f.setVisible(true);
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JPanel p = new JPanel(); 
					p.setBackground(Color.green);
					f.add(p);
					JButton b3 = new JButton("One player");
					b3.setSize(150,100); 
					p.add(b3);
						
					JButton b4 = new JButton("Tow players");
					b4.setSize(150,100);
					p.add(b4); 
					
					
					b3.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == b3 ) {
							
								BilliardsPanel objct = new BilliardsPanel();
								objct.setSize(200, 200);
								objct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								objct.setVisible(true);
							
					        
							}
						}	
				}
							);	 // action listener 3
					
					b4.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == b4 ) {
								
								BilliardsPanel objct2 = new BilliardsPanel();
								objct2.setSize(200, 200);
								objct2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								objct2.setVisible(true);
							
							}
						}	
				}
							);	 // action listener 4
				
				
					}
				}	
		}
					);	 // action listener 1
		
		//when we press Exit
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2 ) {
					System.exit(0);
				}
			}
		} 
		); // action listener 2
			
		
		
		
		
	}
} 
