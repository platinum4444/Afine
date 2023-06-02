package AficionesPaneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Deporte extends JPanel {
	File fl = new File(getClass().getResource("/resources/jumping.png").getFile());
	BufferedImage animalImagen = new BufferedImage(100,100, BufferedImage.TYPE_INT_RGB);
	JLabel actividadLabel = new JLabel("Deporte");
	JButton gustaButton = new JButton("Me gusta");
	JButton noGustaButton = new JButton("No me gusta");
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Deporte() {
		 setLayout(new BorderLayout());
		 gbc.insets = new Insets(10, 10, 10, 10);
		 setBackground(new Color(249, 249, 249));
		 gustaButton.setBackground(new Color(249, 249, 249));
		 
		 gustaButton.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(Color.black, 1),
	               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
		 gustaButton.setOpaque(true);
		 gustaButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				Usuario.aficiones[Usuario.aficionesRellenadasIndice] = "deporte";
				Usuario.aficionesRellenadasIndice++;
				ManejarPaginas.cambiarPanel(5);
				setVisible(false);
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
		 noGustaButton.setBackground(new Color(249, 249, 249));
		 
		 noGustaButton.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(Color.black, 1),
	               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
		 noGustaButton.setOpaque(true);
		 noGustaButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				ManejarPaginas.cambiarPanel(5);
				setVisible(false);
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
				noGustaButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createMatteBorder(10, 30, 10, 30, new Color(106, 106, 106 ))));
				noGustaButton.setBackground(new Color(106, 106, 106));
				noGustaButton.setForeground(Color.white);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				noGustaButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
				noGustaButton.setBackground(new Color(249, 249, 249));
				noGustaButton.setForeground(Color.black);
			}
			 
		 });

		 
		 try {
			 animalImagen = ImageIO.read(fl);
			 JPanel jpn = new JPanel();
			 jpn.setBackground(new Color(249, 249, 249));
			 jpn.setLayout(new GridBagLayout());
			 jpn.setBorder(new EmptyBorder(0, 200, 200, 200));
			 gbc.gridx = 0;
			 gbc.gridx = 1;
			 gbc.gridy = 0;
			 gbc.gridwidth = 2;
			 actividadLabel.setFont(new Font("Agency FB", Font.BOLD, 30));
			 actividadLabel.setBorder(new EmptyBorder(15, 15, 15, 15));
			 jpn.add(actividadLabel);
			 gbc.gridwidth = 1;
			 gbc.gridx = 0;
			 gbc.gridy = 1;
			 jpn.add(gustaButton, gbc);
			 add(jpn, BorderLayout.SOUTH);
			 gbc.gridx = 0;
			 gbc.gridy = 2;
			 jpn.add(noGustaButton, gbc);
			 
		 }catch(Exception e) {
			 System.out.println("Hola");
		 }
	}
	
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(animalImagen, 200, 0, 400, 400, this); // see javadoc for more info on the parameters            
	    }
	
}
