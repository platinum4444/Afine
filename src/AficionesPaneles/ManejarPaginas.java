package AficionesPaneles;

public class ManejarPaginas {
	static Window window = new Window();
	public static void cambiarPanel(int panel) {
		if(panel == 1) {
			Home home = new Home();
			window.getContentPane().add(home);
			window.setVisible(true);
		}else if(panel == 2) {
			System.out.println("Panel 2");
			Animales an = new Animales();
			window.getContentPane().add(an);
	
		}else if(panel == 3) {
			System.out.println("Panel 3");
			Comer cm = new Comer();
			window.getContentPane().add(cm);
	
		}else if(panel == 4) {
			System.out.println("Panel 4");
			Deporte dp = new Deporte();
			window.getContentPane().add(dp);
	
		}else if(panel == 5) {
			System.out.println("Panel 5");
			Lectura lc = new Lectura();
			window.getContentPane().add(lc);
	
		}else if(panel == 6) {
			System.out.println("Panel 5");
			Naturaleza nz = new Naturaleza();
			window.getContentPane().add(nz);
	
		}else if(panel == 7) {
			System.out.println("Panel 5");
			Patinaje pj = new Patinaje();
			window.getContentPane().add(pj);
	
		}else if(panel == 8) {
			System.out.println("Panel 5");
			Bailar bl = new Bailar();
			window.getContentPane().add(bl);
	
		}else if(panel == 9) {
			System.out.println("Panel 5");
			Coincidencias bl = new Coincidencias();
			window.getContentPane().add(bl);
	
		}
		
	}
}
