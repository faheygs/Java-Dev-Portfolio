package a06;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GuiFace extends JFrame {

	private JPanel contentPane;

	private ArrayList<Image> backGroundList = new ArrayList<Image>();
	  private ArrayList<Image> eyeList = new ArrayList<Image>();
	  private ArrayList<Image> mouthList = new ArrayList<Image>();
	  private ArrayList<Image> noseList = new ArrayList<Image>();

	  //these primitive type vars will be used to loop through the
	  //different images.

	  private int numEyes = 0;
	  private int numNose = 0;
	  private int numMouth = 0;
	  private int numBackGround = 0;
	  
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiFace frame = new GuiFace();
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
	public GuiFace() {
		for(int i = 0; i < 4; i++){
		      eyeList.add(new ImageIcon(getClass().getResource("images/eyes" + String.valueOf(i) + ".png")).getImage());
		      noseList.add(new ImageIcon(getClass().getResource("images/nose" + String.valueOf(i) + ".png")).getImage());
		      mouthList.add(new ImageIcon(getClass().getResource("images/mount" + String.valueOf(i) + ".png")).getImage());
		      backGroundList.add(new ImageIcon(getClass().getResource("images/background" + String.valueOf(i) + ".png")).getImage());
		    }
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(10, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("You Choose...");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Eyes");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mouth");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Nose");
		chckbxNewCheckBox_2.setMnemonic('0');
		panel.add(chckbxNewCheckBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JButton buttonUpdate = new JButton("Update");
	    buttonUpdate.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        int checked = 0; //checks the number of boxes that are marked, if no boxes are check then it will remain zero.

	        if(chckbxNewCheckBox.isSelected()) {
	          checked += 1;
	        if(numEyes != 3) //max index because there are 4 elements
	        numEyes++;
	        else numEyes = 0;
	      }
	        if(chckbxNewCheckBox_1.isSelected()) {
	          checked++;
	        if(numMouth != 3)
	          numMouth++;
	        else numMouth = 0;
	      }
	        if(chckbxNewCheckBox_2.isSelected()) {
	          checked++;
	          if(numNose != 3)
	            numNose++;
	          else numNose = 0;
	      }
	        if(checked == 0) { // checked remains 0 as long as no box is checked.
	          if(numBackGround != 3)
	            numBackGround++; //then the background changes
	            else numBackGround = 0;
	        }
	      }
	    });
	    buttonUpdate.setOpaque(false);
	    panel.add(buttonUpdate);

	    getContentPane().add(new Face(), BorderLayout.CENTER);
	  }
	protected class Face extends JPanel {
	    @Override
	    public void paint(Graphics g) {
	      //using the super keyword allows this subclass to overload the methods inherited by the superclass
	      super.paint(g);
	      g.drawImage(backGroundList.get(numBackGround), 50, 50, 400, 400, null);
	      g.drawImage(eyeList.get(numEyes), 0, 0, 500, 500, null);
	      g.drawImage(noseList.get(numNose), 0, 10, 500, 500, null);
	      g.drawImage(mouthList.get(numMouth), 0, 35, 500, 500, null);
	      repaint();  //updates continuously
	    }
	}
	
	


}
