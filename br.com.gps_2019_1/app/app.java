/**
 * 
 */
package app;

import java.io.IOException;

import dao.DAODado;
import dao.DAOEstruturaPesquisa;
import dao.DAOPesquisa;
import dao.DAOUsuario;
import facade.Facade;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author ayrtons
 *
 */
public class app extends Application {

	private static Pane login;
	private static Pane inicio;

	private static Scene sceneLogin;
	private static Scene sceneInicio;

	private static Stage stage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facade.getInstance();
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		try {

			inicio = FXMLLoader.load(getClass().getClassLoader().getResource("view/Inicio.fxml"));
			login = FXMLLoader.load(getClass().getClassLoader().getResource("view/Login.fxml"));

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		sceneLogin = new Scene(login);
		sceneInicio = new Scene(inicio);
		
		primaryStage.setScene(sceneLogin);
//		primaryStage.setScene(sceneInicio);
		primaryStage.centerOnScreen();
		primaryStage.show();
		stage = primaryStage;
		
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		System.exit(0);
	}

	public static void changeStage(String nameStage) {
		
		if(nameStage.equals("Inicio")) {
			stage.setScene(sceneInicio);
		}
		
		if(nameStage.equals("Login")) {
			stage.setScene(sceneLogin);
		}
		
	}
	
	/**
	 * 
	 * @return the Pane inicio
	 */
	public static Pane getInicio() {
		return inicio;
	}

	/**
	 * @return the Pane login
	 */
	public static Pane getLogin() {
		return login;
	}
	
}
