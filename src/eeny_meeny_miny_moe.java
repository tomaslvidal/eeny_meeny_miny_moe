import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;


public class eeny_meeny_miny_moe extends JFrame {

	private JPanel contentPane;
	private boolean x=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eeny_meeny_miny_moe frame = new eeny_meeny_miny_moe();
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
	public eeny_meeny_miny_moe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton b_1 = new JButton("");
		b_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_1);
				
			}
		});
		b_1.setBounds(21, 27, 89, 67);
		contentPane.add(b_1);
		
		final JButton b_2 = new JButton("");
		b_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_2);
				
			}
		});
		b_2.setBounds(145, 27, 89, 67);
		contentPane.add(b_2);
		
		final JButton b_4 = new JButton("");
		b_4.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_4);
			}
		});
		b_4.setBounds(21, 118, 89, 67);
		contentPane.add(b_4);
		
		final JButton b_3 = new JButton("");
		b_3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_3);
			}
		});
		b_3.setBounds(259, 27, 89, 67);
		contentPane.add(b_3);
		
		final JButton b_5 = new JButton("");
		b_5.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 cambiarLetra(b_5);
			}
		});
		b_5.setBounds(145, 118, 89, 67);
		contentPane.add(b_5);
		
		final JButton b_6 = new JButton("");
		b_6.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_6);
			}
		});
		b_6.setBounds(259, 118, 89, 67);
		contentPane.add(b_6);
		
		final JButton b_7 = new JButton("");
		b_7.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_7);
			}
		});
		b_7.setBounds(21, 209, 89, 67);
		contentPane.add(b_7);
		
		final JButton b_8 = new JButton("");
		b_8.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_8);
			}
		});
		b_8.setBounds(145, 209, 89, 67);
		contentPane.add(b_8);
		
		final JButton b_9 = new JButton("");
		b_9.setFont(new Font("Tahoma", Font.PLAIN, 48));
		b_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarLetra(b_9);
			}
		});
		b_9.setBounds(259, 209, 89, 67);
		contentPane.add(b_9);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setBounds(24, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnClear = new JButton("Volver a jugar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b_1.setEnabled(true);
				b_1.setText("");
				b_2.setEnabled(true);
				b_2.setText("");
				b_3.setEnabled(true);
				b_3.setText("");
				b_4.setEnabled(true);
				b_4.setText("");
				b_5.setEnabled(true);
				b_5.setText("");
				b_6.setEnabled(true);
				b_6.setText("");
				b_7.setEnabled(true);
				b_7.setText("");
				b_8.setEnabled(true);
				b_8.setText("");
				b_9.setEnabled(true);
				b_9.setText("");
				
			}
		});
		btnClear.setBounds(156, 325, 89, 23);
		contentPane.add(btnClear);
	}
	
	
	public void cambiarLetra(JButton boton){
		if(x)
		{
			boton.setText("x");
			x=false;
			boton.setEnabled(false);
		}
		else{
			boton.setText("o");
			x=true;
			boton.setEnabled(false);
		}
	
	}
}
