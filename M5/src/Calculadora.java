import java.awt.EventQueue;
import java.lang.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculadora {

	int operation;
	float op1 = 0, op2 = 0, resultat;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 239, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbln = new JLabel("");
		lbln.setBounds(11, 11, 201, 49);
		lbln.setForeground(Color.BLACK);
		lbln.setBackground(Color.ORANGE);
		frame.getContentPane().add(lbln);

		JButton btn0 = new JButton("0");
		btn0.setBounds(11, 234, 101, 23);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lbln.getText().length() < 8) {// queda por poner que el primer caracter pueda ser cer pero el
													// segundo no !
					lbln.setText(lbln.getText().concat("0"));
				}
			}
		});
		frame.getContentPane().add(btn0);

		JButton btn1 = new JButton("1");
		btn1.setBounds(11, 200, 52, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("1"));
				}
			}
		});
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBounds(60, 200, 52, 23);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("2"));
				}
			}
		});
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBounds(111, 200, 52, 23);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("3"));
				}
			}
		});
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBounds(11, 166, 52, 23);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("4"));
				}
			}
		});
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(60, 166, 52, 23);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("5"));
				}
			}
		});
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(111, 166, 52, 23);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("6"));
				}
			}
		});
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBounds(11, 132, 52, 23);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("7"));
				}
			}
		});
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBounds(60, 132, 52, 23);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("8"));
				}
			}
		});
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBounds(111, 132, 52, 23);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lbln.getText().length() < 8) {
					lbln.setText(lbln.getText().concat("9"));
				}
			}
		});
		frame.getContentPane().add(btn9);

		JButton btnc = new JButton("C");
		btnc.setBounds(111, 234, 52, 23);
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = 0;
				op2 = 0;
				lbln.setText("");
			}
		});
		btnc.setForeground(Color.RED);
		frame.getContentPane().add(btnc);

		JButton suma = new JButton("+");
		suma.setBounds(160, 200, 52, 23);
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!lbln.getText().equals("")) {
					op1 = Float.parseFloat(lbln.getText());
					lbln.setText("");
					operation = 1;
				}
			}
		});
		frame.getContentPane().add(suma);

		JButton resta = new JButton("-");
		resta.setBounds(160, 166, 52, 23);
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!lbln.getText().equals("")) {
					op1 = Float.parseFloat(lbln.getText());
					lbln.setText("");
					operation = 2;
				}
			}
		});
		frame.getContentPane().add(resta);

		JButton multi = new JButton("*");
		multi.setBounds(160, 132, 52, 23);
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!lbln.getText().equals("")) {
					op1 = Float.parseFloat(lbln.getText());
					lbln.setText("");
					operation = 3;
				}
			}
		});
		frame.getContentPane().add(multi);

		JButton divide = new JButton("/");
		divide.setBounds(160, 98, 52, 23);
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!lbln.getText().equals("")) {
					op1 = Float.parseFloat(lbln.getText());
					lbln.setText("");
					operation = 4;
				}
			}
		});
		frame.getContentPane().add(divide);

		JButton result = new JButton("=");
		result.setBounds(160, 234, 52, 23);
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (op1 != 0 && !lbln.getText().equals("")) {
					op2 = Float.parseFloat(lbln.getText());

					switch (operation) {
						case 1 :
							resultat = op1 + op2;
							lbln.setText(String.valueOf(resultat));
							break;
						case 2 :
							resultat = op1 - op2;
							lbln.setText(String.valueOf(resultat));
							break;
						case 3 :
							resultat = op1 * op2;
							lbln.setText(String.valueOf(resultat));
							break;
						case 4 :
							if (op2 != 0) {
								resultat = op1 / op2;
								lbln.setText(String.valueOf(resultat));
							} else {
								lbln.setText("No se puede dividir entre 0");
							}
							break;
					}
				}
			}

		});
		frame.getContentPane().add(result);

		JButton btncoma = new JButton(",");
		btncoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lbln.getText().length() < 7 && lbln.getText().length() > 0 && lbln.getText().indexOf(".") == -1) {
					lbln.setText(lbln.getText().concat("."));

				}

			}
		});
		btncoma.setBounds(11, 98, 44, 23);
		frame.getContentPane().add(btncoma);

		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				op1 = Float.parseFloat(lbln.getText());
				if (op1 == 0) {
					op1 = 1;
				} else {
					for (float i = op1; i != 1; i--) {
						op1 = op1 * (i - 1);
					}
				}
				lbln.setText(String.valueOf(op1));
			}
		});
		btnN.setBounds(65, 98, 89, 23);
		frame.getContentPane().add(btnN);
	}
}
