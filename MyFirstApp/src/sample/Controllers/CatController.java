package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class CatController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image_button_Cat;

    @FXML
    void initialize() {
        assert image_button_Cat != null : "fx:id=\"image_button_Cat\" was not injected: check your FXML file 'app.fxml'.";

    }
}

