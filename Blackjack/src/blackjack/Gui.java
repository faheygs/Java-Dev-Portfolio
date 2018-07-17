package blackjack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JButton hitBtn;
	private JButton stayBtn;
	private JButton chip1;
	private JButton chip5;
	private JButton chip25;
	private JButton chip100;
	private JPanel mainPanel;
	private JPanel bottomPanel;
	private JPanel betPanel;
	private JLabel betLabel;
	private JLabel betAmountLabel;
	private JPanel playerPanel;
	private JPanel dealerPanel;
	private JPanel playerLabel;
	private JLayeredPane playerCardPanel;
	private JPanel dealerLabel;
	private JLayeredPane dealerCardPanel;
	private JButton dealBtn;
	private JPanel winPanel;
	private JLabel winLabel;
	int x = 100;
	int y = 100;
	private JLabel lblPlayer;
	private JPanel playerScore;
	private JLabel playerScoreLbl;
	private JLabel playerScoreCount;
	private JLabel lblDealer;
	private JPanel dealerScore;
	private JLabel lblDealerScore;
	private JLabel lblDealercurrentscore;
	private JLabel lblBank;
	private JLabel lblBankamount;

	Game game = new Game();
	boolean endGame = false;
	private JLabel titleLabel;
	private int bank = PlayerScoreRecord.getWinnings();
	int bet = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/blackjack/chipImages/icon.png")));
		setTitle("BlackJack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(0, 128, 0));
		contentPane.add(sidePanel, BorderLayout.WEST);
		sidePanel.setLayout(new GridLayout(5, 1, 0, 0));

		betPanel = new JPanel();
		betPanel.setBackground(new Color(0, 128, 0));
		sidePanel.add(betPanel);
		betPanel.setLayout(new GridLayout(2, 2, 0, 0));

		betLabel = new JLabel("Bet:");
		betLabel.setForeground(Color.WHITE);
		betLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		betLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		betPanel.add(betLabel);

		betAmountLabel = new JLabel("");
		betAmountLabel.setForeground(Color.WHITE);
		betAmountLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		betAmountLabel.setText(" $" + String.valueOf(bet));
		betPanel.add(betAmountLabel);

		lblBank = new JLabel("Bank:");
		lblBank.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBank.setForeground(Color.WHITE);
		lblBank.setHorizontalAlignment(SwingConstants.RIGHT);
		betPanel.add(lblBank);

		lblBankamount = new JLabel("");
		lblBankamount.setForeground(Color.WHITE);
		lblBankamount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBankamount.setText(" $" + String.valueOf(bank));
		betPanel.add(lblBankamount);

		chip1 = new JButton("");
		chip1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (bank >= 1) {
					bet++;
					bank--;
					betAmountLabel.setText(" $" + String.valueOf(bet));
					lblBankamount.setText(" $" + String.valueOf(bank));
				} else {
					chip1.setEnabled(false);
				}
			}
		});
		chip1.setBorderPainted(false);
		chip1.setOpaque(false);
		chip1.setBackground(new Color(0, 128, 0));
		chip1.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/1_chip_sm.png")));
		chip1.setBorder(null);
		sidePanel.add(chip1);

		chip5 = new JButton("");
		chip5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bank >= 5) {
					bet += 5;
					bank -= 5;
					betAmountLabel.setText(" $" + String.valueOf(bet));
					lblBankamount.setText(" $" + String.valueOf(bank));
				} else {
					chip5.setEnabled(false);
				}
			}
		});
		chip5.setBorderPainted(false);
		chip5.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/5_chip_sm.png")));
		chip5.setBorder(null);
		chip5.setBackground(new Color(0, 128, 0));
		chip5.setOpaque(false);
		sidePanel.add(chip5);

		chip25 = new JButton("");
		chip25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bank >= 25) {
					bet += 25;
					bank -= 25;
					betAmountLabel.setText(" $" + String.valueOf(bet));
					lblBankamount.setText(" $" + String.valueOf(bank));
				} else {
					chip25.setEnabled(false);
				}
			}
		});
		chip25.setBackground(new Color(0, 128, 0));
		chip25.setBorderPainted(false);
		chip25.setOpaque(false);
		chip25.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/25_chip_sm.png")));
		chip25.setBorder(null);
		sidePanel.add(chip25);

		chip100 = new JButton("");
		chip100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bank >= 100) {
					bet += 100;
					bank -= 100;
					betAmountLabel.setText(" $" + String.valueOf(bet));
					lblBankamount.setText(" $" + String.valueOf(bank));
				} else if (bank < 100) {
					chip100.setEnabled(false);
				}
			}
		});
		chip100.setBorderPainted(false);
		chip100.setOpaque(false);
		chip100.setBackground(new Color(0, 128, 0));
		chip100.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/100_chip_sm.png")));
		chip100.setBorder(null);
		sidePanel.add(chip100);

		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(0, 128, 0));
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(1, 2, 0, 0));

		playerPanel = new JPanel();
		playerPanel.setBackground(new Color(0, 128, 0));
		mainPanel.add(playerPanel);
		playerPanel.setLayout(new GridLayout(2, 0, 0, 0));

		playerLabel = new JPanel();
		playerLabel.setBackground(new Color(0, 128, 0));
		playerLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		playerPanel.add(playerLabel);
		playerLabel.setLayout(new GridLayout(2, 0, 0, 0));

		lblPlayer = new JLabel("Player");
		lblPlayer.setForeground(new Color(255, 204, 0));
		lblPlayer.setFont(new Font("Dialog", Font.BOLD, 22));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		playerLabel.add(lblPlayer);

		playerScore = new JPanel();
		playerScore.setBackground(new Color(0, 128, 0));
		playerLabel.add(playerScore);
		playerScore.setLayout(new GridLayout(0, 2, 0, 0));

		playerScoreLbl = new JLabel("Your Score:");
		playerScoreLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		playerScoreLbl.setForeground(Color.WHITE);
		playerScoreLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		playerScore.add(playerScoreLbl);

		playerScoreCount = new JLabel("");
		playerScoreCount.setFont(new Font("Tahoma", Font.BOLD, 14));
		playerScoreCount.setForeground(Color.WHITE);
		playerScore.add(playerScoreCount);

		playerCardPanel = new JLayeredPane();
		playerCardPanel.setBackground(new Color(0, 128, 0));
		playerPanel.add(playerCardPanel);
		playerCardPanel.setLayout(null);

		dealerPanel = new JPanel();
		dealerPanel.setBackground(new Color(0, 128, 0));
		mainPanel.add(dealerPanel);
		dealerPanel.setLayout(new GridLayout(2, 1, 0, 0));

		dealerLabel = new JPanel();
		dealerLabel.setBackground(new Color(0, 128, 0));
		dealerLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		dealerPanel.add(dealerLabel);
		dealerLabel.setLayout(new GridLayout(2, 1, 0, 0));

		lblDealer = new JLabel("Dealer");
		lblDealer.setForeground(new Color(255, 204, 0));
		lblDealer.setFont(new Font("Dialog", Font.BOLD, 22));
		lblDealer.setHorizontalAlignment(SwingConstants.CENTER);
		dealerLabel.add(lblDealer);

		dealerScore = new JPanel();
		dealerScore.setBackground(new Color(0, 128, 0));
		dealerLabel.add(dealerScore);
		dealerScore.setLayout(new GridLayout(0, 2, 0, 0));

		lblDealerScore = new JLabel("Dealer Score:");
		lblDealerScore.setForeground(Color.WHITE);
		lblDealerScore.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDealerScore.setHorizontalAlignment(SwingConstants.RIGHT);
		dealerScore.add(lblDealerScore);

		lblDealercurrentscore = new JLabel("");
		lblDealercurrentscore.setForeground(Color.WHITE);
		lblDealercurrentscore.setFont(new Font("Tahoma", Font.BOLD, 14));
		dealerScore.add(lblDealercurrentscore);

		dealerCardPanel = new JLayeredPane();
		dealerCardPanel.setBackground(new Color(0, 128, 0));
		dealerPanel.add(dealerCardPanel);

		bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(0, 128, 0));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

		hitBtn = new JButton("");
		hitBtn.setBackground(new Color(0, 128, 0));
		hitBtn.setOpaque(false);
		hitBtn.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/hitbutton.png")));
		hitBtn.setBorder(null);
		hitBtn.setEnabled(false);
		hitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.hit();
				for (int i = game.playerHand.hand.size() - 1; i < game.playerHand.hand.size(); i++) {
					JLabel lbl = new JLabel();
					lbl.setBounds(x += 25, 10, 150, 220);
					lbl.setIcon(game.playerHand.hand.get(i).image());
					lbl.setVisible(true);
					playerCardPanel.add(lbl, new Integer(i));

				}
				playerScoreCount.setText(String.valueOf(game.playerHand.value()));
				playerCardPanel.repaint();
				if (game.playerBusts) {
					endGame();
				}

			}
		});
		bottomPanel.add(hitBtn);

		stayBtn = new JButton("");
		stayBtn.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/stay.png")));
		stayBtn.setOpaque(false);
		stayBtn.setBorder(null);
		stayBtn.setBackground(new Color(0, 128, 0));
		stayBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dealerCardPanel.removeAll();

				y = 100;
				game.stay();
				for (int i = 0; i < game.dealerHand.hand.size(); i++) {
					JLabel lbl = new JLabel();
					lbl.setBounds(y += 25, 10, 150, 220);
					lbl.setIcon(game.dealerHand.hand.get(i).image());
					lbl.setVisible(true);
					dealerCardPanel.add(lbl, new Integer(i));

				}
				lblDealercurrentscore.setText(String.valueOf(game.dealerHand.value()));
				dealerCardPanel.repaint();
				endGame();

			}
		});
		stayBtn.setEnabled(false);
		bottomPanel.add(stayBtn);

		dealBtn = new JButton("");
		dealBtn.setBackground(new Color(0, 128, 0));
		dealBtn.setOpaque(false);
		dealBtn.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/deal.png")));
		dealBtn.setBorder(null);
		dealBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if game ended reset gui
				if (endGame == true) {
					playerCardPanel.removeAll();
					dealerCardPanel.removeAll();
					x = 100;
					y = 100;
				}
				// call new game
				game.newGame();
				// deal player cards
				for (int i = 0; i < game.playerHand.hand.size(); i++) {
					JLabel lbl = new JLabel();
					lbl.setBounds(x += 25, 10, 150, 220);
					lbl.setIcon(game.playerHand.hand.get(i).image());
					lbl.setVisible(true);
					playerCardPanel.add(lbl, new Integer(i));

				}
				// player score
				playerScoreCount.setText(String.valueOf(game.playerHand.value()));
				playerCardPanel.repaint();
				// deal dealers cards
				for (int i = 0; i < game.dealerHand.hand.size(); i++) {
					JLabel lbl = new JLabel();
					lbl.setBounds(y += 25, 10, 150, 220);
					if (i == 0) {
						lbl.setIcon(new ImageIcon(this.getClass().getResource("chipImages/Back.png")));
					} else {
						lbl.setIcon(game.dealerHand.hand.get(i).image());
					}
					lbl.setVisible(true);
					dealerCardPanel.add(lbl, new Integer(i));

				}
				dealerCardPanel.repaint();
				// dealer score
				lblDealercurrentscore.setText("?");
				dealBtn.setEnabled(false);
				hitBtn.setEnabled(true);
				stayBtn.setEnabled(true);
				chip1.setEnabled(false);
				chip5.setEnabled(false);
				chip25.setEnabled(false);
				chip100.setEnabled(false);
			}
		});
		bottomPanel.add(dealBtn);

		winPanel = new JPanel();
		winPanel.setPreferredSize(new Dimension(20, 150));
		winPanel.setSize(new Dimension(1, 20));
		winPanel.setBackground(new Color(0, 128, 0));
		contentPane.add(winPanel, BorderLayout.NORTH);
		winPanel.setLayout(new GridLayout(2, 1, 0, 0));

		titleLabel = new JLabel("");
		titleLabel.setIcon(new ImageIcon(Gui.class.getResource("/blackjack/chipImages/bj.png")));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBackground(new Color(0, 128, 0));
		winPanel.add(titleLabel);

		winLabel = new JLabel("");
		winLabel.setForeground(Color.BLACK);
		winLabel.setBackground(new Color(0, 128, 0));
		winLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		winLabel.setHorizontalAlignment(SwingConstants.CENTER);
		winPanel.add(winLabel);
	}

	public void endGame() {
		endGame = true;
		hitBtn.setEnabled(false);
		stayBtn.setEnabled(false);
		dealBtn.setEnabled(true);
		chip1.setEnabled(true);
		chip5.setEnabled(true);
		chip25.setEnabled(true);
		chip100.setEnabled(true);

		if (game.tieGame) {
			winLabel.setText("Tie Game");
		}
		if (game.playerBusts) {
			winLabel.setText("You Bust");
		}
		if (game.playerWins && !game.playerBusts) {
			winLabel.setText("You Win");
			bank = bank + (bet * 2);
		}
		if (game.dealerBusts) {
			winLabel.setText("Dealer Busts");
			bank = bank + (bet * 2);
		}
		if (game.dealerWins && !game.dealerBusts) {
			winLabel.setText("Dealer Wins");
		}
		bet = 0;
		betAmountLabel.setText(" $" + String.valueOf(bet));
		lblBankamount.setText(" $" + String.valueOf(bank));
		PlayerScoreRecord.setWinnings(bank);

		if (bank == 0) {
			dealBtn.setEnabled(false);
			chip1.setEnabled(false);
			chip5.setEnabled(false);
			chip25.setEnabled(false);
			chip100.setEnabled(false);
			winLabel.setText("Game Over! You have no money!");
		}

	}

}