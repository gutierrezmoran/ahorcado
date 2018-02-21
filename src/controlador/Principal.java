package controlador;

import java.awt.EventQueue;

import vista.AhorcadoUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends AhorcadoUI {

	Control control = new Control();

	public Principal() {
		super();

		txtLetra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtLetra.isEditable()) {
					if (!txtLetra.getText().isEmpty()) {
						lblAciertos.setVisible(true);
						txtAciertos.setVisible(true);
						control.anotarAciertos(txtLetra.getText().charAt(0));
						txtAciertos.setText(control.getAciertos());
						txtFallos.setText(String.valueOf(control.getFallos()) + "/6");
						txtLetra.setText("");
						if (control.palabraAcertada()) {
							txtLetra.setEditable(false);
							txtMensaje.setText("YOU WIN");
						} else if (control.getFallos() > 5) {
							txtLetra.setEditable(false);
							txtMensaje.setText("GAME OVER");
						}
					} else {
						txtMensaje.setText("Escribe algo");
					}
				}
			}
		});

		btnYa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPalabraSecreta.getText().isEmpty())
					txtMensaje.setText("Escribe algo");
				else {
					// aqui hemos llegado porque la palabra es valida
					control.setPalabreja(txtPalabraSecreta.getText());
					control.iniciaAciertos();
					// comportamiento del ui tras validar palabra
					// Ocultar los componentes que se han usado para introducir la
					// palabra secreta
					panel1.setVisible(false);
					// hacemos visible el titulo
					lblTitulo.setVisible(true);
					// habilitar el txt de la letra
					txtLetra.setEditable(true);
					txtMensaje.setText("");
				}
			}
		});

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// IMPORTANTE: Se crea un objeto de Principal no del UI
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
