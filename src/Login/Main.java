package Login;

public class Main {
	
	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Vista miVista = new Vista();
		
		miControlador.setModelo(miModelo);
		miControlador.setVista(miVista);
		miModelo.setVista(miVista);
		miVista.setControlador(miControlador);
		miVista.setModelo(miModelo);
		
		
		
	}

}
