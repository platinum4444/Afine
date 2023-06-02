package AficionesPaneles;

public class Persona {
	String nombre;
	String apellidos;
	String [] aficiones;
	String imagen;
	boolean hombre;
	
	
	public void generarDatosAleatorios() {
		 nombre = generarNombre();
		 apellidos = generarApellido();
		 aficiones = generarAficiones();
		 imagen = generarImagen();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String[] getAficiones() {
		return aficiones;
	}
	
	public String generarNombre() {
    	int num = (int) (Math.random()*4);
    	switch(num) {
    		case 0: 
    			return "Joe";
    		case 1: 
    			return "Bonnye";
    		case 2: 
    			return "Garfield";
    		case 3: 
    			return "Jerry";	
    		case 4: 
    			return "Woody";	
    	}
    	return "Lily";
    }
    
    public  String generarApellido() {
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0: 
    			return "Smith";
    		case 1: 
    			return "Jones";
    		case 2: 
    			return "Williams";
    		case 3: 
    			return "Brown";	
    		case 4: 
    			return "Evans";	
    	}
    	return "Lidell";
    }
    
    public String generarImagen() {
    	int num = (int) (Math.random()*5);
    	switch(num) {
    		case 0: 
    			return "/resources/angello-lopez-FcUC_WrMy4s-unsplash.jpg";
    		case 1: 
    			return "/resources/jose-aljovin-bAtkCX3Moqs-unsplash.jpg";
    		case 2: 
    			return "/resources/man-holding-starbucks-cup-1753798.jpg";
    		case 3: 
    			return "/resources/benigno-hoyuela-ikiDhdh1Wp0-unsplash.jpg";
    		case 4: 
    			return "/resources/unknown-celebrity-taking-selfie-2092709.jpg";
    	}
    	return "/resources/man-holding-starbucks-cup-1753798.jpg";
    }
    
    int numRandom, cantidadAficionesRandom;
    public String[] generarAficiones() {
    	
    	String aficionesPosibles[] = {"deporte", "bailar", "comer", "patinaje", "naturaleza", "animales", "lectura"};
    	cantidadAficionesRandom = (int) (Math.random()*7);
    	if(cantidadAficionesRandom == 0 || cantidadAficionesRandom == 1 || cantidadAficionesRandom == 2) {
    		cantidadAficionesRandom = 4;
    	}
    	String[] aficionesSuyas = new String[cantidadAficionesRandom];
    	int[] posicionesSalidas = new int[cantidadAficionesRandom];
    	for (int i = 0; i < cantidadAficionesRandom; i++) {
    		
    		do {
    			numRandom = (int) (Math.random()*7);
    		}while(aficionEsDisponible(posicionesSalidas, numRandom) == false);
    		
    		aficionesSuyas[i] = aficionesPosibles[numRandom];
    		posicionesSalidas[i] = numRandom;
    		
    		
    		
		}
    	return aficionesSuyas;  	
    	
    }
    
    public boolean aficionEsDisponible(int[] posicionesSalidas, int numero) {
    	for (int i = 0; i < posicionesSalidas.length; i++) {
    		
    		if(posicionesSalidas[i] == numero) {
    			return false;
    		}
			
		}
    	return true;
    }
    
}
