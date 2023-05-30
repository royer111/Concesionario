package co.edu.uniquindio.concesionario.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RegistroVehiculosController {

	@FXML
    private Button btnMenuPrincipal;


    private MenuPrincipalController menuPrincipalController;
    private Stage stage;

	public void init(Stage stage, MenuPrincipalController menuPrincipalController) {
		this.menuPrincipalController = menuPrincipalController;
		this.stage = stage;
	}

    @FXML
    void volverEvent(ActionEvent event) {
    	menuPrincipalController.show();
    	this.stage.close();
    }

}
