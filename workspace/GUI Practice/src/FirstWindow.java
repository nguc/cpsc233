import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstWindow extends JFrame implements ActionListener{
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	
	
	
	//Window constructor
	public FirstWindow(){
		super();
		
		//setting a layout for the frame (can position the components in N,S,W,E or C)
		this.setLayout(new BorderLayout());
		
		//flow layout arranges components left to right
		//this.setLayout(new FlowLayout());
		
		//Grid layout manager
		//this.setLayout(new GridLayout(/*rows,columns*/));
		
		setSize(WIDTH,HEIGHT);
		setTitle("First Window Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set background color
		this.getContentPane().setBackground(Color.lightGray);
		
		//making top, bottom and inner bottom panels
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout());
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new FlowLayout());
		
		//making a buttons for top panel
		JButton b1 = new JButton("Monthly");
		b1.addActionListener(new ActionHandler());
		JButton b2 = new JButton("Bi-Weekly");
		b2.addActionListener(new ActionHandler());
		JButton b3 = new JButton("Weekly");
		b3.addActionListener(new ActionHandler());
		//buttonPanel.add(b1,BorderLayout.NORTH);
		
		//making a label
		JLabel j1 = new JLabel("Mortgage Amount	$");
		j1.setBackground(Color.DARK_GRAY);
		JLabel j2 = new JLabel("Amortization");
		j2.setBackground(Color.DARK_GRAY);
		JLabel j3 = new JLabel("Interest Rate");
		j3.setBackground(Color.DARK_GRAY);
		JLabel j4 = new JLabel("Payment Frequency");
		j4.setBackground(Color.DARK_GRAY);
		//this.add(j1,BorderLayout.CENTER);
		bottomPanel.add(j1);
		
		//adding labels and buttons to top panel
		//topPanel.add(j1);
		topPanel.add(j2);
		topPanel.add(j3);
		topPanel.add(j4);
		
		topPanel.add(b1);
		topPanel.add(b2);
		topPanel.add(b3);
		
		//adding panel to frame
		add(topPanel,BorderLayout.NORTH);
		add(bottomPanel,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
