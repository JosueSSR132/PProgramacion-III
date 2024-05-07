package controlador;


import modelo.Modelo;
import vista.Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controlador{

	public Vista vista;
    public Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        asignarManejadoresEventos();
    }

    public void asignarManejadoresEventos() {
        vista.addLoginActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manejarInicioSesion();
            }
        });
    }

    public void manejarInicioSesion() {
    	String usuario = vista.obtenerNombreUsuario();
        String contraseña = vista.obtenerContraseña();

        if (modelo.existeUsuario(usuario)) {
            vista.setUsuarioBorder(Color.green);
        } else {
            vista.setUsuarioBorder(Color.red);
        }

        if (modelo.esContraseñaCorrecta(usuario, contraseña)) {
            vista.setContraseñaBorder(Color.green);
        } else {
            vista.setContraseñaBorder(Color.red);
        }
        
        boolean credencialesValidas = modelo.verificarUsuarioYContraseña(usuario, contraseña);
        if (credencialesValidas) {
            vista.mostrarMensaje("Login exitoso. Bienvenido", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            vista.contentPane.removeAll();
            vista.alta();
            vista.contentPane.revalidate();
            vista.contentPane.repaint(); 
        } else {    
            vista.mostrarMensaje("Error de Usuario o Contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
