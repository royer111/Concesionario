package co.edu.uniquindio.concesionario.model;

public class Camioneta extends Sedaneta{
	private boolean is4x4;

	public Camioneta(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire, boolean aC,
			boolean camaraReversa, boolean aBS, boolean velocidadCrucero, boolean sensoresColision,
			boolean sensorTraficoCruzado, boolean asistenteCarril, boolean is4x4) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire, aC, camaraReversa, aBS, velocidadCrucero,
				sensoresColision, sensorTraficoCruzado, asistenteCarril);
		this.is4x4 = is4x4;
	}

	public boolean isIs4x4() {
		return is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}

}
