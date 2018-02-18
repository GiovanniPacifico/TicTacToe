package game;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


@SuppressWarnings("serial")
public class GUI extends JFrame {
	private Grid grid = new Grid();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button00 = new JButton("");
		button00.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button00.setText("X");
			}
		});
		button00.setBounds(165, 69, 100, 100);
		contentPane.add(button00);
		
		JButton button01 = new JButton("");
		button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button01.setText("X");
			}
		});
		button01.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button01.setBounds(275, 69, 100, 100);
		contentPane.add(button01);
		
		JButton button02 = new JButton("");
		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button02.setText("X");
			}
		});
		button02.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button02.setBounds(385, 69, 100, 100);
		contentPane.add(button02);
		
		JButton button10 = new JButton("");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button10.setText("X");
			}
		});
		button10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button10.setBounds(165, 180, 100, 100);
		contentPane.add(button10);
		
		JButton button11 = new JButton("");
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button11.setText("X");
			}
		});
		button11.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button11.setBounds(275, 180, 100, 100);
		contentPane.add(button11);
		
		JButton button12 = new JButton("");
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button12.setText("X");
			}
		});
		button12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button12.setBounds(385, 180, 100, 100);
		contentPane.add(button12);
		
		JButton button20 = new JButton("");
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button20.setText("X");
			}
		});
		button20.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button20.setBounds(165, 291, 100, 100);
		contentPane.add(button20);
		
		JButton button21 = new JButton("");
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button21.setText("X");
			}
		});
		button21.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button21.setBounds(275, 291, 100, 100);
		contentPane.add(button21);
		
		JButton button22 = new JButton("");
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button22.setText("X");
			}
		});
		button22.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 23));
		button22.setBounds(385, 291, 100, 100);
		contentPane.add(button22);
		
		JLabel lblSeiCroce = new JLabel("Sei CROCE");
		lblSeiCroce.setBounds(10, 11, 60, 14);
		contentPane.add(lblSeiCroce);
	}
	
	
}
