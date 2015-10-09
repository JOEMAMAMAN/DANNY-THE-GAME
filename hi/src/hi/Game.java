package hi;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {

	Player player = new Player(this);
	Platform plat = new Platform(50, 400, 50, 50);
	Platform plat1 = new Platform(50, 50, 100, 100);
	Thread thread = new Thread();
	public boolean running = true;

	public void screen() {
		setSize(500, 500);
		setTitle("DANNY THE GAME");
		setResizable(false);
		setBackground(Color.yellow);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Game() {
		screen();
		thread.start();
		addKeyListener(new Input(this));
		run();
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 500, 500);
		player.draw(g);
		plat.draw(g);
		plat1.draw(g);
	}

	public static void main(String[] args) {
		new Game();
	}

	public void run() {
		while (true) {
			player.update();
			repaint();
			if (plat.contains(player)) {
				System.out.println("hi");
			}
			if (running) {
				try {
					Thread.sleep(1000 / 20);
				} catch (Exception e) {

				}
			}
		}

	}

}
