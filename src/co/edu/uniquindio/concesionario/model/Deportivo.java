package co.edu.uniquindio.concesionario.model;

public class Deportivo extends Automovil{
	private int tiempo100Km;

	public Deportivo(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire, int tiempo100Km) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire);
		this.tiempo100Km = tiempo100Km;
	}

	public int getTiempo100Km() {
		return tiempo100Km;
	}

	public void setTiempo100Km(int tiempo100Km) {
		this.tiempo100Km = tiempo100Km;
	}

}
