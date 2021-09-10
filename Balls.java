import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class Balls extends JPanel implements ActionListener,MouseListener {
	
	double sz=40;
	double Vx=2,Vy=2;
	double Vx2=10,Vy2=10;
	double V=10;
	double Vx3 = 15 , Vy3 = 15;
	
	Ellipse2D.Double ball = new Ellipse2D.Double(200,200,sz,sz);
	Ellipse2D.Double ball2 = new Ellipse2D.Double(100,100,sz,sz);
	Ellipse2D.Double ball3 = new Ellipse2D.Double(300,300,sz,sz);
	
	Timer t = new Timer(15,this); 
	
	Balls(){
		addMouseListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		updateBallPosition();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fill(ball);
		g2d.setColor(Color.RED);
		g2d.fill(ball2);
		g2d.setColor(Color.white);
		g2d.fill(ball3);
		g2d.setColor(Color.blue);
	}
	public void updateBallPosition() {
		ball.x+=Vx;
		ball.y+=Vy;
		

		ball2.x+=Vx2;
		ball2.y+=Vy2;
		
		ball3.x+=Vx3;
		ball3.y+=Vy3;
		
		if(ball.x<0 || ball.x>getWidth()-sz) Vx=-Vx;
		if(ball.y<0 || ball.y>getHeight()-sz) Vy=-Vy;
		
		if(ball2.x<0 || ball2.x>getWidth()-sz) Vx2=-Vx2;
		if(ball2.y<0 || ball2.y>getHeight()-sz) Vy2=-Vy2;
		
		
		if(ball3.x<0 || ball3.x>getWidth()-sz) Vx3=-Vx3;
		if(ball3.y<0 || ball3.y>getHeight()-sz) Vy3=-Vy3;
		
		//Vx = Vx*0.99;
		//Vy = Vy*0.99;
		double dx = ball3.x - ball2.x - ball.x;
		double dy = ball3.y - ball2.y - ball.y;
		
		double Umag = Math.hypot(dx, dy);
		
		if(Umag <= ball.width)
		{
			
			double VrMag = (Vx*dx + Vy*dy )/ Umag;
			double Vrx = VrMag * dx / Umag;
			double Vry = VrMag * dy / Umag;
			
			double Vtx = Vx - Vrx;
			double Vty = Vy - Vry;
			
			
			Vx = Vtx;
			Vy = Vty;
			Vx2 = Vrx;
			Vy2 = Vry;
			
			//Vx=0;Vy=0;
		}
		
		
		//if(Vx*Vx + Vy*Vy < 1 )
		//t.stop();
		repaint();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(!t.isRunning()) {
			double x1 = e.getX();
			double y1 = e.getY();
			double x2 = ball.x + ball.width/2;
			double y2 = ball.y + ball.height/2;
			double x3 = ball.x + ball.width/2;
			double y3 = ball.y + ball.width/2;	
			double dx =x3-x2-x1;
			double dy =y3-y2-y1;
			Vx = V*dx/Math.sqrt(dx*dx+dy*dy);
			Vy = V*dy/Math.sqrt(dx*dx+dy*dy);
			Vx = -2;
			Vy = -2;
			t.start();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}