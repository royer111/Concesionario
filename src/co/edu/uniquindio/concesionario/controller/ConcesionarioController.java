package co.edu.uniquindio.concesionario.controller;

import javax.swing.JOptionPane;

import co.edu.uniquindio.concesionario.aplication.ConcesionarioAplicacion;
import co.edu.uniquindio.concesionario.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ConcesionarioController {


	/**
	 * Atributos
	 *
	 */
    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnNuevaCuenta;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnActualizar;

    @FXML
    private TextField fieldNombreEmpleado;


    @FXML
    private TextField fieldIdentificacionEmpleado;

    @FXML
    private TableColumn<Empleado, String> columnaNumeroCuenta;


    @FXML
    private TableColumn<Empleado, Float> columnaSaldoInicial;

    @FXML
    private TableColumn<Empleado, Float> columnaTasaAnual;

    @FXML
    private TextField fieldCodigoEmpleado;

    @FXML
    private TableView<Empleado> tableViews;

/////////////////////////////////////////////////////////////////////////


    @FXML
    void actualizarEvent(ActionEvent event) {
    	JOptionPane.showMessageDialog(null, "Roger es un tontico y un patico");
    }

    @FXML
    void agregarCuentaEvent(ActionEvent event) {

    }

    @FXML
    void eliminarEvent(ActionEvent event) {

    }

    @FXML
    void limpiarEvent(ActionEvent event) {

    }




	private ConcesionarioAplicacion concesionarioAplicacion;

	public void setConcesionarioAplicacion(ConcesionarioAplicacion concesionarioAplicacion) {
        this.concesionarioAplicacion = concesionarioAplicacion;
        tableViews.getItems().clear();
        //tableViews.setItems(getCuentas());
		}

}
