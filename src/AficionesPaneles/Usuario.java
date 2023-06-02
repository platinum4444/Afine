package AficionesPaneles;

public class Usuario {
	public static String nombre, apellidos;
	public static String[] aficiones = new String[7];
	public static int aficionesRellenadasIndice = 0;
	
	public static boolean sonCompatibles(String[] aficionesPerson1, String[] aficionesPerson2) {
		int numeroCoincidencias = 0;
		for (int i = 0; i < aficionesPerson1.length; i++) {
			for (int j = 0; j < aficionesPerson2.length; j++) {
				if(aficionesPerson1[i] != null && aficionesPerson2[j] != null && aficionesPerson1[i].equalsIgnoreCase(aficionesPerson2[j])) {
					numeroCoincidencias++;
				}
			}
		}
		
		if(numeroCoincidencias >= 3) {
			return true;
		}
		
		return false;
		
	}
}
