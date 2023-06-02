package AficionesPaneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CoincidenciaItem extends JPanel {

	GridBagConstraints gbc = new GridBagConstraints();
	JButton gustaButton = new JButton("Conocer");
	JLabel mostrarNombre;
	int posicionY = 2;
	
	public CoincidenciaItem(String rutaImagen, String nombreCompleto, String[] aficiones) {
		
		setBackground(new Color(249, 249, 249));
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 5, 5, 5);
		//Tratar imagen
		ImageIcon imagenPersonaIcon = new ImageIcon(getClass().getResource(rutaImagen).getPath());
		JLabel imagenPersonaLabel = new JLabel(imagenPersonaIcon);
		imagenPersonaLabel.setSize(200, 200);
		 Image imgEscalada = imagenPersonaIcon.getImage().getScaledInstance(imagenPersonaLabel.getWidth(),
	             imagenPersonaLabel.getHeight(), Image.SCALE_SMOOTH);
	     Icon iconoEscalado = new ImageIcon(imgEscalada);
	     
		imagenPersonaLabel.setIcon(iconoEscalado);
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(imagenPersonaLabel);
		
		
		//Mostrar nombre
		mostrarNombre = new JLabel(nombreCompleto);
		gbc.gridx = 0;
		gbc.gridy = 1;
		mostrarNombre.setFont(new Font("Agency FB", Font.BOLD, 20));
		add(mostrarNombre, gbc);
		
		//Mostrar aficiones
		for (String aficion : aficiones) {
			gbc.gridx = 0;
			gbc.gridy = posicionY;
			add(new JLabel(aficion), gbc);
			posicionY++;
		}

		//Configurar botón de conocer
		gustaButton.setBackground(new Color(249, 249, 249));
		gustaButton.setForeground(Color.black);
		 gustaButton.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(Color.black, 1),
	               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
		 gustaButton.setOpaque(true);
		 gustaButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				gustaButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createMatteBorder(10, 30, 10, 30, new Color(106, 106, 106 ))));
				gustaButton.setBackground(new Color(106, 106, 106));
				gustaButton.setForeground(Color.white);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				gustaButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
				gustaButton.setBackground(new Color(249, 249, 249));
				gustaButton.setForeground(Color.black);
			}
			 
		 });
		 
		 gbc.gridx = 0;
		 gbc.gridy = posicionY;
		 add(gustaButton, gbc);
		 
		 
	}
}
