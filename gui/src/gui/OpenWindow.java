package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenWindow extends JFrame implements ActionListener {
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JLabel l = new JLabel();

	public OpenWindow() {


		ImageIcon img = new ImageIcon("mygame.png");// logo of panel
		this.setIconImage(img.getImage());

		ImageIcon image = new ImageIcon("dan.png"); // background

		b1.setVisible(true);// exit button
		b1.setText("Exit");
		b1.setBounds(270, 190, 100, 40);
		b1.setBackground(Color.red);
		b1.addActionListener(this);

		b2.setVisible(true);// start button
		b2.setText("Start Game");
		b2.setBounds(270, 150, 100, 40);
		b2.setBackground(Color.yellow);
		b2.addActionListener(this);

		l.setText("BUBBLES GAME");//title on the open screen
		l.setIcon(image);
		l.setHorizontalTextPosition(JLabel.CENTER);
		l.setVerticalTextPosition(JLabel.TOP);
		l.setForeground(Color.red);
		l.setFont(new Font("mv boli", Font.PLAIN, 60));
		l.setIconTextGap(-120);
		l.setOpaque(true);
		l.setVerticalAlignment(JLabel.CENTER);
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setBounds(0, 0, 626, 417);
		l.add(b1);
		l.add(b2);

		this.setSize(626, 417);//definie size of screen 
		this.setVisible(true);
		this.setTitle("Bubbles");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(l);   

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b2) {

			this.dispose();
			Window2 window = new Window2();
		}
		{
			if(e.getSource()== b1) {

				System.exit(0);

			}
		}
	}}