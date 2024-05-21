package controlador;


import modelo.Modelo;
import vista.Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controlador{

	public Vista vista;

    public Controlador() {
		
		vista = new Vista();
    }

    public void login() {
    	
    	vista.login();
    }
}
