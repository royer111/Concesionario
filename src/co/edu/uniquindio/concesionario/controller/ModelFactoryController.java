package co.edu.uniquindio.concesionario.controller;

import java.util.List;

import co.edu.uniquindio.concesionario.model.Concesionario;
import co.edu.uniquindio.concesionario.model.Empleado;



public class ModelFactoryController {
	Concesionario concesionario = null;



	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		System.out.println("invocación clase singleton");
		inicializarDatos();
	}


	private void inicializarDatos() {
		concesionario = new Concesionario("concesionario uq");

}





	public Concesionario getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public Empleado buscarEmpleado ( String idEmpleado){

		Empleado empleado = (concesionario.buscarEmpleado(idEmpleado));
		return empleado;
	}


	public Empleado crearEmpleado (String nombreEmpleado, String idEmpleado, String identificacion){
		Empleado empleado = (concesionario.CrearEmpleado(nombreEmpleado, identificacion,  idEmpleado));
		return empleado;
	}


	public boolean eliminarEmpleado(String idEmpleado) {
		boolean eliminado = concesionario.eliminarEmpleado(idEmpleado);
		return eliminado;
	}

	public void actualizarEmpleado(String nombre, String idEmpleado) {
		concesionario.actualizarEmpleado(nombre, idEmpleado);

	}

	public ClienteJuridico crearClienteJuridico (String nit, String nombre, String telefono, String tipoEmpresa){
		ClienteJuridico cliente = (empresa.agregarClienteJuridico(nit, nombre, telefono, tipoEmpresa));
		return cliente;
	}


	public boolean eliminarClienteJuridico (String nit) {
		boolean eliminado = empresa.eliminarClienteJuridico(nit);
		return eliminado;
	}

	public void actualizarClienteJuridico (String nit, String nombre, String telefono, String tipoEmpresa) {
		empresa.actualizarClienteJuridico(nit, nombre, telefono, tipoEmpresa);

	}


	public Factura crearFactura (String codigoFactura, String fechaFacturacion, float totalPagar , String nombre){
		Factura factura = (empresa.agregarFactura( codigoFactura, fechaFacturacion, totalPagar, nombre));
		return factura;
	}


	public List<Empleado> obtenerEmpleados() {
		return concesionario.getListaEmpleados();
	}

}
