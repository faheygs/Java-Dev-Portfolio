package labBallon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class BalloonGui extends JFrame {
	private static final long serialVersionUID = 5755421229265360646L;
	private JPanel contentPane;
	private final Random rand = new Random();
	
	/**
	 * @wbp.nonvisual location=130,399
	 */
	private Balloon balloonA = new Balloon("air", Balloon.Size.S);
	private Balloon balloonB = new Balloon("helium", Balloon.Size.L);
	private BalloonPanel balloonAPanel;
	private BalloonPanel balloonBPanel;
	private JLabel lblEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonGui frame = new BalloonGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BalloonGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = createLblTItle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		JPanel balloonPanel = createBalloonPanel();
		contentPane.add(balloonPanel, BorderLayout.CENTER);

	}

	private JPanel createBalloonPanel() {
		JPanel balloonPanel = new JPanel();
		balloonPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
		balloonPanel.setLayout(new GridLayout(1, 0, 8, 0));
		balloonPanel.setBackground(Color.LIGHT_GRAY);
		balloonPanel.setOpaque(true);
		
		balloonAPanel = new BalloonPanel(balloonA);
		balloonPanel.add(balloonAPanel);
		
		balloonBPanel = new BalloonPanel(balloonB);
		balloonPanel.add(balloonBPanel);
		
		return balloonPanel;
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();

		JButton btnRandomBalloon = new JButton("Random Balloon");
		btnRandomBalloon.setBorder(new EmptyBorder(0, 0, 0, 20));

		btnRandomBalloon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Balloon bA = randomBalloon();
				Balloon bB = randomBalloon();
				
				balloonAPanel.updateBalloon(bA);
				balloonBPanel.updateBalloon(bB);
				
				boolean isEqual = bA.equals(bB);
				lblEqual.setText(isEqual ? "equal" : "not equal");
				if (isEqual) 
					lblEqual.setBackground(Color.ORANGE);
				else
					lblEqual.setBackground(Color.WHITE);				
			}
		});
		controlPanel.add(btnRandomBalloon);
		
		lblEqual = new JLabel(
				balloonA.equals(balloonB) ? "equal" : "not equal");
		lblEqual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEqual.setOpaque(true);
		controlPanel.add(lblEqual);
		return controlPanel;
	}
	
	private Balloon randomBalloon() {
		boolean isAir = rand.nextBoolean();
		String type = isAir ? "air" : "helium";
		
		Balloon.Size[] sizes = Balloon.Size.values();
		int randomIndex = rand.nextInt(sizes.length);
		Balloon.Size size = sizes[randomIndex];
		
		return new Balloon(type, size);
	}

	private JLabel createLblTItle() {
		JLabel lblTitle = new JLabel("Lab Balloon");
		lblTitle.setBorder(new EmptyBorder(8, 0, 6, 0));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}

}