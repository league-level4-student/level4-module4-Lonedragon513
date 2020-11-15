package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Image extends Polymorph{
	BufferedImage img;
	Image(int x, int y, int width, int height) {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("da3o7ij-5b4a3597-243a-4643-8fd9-de3c04000558.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(), getWidth(), getHeight(), null);
	}
}