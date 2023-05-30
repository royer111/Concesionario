package co.edu.uniquindio.concesionario.model;

public class StationWagon extends Automovil{

	private boolean AC;
	private boolean camaraReversa;
	private boolean ABS;
	public StationWagon(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire, boolean aC,
			boolean camaraReversa, boolean aBS) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire);
		AC = aC;
		this.camaraReversa = camaraReversa;
		ABS = aBS;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public boolean isCamaraReversa() {
		return camaraReversa;
	}
	public void setCamaraReversa(boolean camaraReversa) {
		this.camaraReversa = camaraReversa;
	}
	public boolean isABS() {
		return ABS;
	}
	public void setABS(boolean aBS) {
		ABS = aBS;
	}


}
