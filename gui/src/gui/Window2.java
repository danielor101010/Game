package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Window2 extends JFrame implements KeyListener, ActionListener {

	

	private int ballX = 400; //start ball location
	private int ballY = 560;
	private int score = 0;
	private boolean play = false;
	private Timer timer;
	private int delay = 16;
	private int ballXDir = -3;// ball x direction
	private int ballYDir = -3;// ball y direction
	private int x1, x2, x3, x4, x5, x6, x7, x8;
	private int z1, z2, z3, z4, z5, z6, z7, z8;
	static final int BALL_DIAMETER = 20;
	final  int GW = 800;//Game High
	final  int GH = 600;// Game Width
	static int R_W = 200;// the width of the rectangle 
	static int R_H = 20;//high of rectangle
	int Rectlocation = (GW/2)-R_W/2;//location of the red rectangle
	int x =40;
	
	

	public Window2() {
		this.init();
		
	
	}
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
	
	
		// bar
		g.setColor(Color.red);
		g.fillRect(Rectlocation, GH-R_H, R_W, R_H);

		// ball
		g.setColor(Color.orange);
		g.fillOval(ballX, ballY, BALL_DIAMETER, BALL_DIAMETER);

		//Bubbles

		g.setColor(Color.red);
		g.fillOval(50, x, x1, x1);
		g.setColor(Color.blue);
		g.fillOval(150, x, x2, x2);
		g.setColor(Color.pink);
		g.fillOval(250, x, x3, x3);
		g.setColor(Color.orange);
		g.fillOval(350,x, x4, x4);
		g.setColor(Color.blue);
		g.fillOval(450, x, x5, x5);
		g.setColor(Color.green);
		g.fillOval(550, x, x6, x6);
		g.setColor(Color.yellow);
		g.fillOval(650, x, x7, x7);
		g.setColor(Color.red);
		g.fillOval(750,x, x8, x8);

		g.setColor(Color.blue);
		g.fillOval(100, x*5, z1, z1);
		g.setColor(Color.red);
		g.fillOval(200, x*5, z2, z2);
		g.setColor(Color.yellow);
		g.fillOval(300, x*5, z3, z3);
		g.setColor(Color.orange);
		g.fillOval(400, x*5, z4, z4);
		g.setColor(Color.green);
		g.fillOval(500, x*5,z5, z5);
		g.setColor(Color.orange);
		g.fillOval(600, x*5, z6, z6);
		g.setColor(Color.gray);
		g.fillOval(700, x*5, z7, z7);
		


	}
	public void init() {
		
		addKeyListener(this);
		timer = new Timer(delay, this);
		timer.start();
		
		x1 = x2 = x3 = x4 = x5 = x6 = x7 = x8 = 30;
		z1 = z2  = z3 = z4 =  z5 = z6 = z7 = z8 = 30;
	    
		this.setFocusable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("THE GAME");
		//this.setResizable(false);
		this.setSize(GW, GH);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(123, 50, 255));
		this.setLayout(null);
		this.addKeyListener(this);
		}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(play) {
			ballX = ballX + ballXDir;
			ballY = ballY + ballYDir;
			
			if(ballX <= 5 || ballX >= GW-BALL_DIAMETER-5) {
				ballXDir = -ballXDir;
			}
			if(ballY <= BALL_DIAMETER) {
				ballYDir = -ballYDir;
			}
			if(new Rectangle(Rectlocation, GH-R_H, R_W, R_H).intersects(
					new Rectangle(ballX, ballY, BALL_DIAMETER,BALL_DIAMETER))) {
				ballYDir = -ballYDir;
			}
			if(ballY >= GH-R_H-10) {
				timer.stop();
				play = false;
				System.out.println("GAME OVER!!!");
			}
			
			if(new Rectangle(50,x,x1,x1).intersects(
					new Rectangle(ballX, ballY, BALL_DIAMETER,BALL_DIAMETER))) {
				x1=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(150,x,x2,x2).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x2=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(250,x,x3,x3).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x3=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(350,x,x4,x4).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x4=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				
				timer.setDelay(delay);
			}
			if(new Rectangle(450,x,x5,x5).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x5=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(550,x,x6,x6).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x6=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(650,x,x7,x7).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x7=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				
				timer.setDelay(delay);
			}
			if(new Rectangle(750,x,x8,x8).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				x8=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				
				timer.setDelay(delay);
			}
			//line 2 of bubbles
			if(new Rectangle(100,x*5,z1,z1).intersects(
					new Rectangle(ballX, ballY, BALL_DIAMETER,BALL_DIAMETER))) {
				z1=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(200,x*5,z2,z2).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z2=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(300,x*5,z3,z3).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z3=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(400,x*5,z4,z4).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z4=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				
				timer.setDelay(delay);
			}
			if(new Rectangle(500,x*5,z5,z5).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z5=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(600,x*5,z6,z6).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z6=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				delay = delay - 1;
				timer.setDelay(delay);
			}
			if(new Rectangle(700,x*5,z7,z7).intersects(
					new Rectangle(ballX, ballY, 20,20))) {
				z7=0;
				ballYDir = -ballYDir;
				score++;
				System.out.println(score);
				
				timer.setDelay(delay);
			}
			
			if(score >= 15) {
				timer.stop();
				play = false;
				
				this.dispose();//goes to the winner window 
				Winner win = new Winner();
			}
			
			repaint();
		
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			play = true;
			if(Rectlocation <= 5) {
				Rectlocation= 5;
			}else {
				Rectlocation = Rectlocation- BALL_DIAMETER;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			play = true;
			if(Rectlocation >= GW-R_W-5) {
				Rectlocation = GW-R_W-5;
			}else {
				Rectlocation= Rectlocation+ 20;
			}

		}
	
			
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}

}

