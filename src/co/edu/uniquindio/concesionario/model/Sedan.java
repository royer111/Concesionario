package co.edu.uniquindio.concesionario.model;

public class Sedan extends Sedaneta{

	private int capacidadMaletero;



	public Sedan(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire, boolean aC,
			boolean camaraReversa, boolean aBS, boolean velocidadCrucero, boolean sensoresColision,
			boolean sensorTraficoCruzado, boolean asistenteCarril) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire, aC, camaraReversa, aBS, velocidadCrucero,
				sensoresColision, sensorTraficoCruzado, asistenteCarril);
		this.capacidadMaletero = capacidadMaletero;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}


}
