package LabBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {

	int windowWidth = 53;
	int windowHeight = 78;
	int windowStartRight = 110;
	int windowStartDown = 20;
	int padding = 10;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(100, 10, 200, 450);
		
		for(int k = 0; k < 5; k++) {
			for(int i = 0; i < 3; i++) {
				g.setColor(randomColor());
				g.fillRect(windowStartRight, windowStartDown, windowWidth, windowHeight);
				
				windowStartRight += windowWidth + padding;	
			}
			
			windowStartRight = 110;
			windowStartDown += windowHeight + padding;
		}
		
	}
	
	private Color randomColor() {
		Random rand = new Random();
		int red = rand.nextInt(256);
		int green = rand.nextInt(256);
		int blue = rand.nextInt(256);
		
		return new Color(red, green, blue);
	}

}