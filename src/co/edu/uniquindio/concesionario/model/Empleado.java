package co.edu.uniquindio.concesionario.model;

public class Empleado extends Persona{

	private String idEmpleado;


	public Empleado(String nombre, String identificacion, String direccion, String numeroTelefonico, String idEmpleado) {
		super(nombre, identificacion, direccion, numeroTelefonico);
		this.idEmpleado = idEmpleado;
	}



	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}







}
