package co.edu.uniquindio.concesionario.model;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
    private Empleado empleado;
    private String code;
    private Double valorTotal;
    private Cliente cliente;
    private List<DetalleTransaccion> listaDetalles=new ArrayList<>();

    public Transaccion(Empleado empleado, String code, Double valorTotal, Cliente cliente, List<DetalleTransaccion> listaDetalles) {
        this.empleado = empleado;
        this.code = code;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.listaDetalles = listaDetalles;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleTransaccion> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DetalleTransaccion> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }
}
