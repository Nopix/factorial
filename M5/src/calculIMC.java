import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JLabel;

import java.awt.Font;
import java.text.DecimalFormat;

public class calculIMC {

	private JFrame frame;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultat;

	float altura, pes, imc;// Declaro las variables donde recogeré los valore sy la de resultado
	private JLabel lblClculDel;
	private JLabel lblAltura;
	private JLabel lblPes;
	private JLabel lblResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculIMC window = new calculIMC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculIMC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtValor1 = new JTextField();
		txtValor1.setBounds(30, 62, 86, 20);
		frame.getContentPane().add(txtValor1);
		txtValor1.setColumns(10);

		txtValor2 = new JTextField();
		txtValor2.setBounds(126, 62, 86, 20);
		frame.getContentPane().add(txtValor2);
		txtValor2.setColumns(10);

		txtResultat = new JTextField();
		txtResultat.setBounds(268, 62, 156, 20);
		frame.getContentPane().add(txtResultat);
		txtResultat.setColumns(10);

		JButton btnEsborra = new JButton("Borrar");
		btnEsborra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altura = 0; // Pongo las variables a 0
				pes = 0;
				imc = 0;
				txtValor1.setText(""); // borro los tres campos de texto
				txtValor2.setText("");
				txtResultat.setText("");
			}
		});
		btnEsborra.setBounds(245, 113, 89, 23);
		frame.getContentPane().add(btnEsborra);

		JButton btnCalcula = new JButton("Calcula");
		btnCalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtValor1.getText().length() == 0 || txtValor2.getText().length() == 0) { // Comprobar que no tenga
																								// un campo vació si lo
																								// tengo asigno 0 al
																								// resultado
					imc = 0;
				} else {// si los dos campos están llenos hago el cálculo y lo guardo en imc
					altura = Float.parseFloat(txtValor1.getText());
					pes = Float.parseFloat(txtValor2.getText());
					imc = altura / (pes * pes);

				}
				if (imc == 0) {
					txtResultat.setText("No has introduit valors");
				} else {
					DecimalFormat f = new DecimalFormat("0.00");
					txtResultat.setText(String.valueOf(f.format(imc)));// muestro en el campo resultado el valor de imc pasado a
																// string
				}
			}
		});
		btnCalcula.setBounds(88, 113, 89, 23);
		frame.getContentPane().add(btnCalcula);

		lblClculDel = new JLabel("C\u00E1lcul del IMC");
		lblClculDel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClculDel.setBounds(134, 11, 200, 50);
		frame.getContentPane().add(lblClculDel);

		lblAltura = new JLabel("altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAltura.setBounds(50, 72, 57, 39);
		frame.getContentPane().add(lblAltura);

		lblPes = new JLabel("pes");
		lblPes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPes.setBounds(155, 72, 57, 39);
		frame.getContentPane().add(lblPes);

		lblResultat = new JLabel("Resultat");
		lblResultat.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultat.setBounds(316, 72, 57, 39);
		frame.getContentPane().add(lblResultat);
	}
}
