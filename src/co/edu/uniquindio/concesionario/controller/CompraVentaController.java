package co.edu.uniquindio.concesionario.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CompraVentaController {


    @FXML
    private Button btnMenuPrincipal;

    @FXML
    void menuPrincipalEvent(ActionEvent event) {
    	menuPrincipalController.show();
    	this.stage.close();
    }
	/////////////////////////////////////////////////////
    private MenuPrincipalController menuPrincipalController;
    private Stage stage;

	public void init(Stage stage, MenuPrincipalController menuPrincipalController) {
		this.menuPrincipalController = menuPrincipalController;
		this.stage = stage;
	}
}
