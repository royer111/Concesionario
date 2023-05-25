package co.edu.uniquindio.concesionario.model;

public class Administrador extends Empleado{

	private String idAdministrador;




    public Administrador(String nombre, String identificacion, String direccion, String numeroTelefonico, String idAdministrador) {
		super(nombre, identificacion, idAdministrador);
		this.idAdministrador = idAdministrador;
	}

	public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
}
