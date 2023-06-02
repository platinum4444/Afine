import AficionesPaneles.Animales;
import AficionesPaneles.Home;
import AficionesPaneles.ManejarPaginas;
import AficionesPaneles.Persona;
import AficionesPaneles.CoincidenciaItem;

public class Principal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejarPaginas.cambiarPanel(1);
		Persona pn = new Persona();
		pn.generarDatosAleatorios();
		for (String string : pn.generarAficiones()) {
			System.out.println(string);
		}
		
		
	}
	
	
}
