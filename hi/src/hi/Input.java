package hi;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

	Game game;
	
	public Input(Game game) {
		this.game = game;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			game.player.moveLeft();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.player.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			game.player.moveUp();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			game.player.vx = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.player.vx = 0; 
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

	}

	public void keyTyped(KeyEvent e) {

	}

}
