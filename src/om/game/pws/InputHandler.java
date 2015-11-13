package om.game.pws;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class InputHandler implements KeyListener {

	public InputHandler(Game game) {
		game.requestFocus();
		game.addKeyListener(this);
	}

	public class Key {
		private int numTimesPressed = 0;
		private boolean pressed = false;

		public int getNumTimesPressed() {
			return numTimesPressed;
		}

		public boolean isPressed() {
			return pressed;
		}

		public void toggle(boolean isPressed) {
			pressed = isPressed;

			if (isPressed) {
				numTimesPressed++;
			}
		}
	}

	public List<Key> keys = new ArrayList<Key>();

	public Key up = new Key();
	public Key down = new Key();
	public Key left = new Key();
	public Key right = new Key();

	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void toggleKey(int KeyCode, boolean isPressed) {
		if (KeyCode == KeyEvent.VK_W || KeyCode == KeyEvent.VK_UP) {
			up.toggle(isPressed);
		}
		if (KeyCode == KeyEvent.VK_S|| KeyCode == KeyEvent.VK_DOWN) {
			down.toggle(isPressed);
		}
		if (KeyCode == KeyEvent.VK_A || KeyCode == KeyEvent.VK_LEFT) {
			left.toggle(isPressed);
		}
		if (KeyCode == KeyEvent.VK_D || KeyCode == KeyEvent.VK_RIGHT) {
			right.toggle(isPressed);
		}
	}
}