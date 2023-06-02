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
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Home extends JPanel {
	
	File fl = new File(getClass().getResource("/resources/laying.png").getFile());
	BufferedImage animalImagen = new BufferedImage(100,100, BufferedImage.TYPE_INT_RGB);
	JLabel cuentanosLabel = new JLabel("Cuentanos sobre ti");
	JLabel nombreLabel = new JLabel("�Como te llamas?");
	JLabel apellidosLabel = new JLabel("�Y cu�les son tus apellidos?");
	JTextField nombreTextField = new JTextField("", 20);
	JTextField apellidosTextField = new JTextField("", 20);
	JButton iniciarButton = new JButton("Iniciar");
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Home() {
		 setLayout(new BorderLayout());
		 gbc.insets = new Insets(10, 10, 10, 10);
		 setBackground(new Color(249, 249, 249));
		 iniciarButton.setBackground(new Color(249, 249, 249));
		 
		 iniciarButton.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(Color.black, 1),
	               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
		 iniciarButton.setOpaque(true);
		 iniciarButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				ManejarPaginas.cambiarPanel(2);
				Usuario.nombre = nombreTextField.getText();
				Usuario.apellidos = apellidosTextField.getText();
				
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
				iniciarButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createMatteBorder(10, 30, 10, 30, new Color(106, 106, 106 ))));
				iniciarButton.setBackground(new Color(106, 106, 106));
				iniciarButton.setForeground(Color.white);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				iniciarButton.setBorder(BorderFactory.createCompoundBorder(
			               BorderFactory.createLineBorder(Color.black, 1),
			               BorderFactory.createEmptyBorder(10, 30, 10, 30)));
				iniciarButton.setBackground(new Color(249, 249, 249));
				iniciarButton.setForeground(Color.black);
			}
			 
		 });
		 
		 
		 try {
			 animalImagen = ImageIO.read(fl);
			 JPanel jpn = new JPanel();
			 jpn.setBackground(new Color(249, 249, 249));
			 jpn.setLayout(new GridBagLayout());
			 jpn.setBorder(new EmptyBorder(70, 70, 70, 70));
			 gbc.gridx = 0;
			 gbc.gridx = 1;
			 gbc.gridy = 0;
			 gbc.gridwidth = 2;
			 cuentanosLabel.setFont(new Font("Agency FB", Font.BOLD, 30));
			 cuentanosLabel.setBorder(new EmptyBorder(15, 15, 15, 15));
			 jpn.add(cuentanosLabel);
			 gbc.gridwidth = 1;
			 gbc.gridx = 0;
			 gbc.gridy = 1;
			 jpn.add(nombreLabel, gbc);

			 gbc.gridx = 1;
			 gbc.gridy = 1;
			 jpn.add(nombreTextField, gbc);
			 gbc.gridx = 0;
			 gbc.gridy = 2;
			 jpn.add(apellidosLabel, gbc);
			 gbc.gridx = 1;
			 gbc.gridy = 2;
			 jpn.add(apellidosTextField, gbc);
			 gbc.gridx = 0;
			 gbc.gridy = 3;
			 gbc.gridwidth = 2;
			 jpn.add(iniciarButton, gbc);
			
			 add(jpn, BorderLayout.SOUTH);
			 
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
