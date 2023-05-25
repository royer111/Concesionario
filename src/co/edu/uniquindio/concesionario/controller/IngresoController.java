package co.edu.uniquindio.concesionario.controller;

import co.edu.uniquindio.concesionario.aplication.ConcesionarioAplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class IngresoController {

    @FXML
    private Button btnCambioContrasena;

    @FXML
    private Button btnIntgresar;

    @FXML
    private TextField fieldContrasena;

    @FXML
    private TextField fieldUsuario;

	private ConcesionarioAplicacion concesionarioAplicacion;

	private Stage stage;
    @FXML
    void cambiarContrasenaEvent(ActionEvent event) {

    }

    @FXML
    void ingresarEvent(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/MenuPrincipal.fxml"));
			Parent root = loader.load();
	        MenuPrincipalController menuController = loader.getController();
	        Scene scene = new Scene(root);
	        Stage stage = new Stage();
	        stage.setScene(scene);
	        menuController.init(stage, this);
	        stage.show();
	        this.stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	public void show() {
		this.stage.show();
	}

	public void setStage(Stage primaryStage) {
		this.stage = primaryStage;
	}

}
