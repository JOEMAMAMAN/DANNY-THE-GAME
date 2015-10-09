package hi;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Platform extends Rectangle {
	int x;
	int y;
	int width;
	int height;

	public Platform(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setSize(width, height);
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}

}