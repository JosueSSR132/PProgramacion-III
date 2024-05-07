package mainLogin;

import java.awt.EventQueue;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MainLogin {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Vista vista = new Vista();
                    Modelo modelo = new Modelo();
                    Controlador controlador = new Controlador(vista, modelo);
                    vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
