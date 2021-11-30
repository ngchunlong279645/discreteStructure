package PRIME;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOPIC 5: Division in the Integer: Prime Number and Prime Factorization\r");
		lblNewLabel.setFont(new Font("Adobe Fan Heiti Std B", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 446, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnPN = new JButton("Prime \r\nNumber");
		btnPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrimeN frame = new PrimeN();
				frame.setVisible(true);
				dispose();
			}
		});
		btnPN.setBounds(143, 111, 130, 23);
		contentPane.add(btnPN);
		
		JButton btnPF = new JButton("Prime Factorization");
		btnPF.setBounds(122, 66, 174, 23);
		contentPane.add(btnPF);
		
		JButton btnExit = new JButton("EXIT\r\n");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(164, 157, 89, 23);
		contentPane.add(btnExit);
	}

}
