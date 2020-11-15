package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class mouse extends Polymorph{

	mouse(int x, int y, int width, int height) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		setX ( (MouseInfo.getPointerInfo().getLocation().x)-30);
		setY((MouseInfo.getPointerInfo().getLocation().y)-55);
	}
}
