package co.edu.uniquindio.concesionario.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;



import co.edu.uniquindio.concesionario.aplication.ConcesionarioAplicacion;
import co.edu.uniquindio.concesionario.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ConcesionarioController implements Initializable{


	//////////////////////////////////////////////////
	/**
	 * Funcionalidades generales
	 */
	ModelFactoryController mfm = ModelFactoryController.getInstance();
	private Empleado empleadoSeleccionado;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.columnaNombreEmpleado.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnaCodigoEmpleado.setCellValueFactory(new PropertyValueFactory<>("idEmpleado"));
		this.columnaIdentificacionEmpleado.setCellValueFactory(new PropertyValueFactory<>("identificacion"));





		tableViewsEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) ->{
			if(newSelection!= null){
				empleadoSeleccionado = (Empleado) newSelection;
				mostrarDatosField ();
			}
		});


		}


	/**
	 * funcion para mostrar los datos de la cuenta en los cuadros de texto, para asi saber que e slo que se va a actualizar
	 *
	 */
	private void mostrarDatosField() {

		if (empleadoSeleccionado != null){
			fieldNombreEmpleado.setText(empleadoSeleccionado.getNombre());
	    	fieldCodigoEmpleado.setDisable(true);
	    	fieldIdentificacionEmpleado.setDisable(true);

		}
	};




    /**
     * funcion para crear mensajes de alerta, lo podemos usar en diferentes metodos
     * @param titulo
     * @param header
     * @param contenido
     * @param alertType
     */
    public void mostrarMensajeAlerta (String titulo, String header, String contenido, AlertType alertType){
    	Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();
    }



	/**
	 * funcion para validar si los campos de texto tienen informacion
	 * @param saldoAux
	 * @param tasaAux
	 * @param numeroCuenta1
	 * @param estrato
	 * @return
	 */
	private boolean datosValidados(String saldoAux, String tasaAux, String numeroCuenta1, String estrato) {
		String notificacion = "";
		if(saldoAux == null || saldoAux.equals("")){
			notificacion+= "El dato es invalido";
		}
		if(tasaAux == null || tasaAux.equals("")){
			notificacion+= "El dato es invalido";
		}
		if(numeroCuenta1 == null || numeroCuenta1.equals("")){
			notificacion+= "El dato es invalido";
		}
		if(estrato == null || estrato.equals("")){
			notificacion+= "El dato es invalido";
		}
		if(notificacion.equals("") || notificacion == null){
			return true;
		}
	return false;



	}



/////////////////////////////////////////////////////
	/**
	 * Atributos pertenecientes a empleados
	 *
	 */
    @FXML
    private Button btnEliminar;


    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnActualizar;
    @FXML
    private Button btnMenu;


    @FXML
    private TextField fieldNombreEmpleado;


    @FXML
    private TextField fieldIdentificacionEmpleado;

    @FXML
    private TableColumn<Empleado, String> columnaNombreEmpleado;


    @FXML
    private TableColumn<Empleado, String> columnaCodigoEmpleado;

    @FXML
    private TableColumn<Empleado, String> columnaIdentificacionEmpleado;

    @FXML
    private TextField fieldCodigoEmpleado;

    @FXML
    private TableView<Empleado> tableViewsEmpleado;



/////////////////////////////////////////////////////////////////////////

    /**
     * funciones encargadas de la gestion de empleados
     * @param event
     */



    @FXML
    void actualizarEvent(ActionEvent event) {
    	actualizarEmpleadoAction();
    }

    private void actualizarEmpleadoAction(){
    	String nombreEmpleado = fieldNombreEmpleado.getText();
    	String idEmpleado = fieldCodigoEmpleado.getText();
    	String identificacion = fieldIdentificacionEmpleado.getText();
       	if(empleadoSeleccionado != null){
	    	if(datosValidados(nombreEmpleado, "aa", "aa", "AA")){
	    		mfm.actualizarEmpleado(nombreEmpleado, idEmpleado);
	    		empleadoSeleccionado.setNombre(nombreEmpleado);
	    		tableViewsEmpleado.refresh();
	    	}
    	}
    }

	ObservableList <Empleado> listadoEmpleados = FXCollections.observableArrayList();

    @FXML
    void agregarCuentaEvent(ActionEvent event) {
    	String nombreEmpleado = fieldNombreEmpleado.getText();
    	String idEmpleado = fieldCodigoEmpleado.getText();
    	String identificacion = fieldIdentificacionEmpleado.getText();
    	if(datosValidados(nombreEmpleado, idEmpleado, identificacion, "hola")){
            crearEmpleado(nombreEmpleado, identificacion, idEmpleado);
            tableViewsEmpleado.setItems(listadoEmpleados);
            fieldNombreEmpleado.setText("");
            fieldCodigoEmpleado.setText("");
            fieldIdentificacionEmpleado.setText("");

    	}
    	else {
    		mostrarMensajeAlerta("Datos invalidos", "Datos insuficientes", "La cuenta no se puede crear debido a una insuficiencia en los datos ", AlertType.WARNING);
    	}
    }


    private void crearEmpleado (String nombreEmpleado, String idEmpleado, String identificacion){
    	Empleado empleado = mfm.crearEmpleado(nombreEmpleado, identificacion, idEmpleado);
    	if(empleado != null){
    		listadoEmpleados.add(empleado);
    		mostrarMensajeAlerta("Notificacion ", "Registro exitoso", "El empleado: " + idEmpleado +" ha sido registrada" , AlertType.INFORMATION);
    	}
    	else{
    		mostrarMensajeAlerta("Notificacion ", "Registro invalido", "El empleado: " + idEmpleado  + "  No ha sido registrada", AlertType.WARNING);

    	}
    }

    @FXML
    void eliminarEvent(ActionEvent event) {
    	eliminarEmpleadoAction ();
    }

    private void eliminarEmpleadoAction (){
    	if (empleadoSeleccionado != null){
    		mfm.eliminarEmpleado(empleadoSeleccionado.getIdEmpleado());
    		mostrarMensajeAlerta("Cuenta eliminada ", "Cuenta seleccion ", "La cuenta seleccionada se elimino correctamente ", AlertType.INFORMATION);
    		listadoEmpleados.remove(empleadoSeleccionado);
    	}
    	else{
    		mostrarMensajeAlerta("Cuenta seleccion ", "Cuenta seleccion ", "No se ha realizado ninguna seleccion", AlertType.WARNING);
    	}
    }




    //////////////////////////////////////////////////////
    /**
     * Funciones y parametros encargados de la navegabilidad entre ventanas
     * @param event
     */

    @FXML
    void volverevent(ActionEvent event) {
    	menuPrincipalController.show();
    	this.stage.close();
    }






    private MenuPrincipalController menuPrincipalController;
    private Stage stage;

	public void init(Stage stage, MenuPrincipalController menuPrincipalController) {
		this.menuPrincipalController = menuPrincipalController;
		this.stage = stage;
	}





}
