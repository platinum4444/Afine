package AficionesPaneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Coincidencias extends JPanel {
	JLabel actividadLabel = new JLabel("Hola " + Usuario.nombre + " " + Usuario.apellidos + ", he encontrado estas coincidencias: ");
	File fl = new File("C:\\Users\\alopemar\\Downloads\\dancing.png");
	BufferedImage animalImagen = new BufferedImage(100,100, BufferedImage.TYPE_INT_RGB);
	int posicionX = 0, posicionY = 1;
	
	GridBagConstraints gbc = new GridBagConstraints();
	public Coincidencias () {
		
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(20, 20, 20, 20);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		actividadLabel.setFont(new Font("Agency FB", Font.BOLD, 30));
		add(actividadLabel, gbc);
		gbc.gridwidth = 1;
		Persona[] personas = new Persona[11];
		for (int i = 0; i < personas.length-1; i++) {
			personas[i] = new Persona();
			personas[i].generarDatosAleatorios();
		}
		
		CoincidenciaItem[] coincidenciaItem = new CoincidenciaItem[11];
		for (int i = 0; i < personas.length-1; i++) {
			if(posicionX == 5) {
				posicionX = 0;
				posicionY++;
			}
			System.out.println("X " + posicionX);
			System.out.println("Y " + posicionY);
			if(Usuario.sonCompatibles(Usuario.aficiones, personas[i].getAficiones())) {
				coincidenciaItem[i] = new CoincidenciaItem( personas[i].getImagen(), personas[i].getNombre() + " " + personas[i].getApellidos(), personas[i].getAficiones());
				gbc.gridx = posicionX;
				gbc.gridy = posicionY;
				add(coincidenciaItem[i],gbc);
				posicionX++;
			}	
			
		}
		
		setBackground(new Color(249, 249, 249));
		
		
		
		
	}
}
