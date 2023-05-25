package co.edu.uniquindio.concesionario.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuPrincipalController {
    @FXML
    private Button btnCompraVenta;

    @FXML
    private Button btnRegistros;

    @FXML
    private Button btnTransacciones;
    @FXML
    private Button btnCerrarSesion;

    @FXML
    void compraVentaEvent(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/CompraVentaViews.fxml"));
			Parent root = loader.load();
	        CompraVentaController conpraVentaController = loader.getController();
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setScene(scene);
	        conpraVentaController.init(stage, this);
	        stage.show();
	        this.stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void registrosEvent(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/RegistroViews.fxml"));
			Parent root = loader.load();
	        ConcesionarioController concesionarioControlller = loader.getController();
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setScene(scene);
	        concesionarioControlller.init(stage, this);
	        stage.show();
	        this.stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void transaccionesEvent(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/TransaccionesViews.fxml"));
			Parent root = loader.load();
	        TransaccionesController transaccionesController = loader.getController();
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setScene(scene);
	        transaccionesController.init(stage, this);
	        stage.show();
	        this.stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }


    @FXML
    void cerrarSesionEvnet(ActionEvent event) {
    	ingresoController.show();
    	this.stage.close();
    }


	private Stage stage;
    private IngresoController ingresoController;



	public void init(Stage stage, IngresoController ingresoController) {
		this.ingresoController = ingresoController;
		this.stage = stage;

	}

	public void show() {
		this.stage.show();
	}

}
