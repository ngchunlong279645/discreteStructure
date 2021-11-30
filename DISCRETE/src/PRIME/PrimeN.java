package PRIME;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PrimeN extends JFrame {

	private JPanel contentPane;
	public static JTextField number;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeN frame = new PrimeN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static boolean isPrime(int n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
	
	public static int getN() {
		return Integer.parseInt(number.getText());
	}

	/**
	 * Create the frame.
	 */
	public PrimeN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prime Number\r\n");
		lblNewLabel.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 26, 215, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter a number:");
		lblNewLabel_1.setBounds(10, 92, 140, 47);
		contentPane.add(lblNewLabel_1);
		
		number = new JTextField();
		number.setBounds(160, 105, 86, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JButton btnClear = new JButton("Clear\r\n");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number.setText("");
				textArea.setText("");
			}
		});
		btnClear.setBounds(10, 150, 109, 23);
		contentPane.add(btnClear);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n =Integer.parseInt(number.getText());
				
				if (isPrime(n))
					textArea.setText("YES!\n"+n+" IS A PRIME NUMBER");
				else
					textArea.setText("NO!\n"+n+" IS NOT A PRIME NUMBER");	        
		        
			}
		});
		btnCalculate.setBounds(140, 150, 106, 23);
		contentPane.add(btnCalculate);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(270, 103, 188, 98);
		contentPane.add(textArea);
		
		JButton btnStep = new JButton("Show Steps");
		btnStep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PNstep frame = new PNstep();
				frame.setVisible(true);
				
			}
		});
		btnStep.setBounds(140, 184, 106, 23);
		contentPane.add(btnStep);
		
		JButton btnMain = new JButton("Main Menu\r\n");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnMain.setBounds(10, 184, 109, 23);
		contentPane.add(btnMain);
	}
}
