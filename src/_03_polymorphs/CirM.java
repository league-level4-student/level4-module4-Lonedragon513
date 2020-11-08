
package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirM extends Polymorph{

	CirM(int x, int y, int width, int height) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}