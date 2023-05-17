package co.edu.uniquindio.concesionario.model;

public class Administrador extends Empleado{

	private String idAdministrador;




    public Administrador(String nombre, String identificacion, String direccion, String numeroTelefonico) {
		super(nombre, identificacion, direccion, numeroTelefonico);
		this.idAdministrador = idAdministrador;
	}

	public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
}
