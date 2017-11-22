package VideoFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class main extends Application {
	// declaro e panel
	private AnchorPane myPanel;
	Stage esenario;

	@Override
	public void start(Stage primaryStage) {

		FXMLLoader loader = new FXMLLoader(main.class.getResource("FXVideoSebas.fxml"));
		try {
			//myPanel = (AnchorPane) loader.load();
			myPanel = loader.load();
			Scene Esena = new Scene(myPanel);
			primaryStage.setTitle("FX_VideoSebas");
			primaryStage.setScene(Esena);
			primaryStage.show();
			this.esenario = primaryStage;
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
