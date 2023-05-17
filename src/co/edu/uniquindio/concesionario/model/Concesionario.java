package co.edu.uniquindio.concesionario.model;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Empleado> listaEmpleados= new ArrayList<>();
    private List<Cliente> listaClientes= new ArrayList<>();
    private List<Vehiculo> listaVehiculos= new ArrayList<>();
    private List<Transaccion> listaTransacciones= new ArrayList<>();


    public Concesionario(List<Empleado> listaEmpleados, List<Cliente> listaClientes, List<Vehiculo> listaVehiculos) {
        this.listaEmpleados = listaEmpleados;
        this.listaClientes = listaClientes;
        this.listaVehiculos = listaVehiculos;
        this.listaTransacciones = listaTransacciones;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////

    public Empleado CrearEmpleado (String nombre, String identificacion, String direccion, String numeroTelefonico, String idEmpleado){
    	Empleado empleado = new Empleado (nombre, identificacion, direccion, numeroTelefonico, idEmpleado);
    	empleado.setNombre(nombre);
    	empleado.setDireccion(direccion);
    	empleado.setIdentificacion(identificacion);
    	empleado.setNumeroTelefonico(numeroTelefonico);
    	empleado.setIdEmpleado(idEmpleado);
    	listaEmpleados.add(empleado);
    	return empleado;
    }

    public Empleado buscarEmpleado (String idEmpleado){
    	for (Empleado empleado : listaEmpleados) {
			if(empleado.getIdEmpleado().equals(idEmpleado)){
				return empleado;
			}
		}
    	return null;
    }

    public void actualizarEmpleado (String nombre, String direccion, String numeroTelefonico, String idEmpleado){
    	for (Empleado empleado : listaEmpleados) {
			if(buscarEmpleado(idEmpleado) != null){
				empleado.setDireccion(empleado.getDireccion());
				empleado.setNombre(empleado.getNombre());
				empleado.setNumeroTelefonico(empleado.getNumeroTelefonico());
			}
		}
    }


    public boolean eliminarEmpleado (String idEmpleado){
    	boolean eliminado = false;
    	for (Empleado empleado : listaEmpleados) {
			if(buscarEmpleado(idEmpleado).equals(empleado.getIdEmpleado())){
				listaEmpleados.remove(empleado);
				eliminado = true;
			}
		}
    	return eliminado;
    }

    ////////////////////////////////////////////////////

    public Cliente CrearCliente (String nombre, String identificacion, String direccion, String numeroTelefonico){
    	Cliente cliente = new Cliente (nombre, identificacion, direccion, numeroTelefonico);
    	cliente.setNombre(nombre);
    	cliente.setDireccion(direccion);
    	cliente.setIdentificacion(identificacion);
    	cliente.setNumeroTelefonico(numeroTelefonico);

    	listaClientes.add(cliente);
    	return cliente;
    }

    public Cliente buscarCliente (String identificacion){
    	for (Cliente cliente : listaClientes) {
			if(cliente.getIdentificacion().equals(identificacion)){
				return cliente;
			}
		}
    	return null;
    }

    public void actualizarCliente (String nombre, String direccion, String numeroTelefonico, String identificacion){
    	for (Cliente cliente : listaClientes) {
			if(buscarCliente(identificacion) != null){
				cliente.setDireccion(cliente.getDireccion());
				cliente.setNombre(cliente.getNombre());
				cliente.setNumeroTelefonico(cliente.getNumeroTelefonico());
			}
		}
    }


    public boolean eliminarCliente (String identificacion){
    	boolean eliminado = false;
    	for (Cliente cliente : listaClientes) {
			if(buscarCliente(identificacion).equals(cliente.getIdentificacion())){
				listaClientes.remove(cliente);
				eliminado = true;
			}
		}
    	return eliminado;
    }

//////////////////////////////////////////////////////////////////////////



    public Vehiculo buscarVehiculo (String placa){
    	for (Vehiculo vehiculo : listaVehiculos) {
			if(vehiculo.getPlaca().equals(placa)){
				return vehiculo;

			}
		}
    	return null;
    }

    public Automovil crearAutomovil (String marca, String placa, String modelo, int cantidadCambios, double velocidadMaxima,
			String cilindraje, EstadoVehiculo estadoVehiculo, TipoCombustible tipoCombustible,
			TipoTransmision tipoTrasmision, int numPuertas, int numPasajeros, int numBolsasAire){
    	Automovil vehiculo =  new Automovil (marca, placa, modelo, cantidadCambios, velocidadMaxima, cilindraje, estadoVehiculo, tipoCombustible, tipoTrasmision, numPuertas, numPasajeros, numBolsasAire);
    	return vehiculo;

    }


}
