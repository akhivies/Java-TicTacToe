package com.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Cell extends JButton {

	private static char playerTurn = 'x';

	public Cell() {
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (getText().equals(" ")) {
					setGameText();
				}
			}
		});

		setBorder(new LineBorder(Color.GRAY));
		setText(" ");
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(110, 110);
	}

	public void setGameText() {
		if (!isGameOver()) {
			if (playerTurn == 'x') {
				setText("X");
				if (!isGameOver()) {
					if (!isFull()) {
						GameFrame.statusLabel.setText("Player O turn to play");
						playerTurn = 'o';
					}
				}
			} else {
				setText("O");
				if (!isGameOver()) {
					if (!isFull()) {
						GameFrame.statusLabel.setText("Player X turn to play");
						playerTurn = 'x';
					}
				}
			}
		}
	}

	private boolean isFull() {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				if (GameGrid.cell[y][x].getText().equals(" ")) {
					return false;
				}
			}
		}
		GameFrame.statusLabel.setText("Game Over, board full!");
		return true;
	}

	private boolean isGameOver() {
		for (int y = 0; y < 3; y++) {
			if (GameGrid.cell[y][0].getText().equals("X") && GameGrid.cell[y][1].getText().equals("X")
					&& GameGrid.cell[y][2].getText().equals("X")) {
				GameFrame.statusLabel.setText("Game Over! Player X Wins!");
				return true;
			} else if (GameGrid.cell[y][0].getText().equals("O") && GameGrid.cell[y][1].getText().equals("O")
					&& GameGrid.cell[y][2].getText().equals("O")) {
				GameFrame.statusLabel.setText("Game Over! Player O Wins!");
				return true;
			}
		}
		for (int x = 0; x < 3; x++) {
			if (GameGrid.cell[0][x].getText().equals("X") && GameGrid.cell[1][x].getText().equals("X")
					&& GameGrid.cell[2][x].getText().equals("X")) {
				GameFrame.statusLabel.setText("Game Over! Player X Wins!");
				return true;
			} else if (GameGrid.cell[0][x].getText().equals("O") && GameGrid.cell[1][x].getText().equals("O")
					&& GameGrid.cell[2][x].getText().equals("O")) {
				GameFrame.statusLabel.setText("Game Over! Player O Wins!");
				return true;
			}
		}
		if (GameGrid.cell[0][0].getText().equals("X") && GameGrid.cell[1][1].getText().equals("X")
				&& GameGrid.cell[2][2].getText().equals("X")) {
			GameFrame.statusLabel.setText("Game Over! Player X Wins!");
			return true;
		} else if (GameGrid.cell[0][0].getText().equals("O") && GameGrid.cell[1][1].getText().equals("O")
				&& GameGrid.cell[2][2].getText().equals("O")) {
			GameFrame.statusLabel.setText("Game Over! Player O Wins!");
			return true;
		} else if (GameGrid.cell[0][2].getText().equals("X") && GameGrid.cell[1][1].getText().equals("X")
				&& GameGrid.cell[2][0].getText().equals("X")) {
			GameFrame.statusLabel.setText("Game Over! Player X Wins!");
			return true;
		} else if (GameGrid.cell[0][2].getText().equals("O") && GameGrid.cell[1][1].getText().equals("O")
				&& GameGrid.cell[2][0].getText().equals("O")) {
			GameFrame.statusLabel.setText("Game Over! Player O Wins!");
			return true;
		}
		return false;
	}
}