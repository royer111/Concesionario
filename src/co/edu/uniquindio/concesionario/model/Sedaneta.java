package co.edu.uniquindio.concesionario.model;

public class Sedaneta extends StationWagon{

	private boolean velocidadCrucero;
	private boolean sensoresColision;
	private boolean sensorTraficoCruzado;
	private boolean asistenteCarril;
	public Sedaneta(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire, boolean aC,
			boolean camaraReversa, boolean aBS, boolean velocidadCrucero, boolean sensoresColision,
			boolean sensorTraficoCruzado, boolean asistenteCarril) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire, aC, camaraReversa, aBS);
		this.velocidadCrucero = velocidadCrucero;
		this.sensoresColision = sensoresColision;
		this.sensorTraficoCruzado = sensorTraficoCruzado;
		this.asistenteCarril = asistenteCarril;
	}
	public boolean isVelocidadCrucero() {
		return velocidadCrucero;
	}
	public void setVelocidadCrucero(boolean velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}
	public boolean isSensoresColision() {
		return sensoresColision;
	}
	public void setSensoresColision(boolean sensoresColision) {
		this.sensoresColision = sensoresColision;
	}
	public boolean isSensorTraficoCruzado() {
		return sensorTraficoCruzado;
	}
	public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
		this.sensorTraficoCruzado = sensorTraficoCruzado;
	}
	public boolean isAsistenteCarril() {
		return asistenteCarril;
	}
	public void setAsistenteCarril(boolean asistenteCarril) {
		this.asistenteCarril = asistenteCarril;
	}


}
