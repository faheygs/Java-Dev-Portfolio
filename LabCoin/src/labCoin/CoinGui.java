package labCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoinGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel textDisplay = new JLabel("");
		textDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textDisplay, BorderLayout.CENTER);
		
		JButton penny = new JButton("");
		penny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(Coin.CENT.toString());
			}
		});
		penny.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/UsCent.png")));
		panel.add(penny);
		
		JButton nickel = new JButton("");
		nickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(Coin.NICKEL.toString());
			}
		});
		nickel.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/UsNickel.png")));
		panel.add(nickel);
		
		JButton dime = new JButton("");
		dime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(Coin.DIME.toString());
			}
		});
		
		dime.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/UsDime.png")));
		panel.add(dime);
		
		JButton quarter = new JButton("");
		quarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(Coin.QUARTER.toString());
			}
		});
		quarter.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/UsQuarter.png")));
		panel.add(quarter);
	}

}
