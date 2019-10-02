package com.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame {
	
	
	JFrame frame = new JFrame("TicTacToe Game");
	JPanel topPanel = new JPanel();
	static JLabel statusLabel = new JLabel("Player X turn to play");
	JPanel panel = new JPanel();
	
	public GameFrame() {
		//frame.setContentPane(this);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(topPanel, BorderLayout.NORTH);
		topPanel.add(statusLabel);
		panel.add(new GameGrid());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	

}
