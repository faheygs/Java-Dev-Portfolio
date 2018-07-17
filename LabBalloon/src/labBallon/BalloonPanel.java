package labBallon;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class BalloonPanel extends JPanel {
	private static final long serialVersionUID = -5089626702684136878L;
	private Balloon balloon;
	private JLabel lblText;
	private JLabel lblImage;

	public void updateBalloon(Balloon b) {
		balloon = b;
		displayBalloon();
	}
	
	/**
	 * Create the panel.
	 */
	public BalloonPanel(Balloon b) {
		this.balloon = b;
		setLayout(new BorderLayout(0, 0));
		this.setOpaque(true);
		this.setBackground(Color.WHITE);
		
		lblText = new JLabel();
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setBorder(new EmptyBorder(9, 0, 12, 0));
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(lblText, BorderLayout.SOUTH);
		
		lblImage = new JLabel();
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblImage, BorderLayout.CENTER);
		
		displayBalloon();
	}
	
	public void displayBalloon() {
		lblText.setText(balloon.toString());
		lblImage.setIcon(balloon.getIcon());	
	}

}