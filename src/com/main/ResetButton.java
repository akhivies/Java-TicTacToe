package com.main;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class ResetButton extends JButton{
	
	public ResetButton() {
		new JButton();
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Cell.playerTurn = 'x';
				GameFrame.statusLabel.setText("Player X turn to play");
				for (int y=0;y<3;y++) {
					for (int x=0;x<3;x++) {
						GameGrid.cell[y][x].setText(" ");
					}
				}
			}
		});
		setText("Reset");
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(110, 40);
	}
}
