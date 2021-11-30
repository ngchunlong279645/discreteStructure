package PRIME;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class PNstep extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PNstep frame = new PNstep();
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
	public PNstep() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		int n =PrimeN.getN();
		if (n < 1) 
			textArea.setText(n+" is a negative number");
		
		else if(n==1) 
			textArea.setText(n+" is not a prime number");
		
		else if(n == 2) 
			textArea.setText(n+" is a prime number");
		
		else if (n % 2 == 0) 
			textArea.setText(n+" is an even number");
		
		else if(n % 2 != 2) {
			 int i;
				textArea.setText(" Step 1: "+n+"not equal to 2"+
								"\n Step 2: "+ n +" is not multiple of 2"+
								"\n Step 3: square root of "+n+" equal to"+Math.sqrt(n)+" \n K="+(int)Math.sqrt(n)+
								"\n Step 4: 1<D<=K"+
								"\n 1<D<="+(int)Math.sqrt(n));
			 
				 
			 for ( i = 3; i <= Math.sqrt(n); i += 2) {
				 if (n % i == 0){
					 textArea.append("\n D="+Integer.toString(i)+","); 
					 textArea.append( "\n "+n+"%"+i+" = 0");
				 }
				
				 else{
					 textArea.append("\n D="+Integer.toString(i)+","); 
					 textArea.append( "\n "+n+"%"+i+" not equal 0");	 }
			 }
		}
		 
		 
	}
}
