package com.main;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JButton;

public class GameGrid extends JButton {

	int t;

	public GameGrid() {
		setLayout(new GridLayout(3, 3, 3, 3));
		addButtons();
	}

	public static Cell[][] cell = new Cell[3][3];

	// Create a grid of cells by calling Cell class and assigning to array
	private void addButtons() {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				add(cell[y][x] = new Cell());

			}
		}
	}
}
