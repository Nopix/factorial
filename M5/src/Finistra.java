import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finistra {

	private JFrame frame;
	private JTextField textField;
	private JTextField texto;
	String str = new String();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finistra window = new Finistra();
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
	public Finistra() {
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

		texto = new JTextField();
		texto.setBounds(111, 10, 200, 50);
		frame.getContentPane().add(texto);
		texto.setColumns(10);

		JButton Boton2 = new JButton("Mostrar");
		Boton2.setBounds(287, 150, 123, 70);
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(str);

			}
		});

		JButton Boton1 = new JButton("Guardar");
		Boton1.setBounds(24, 150, 123, 70);
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str = texto.getText();
				if(str.equals("")){// Se puede comprobar el objeto str.
					texto.setText("Se tiene que introducir un texto!! sino no se guarda nada");
				}
				else{
				
				texto.setText("");
				}
			}
		});
		frame.getContentPane().add(Boton1);
		Boton2.setBackground(Color.YELLOW);
		frame.getContentPane().add(Boton2);

	}
}
