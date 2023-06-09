package co.edu.uniquindio.concesionario.model;

public class Bus extends Automovil{
    private int numEjes;
    private int numSalidasEmergencia;
    private boolean tieneABS;



	public Bus(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision, numPuertas, numPasajeros, numBolsasAire);
		// TODO Auto-generated constructor stub
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public int getNumSalidasEmergencia() {
		return numSalidasEmergencia;
	}

	public void setNumSalidasEmergencia(int numSalidasEmergencia) {
		this.numSalidasEmergencia = numSalidasEmergencia;
	}

	public boolean isTieneABS() {
		return tieneABS;
	}

	public void setTieneABS(boolean tieneABS) {
		this.tieneABS = tieneABS;
	}


}
