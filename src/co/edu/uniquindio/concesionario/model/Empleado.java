package co.edu.uniquindio.concesionario.model;

public class Empleado  {

	private String idEmpleado;
	private String nombre;
	private String identificacion;



	public Empleado(String nombre, String identificacion, String idEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;

		this.identificacion = identificacion;

	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}







}
