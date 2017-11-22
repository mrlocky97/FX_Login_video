package VideoFX;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controlador implements Initializable {
	@FXML
	private MediaView mediaView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media1 = new Media(getClass().getResource("Video/Gente Asombrosa - Deportes Extremos.mp4").toExternalForm());
		MediaPlayer player1 = new MediaPlayer(media1);
		mediaView.setMediaPlayer(player1);
		player1.setVolume(0);
		player1.play();
	}

}
