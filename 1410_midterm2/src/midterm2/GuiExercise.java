package midterm2;
/*
 * Gavin Fahey
 * CSIS 1410
 * March 29th, 2017
 * Midterm 2
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GuiExercise extends JFrame {

	private JPanel contentPane;
	private Icon pictures;
	//index 0 = Light Blue index 1 = light gray
	private int i = 1;
   
	//creating a lighter blue color
	Color lightBlue= new Color(204, 238, 255);
	private Color[] colors = {lightBlue, Color.GRAY};


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExercise frame = new GuiExercise();
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
	public GuiExercise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);


		final JLabel ladyLiberty = new JLabel();
		ladyLiberty.setOpaque(true);

		pictures = new ImageIcon(getClass().getResource("Images/NewYork.png"));

		ladyLiberty.setIcon(pictures);

		ladyLiberty.setBackground(lightBlue);

		contentPane.add(ladyLiberty, BorderLayout.CENTER);
        //create action listener
		JButton btnNewButton = new JButton("Show New York at Night");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//each time the button is clicked it will change the value of i.
            if(i == 2)
				{
            		//set i equals 0 then light blue will be displayed else gray will be displayed
					i = 0;
					ladyLiberty.setBackground(colors[i]);
					btnNewButton.setText("Show New York at Night");
				}
				else {
					i =2;
					ladyLiberty.setBackground( colors[ i-1]);
					btnNewButton.setText("Show New York at Day");
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);

		JLabel lblNewYork = new JLabel("New York");
		lblNewYork.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewYork.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewYork, BorderLayout.NORTH);
	}
}
