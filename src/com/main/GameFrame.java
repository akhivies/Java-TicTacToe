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
	JPanel bottomPanel = new JPanel();

	public GameFrame() {
		frame.add(panel, BorderLayout.CENTER);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		topPanel.add(statusLabel);
		panel.add(new GameGrid());
		bottomPanel.add(new ResetButton());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
