package vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Component;

//Aqui solo va la UI sin comportameinto
public class AhorcadoUI extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtPalabraSecreta;
	protected JTextField txtLetra;
	protected JTextField txtAciertos;
	protected JLabel lblTitulo;
	protected JButton btnYa;
	protected JLabel lblPalabraSecreta;
	protected JPanel panel2;
	protected JPanel panel21;
	protected JPanel panel22;
	protected JPanel panel1;
	private JPanel panel211;
	private JPanel panel212;
	protected JLabel lblAciertos;
	protected JLabel txtFallos;
	protected JLabel txtMensaje;

	/**
	 * Create the frame.
	 */
	public AhorcadoUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		panel1 = new JPanel();
		panel1.setBackground(new Color(230, 230, 250));
		panel1.setBounds(10, 12, 574, 21);
		contentPane.add(panel1);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		lblTitulo = new JLabel("El juego del Ahorcado");
		lblTitulo.setBorder(null);
		lblTitulo.setBounds(10, 0, 574, 64);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		lblTitulo.setVisible(false);
		contentPane.setLayout(null);

		// LeerPalabra
		lblPalabraSecreta = new JLabel("Palabra Secreta:  ");
		lblPalabraSecreta.setForeground(Color.BLACK);
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel1.add(lblPalabraSecreta);

		txtPalabraSecreta = new JTextField();
		txtPalabraSecreta.setMaximumSize(new Dimension(250, 40));
		txtPalabraSecreta.setBackground(new Color(240, 255, 255));
		txtPalabraSecreta.setBorder(null);
		panel1.add(txtPalabraSecreta);
		txtPalabraSecreta.setColumns(10);

		btnYa = new JButton("  Ya!  ");
		btnYa.setForeground(new Color(240, 248, 255));
		btnYa.setPreferredSize(new Dimension(61, 40));
		btnYa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYa.setMaximumSize(new Dimension(100, 40));
		btnYa.setMinimumSize(new Dimension(61, 40));
		btnYa.setBorder(UIManager.getBorder("EditorPane.border"));
		btnYa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnYa.setBackground(new Color(47, 79, 79));
		panel1.add(btnYa);

		panel2 = new JPanel();
		panel2.setBackground(new Color(230, 230, 250));
		panel2.setBounds(10, 70, 574, 192);
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));

		panel21 = new JPanel();
		panel21.setBackground(new Color(230, 230, 250));
		panel2.add(panel21);
		panel21.setLayout(new BorderLayout(0, 0));

		panel211 = new JPanel();
		panel211.setBackground(new Color(230, 230, 250));
		panel21.add(panel211, BorderLayout.NORTH);
		panel211.setLayout(new BoxLayout(panel211, BoxLayout.X_AXIS));

		// LeerLetra
		JLabel lblLetra = new JLabel("letra:   ");
		lblLetra.setForeground(Color.BLACK);
		lblLetra.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel211.add(lblLetra);

		txtLetra = new JTextField();
		txtLetra.setMinimumSize(new Dimension(80, 20));
		txtLetra.setMaximumSize(new Dimension(100, 20));
		txtLetra.setBackground(new Color(240, 255, 255));
		txtLetra.setPreferredSize(new Dimension(80, 20));
		panel211.add(txtLetra);
		txtLetra.setEditable(false);
		txtLetra.setColumns(1);

		JLabel lblFallos = new JLabel("    Fallos    ");
		lblFallos.setForeground(Color.BLACK);
		lblFallos.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel211.add(lblFallos);

		txtFallos = new JLabel("0/6");
		txtFallos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel211.add(txtFallos);

		panel212 = new JPanel();
		panel212.setBackground(new Color(230, 230, 250));
		panel21.add(panel212, BorderLayout.CENTER);
		panel212.setLayout(null);

		lblAciertos = new JLabel("Descubierta");
		lblAciertos.setForeground(Color.BLACK);
		lblAciertos.setVisible(false);
		lblAciertos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAciertos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAciertos.setBounds(0, 73, 102, 25);
		panel212.add(lblAciertos);

		// MostrarAciertos
		txtAciertos = new JTextField();
		txtAciertos.setVisible(false);
		txtAciertos.setBorder(null);
		txtAciertos.setBackground(new Color(240, 248, 255));
		txtAciertos.setHorizontalAlignment(SwingConstants.CENTER);
		txtAciertos.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAciertos.setBounds(0, 96, 574, 55);
		panel212.add(txtAciertos);
		txtAciertos.setEditable(false);
		txtAciertos.setColumns(10);

		panel22 = new JPanel();
		panel22.setBackground(new Color(230, 230, 250));
		panel2.add(panel22, BorderLayout.SOUTH);
		panel22.setLayout(new BoxLayout(panel22, BoxLayout.X_AXIS));

		JLabel lblMensaje = new JLabel("Mensaje: ");
		lblMensaje.setForeground(Color.BLACK);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel22.add(lblMensaje);

		txtMensaje = new JLabel("");
		panel22.add(txtMensaje);
		contentPane.add(lblTitulo);
	}
}
