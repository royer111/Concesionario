package co.edu.uniquindio.concesionario.aplication;


import co.edu.uniquindio.concesionario.controller.ConcesionarioController;
import co.edu.uniquindio.concesionario.controller.IngresoController;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class ConcesionarioAplicacion extends Application {
	Stage primaryStage;
	@Override
	public void start(Stage primaryStage)   {
		this.primaryStage = primaryStage;
		mostrarVentanaPrincial();
	}

	private void mostrarVentanaPrincial()   {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/LogConcesionario.fxml"));
			Parent root = loader.load();
	        Scene scene = new Scene(root);
			IngresoController loginController = loader.getController();
	        loginController.setConcesionarioAplicacion(this);
	        primaryStage.setScene(scene);
	        primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}



	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}


	public static void main(String[] args)  {
		launch(args);

}



}
