package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class mouse extends Polymorph{

	mouse(int x, int y, int width, int height) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}
