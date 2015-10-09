package hi;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle {

	final Game game;
	int x = 25;
	int y = 300;
	int vx = 0;
	int vy = 0;
	int width = 35;
	int height = 35;
	int jumpDistance = -50;
	boolean jump = true;

	public Player(Game game) {
		this.game = game;
		setSize(width, height);
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	public void moveLeft() {
		vx = -10;
	}

	public void moveRight() {
		vx = 10;
	}

	public void moveUp() {
		if (jump) {
			vy = jumpDistance;
			jump = false;
		}
	}

	public void update() {
		x += vx;
		y += vy;


		vy += 15;

		if (x < game.getContentPane().getWidth() - game.getContentPane().getWidth()) {
			x = game.getContentPane().getWidth() - game.getContentPane().getWidth();
		}

		if (y > game.getContentPane().getHeight() - height) {
			y = game.getContentPane().getHeight() - height;
			jump = true;

		}

	}
}
