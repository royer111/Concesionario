package co.edu.uniquindio.concesionario.model;

public class Automovil extends Vehiculo{
    private int numPuertas;
    private int numPasajeros;
    private int numBolsasAire;

	public Automovil(String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire) {
		super(marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible,
				tipoTrasmision);
        this.numPuertas = numPuertas;
        this.numPasajeros = numPasajeros;
        this.numBolsasAire = numBolsasAire;
			}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumBolsasAire() {
		return numBolsasAire;
	}

	public void setNumBolsasAire(int numBolsasAire) {
		this.numBolsasAire = numBolsasAire;
	}



}
