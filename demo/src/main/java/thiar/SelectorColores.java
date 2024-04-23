package thiar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class SelectorColores implements Initializable {
    
    @FXML
    GridPane gridPanePrincipal;

    @FXML
    HBox hBoxPrincipal;

    @FXML
    GridPane gridPaneColores;

    @FXML
    Pane paneColores;

    @FXML
    Rectangle rectangulo;

    @FXML
    VBox vBoxPilaContenedores;

    @FXML
    HBox hBoxTextosRGB;

    @FXML
    Label labelR;

    @FXML
    Label labelG;

    @FXML
    Label labelB;

    @FXML
    HBox hBoxSliders;

    @FXML
    Slider sliderR;

    @FXML
    Slider sliderG;

    @FXML
    Slider sliderB;

    @FXML
    HBox hBoxTextField;

    @FXML
    TextField textFieldR;

    @FXML
    TextField textFieldG;

    @FXML
    TextField textFieldB;
    
    @FXML
    Label labelHexaRGB;

    @FXML
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        sliderR.setOnMouseDragged((evento -> {
            actualizarColor();
            textFieldR.setText(Integer.toString((int)sliderR.getValue()));
        }));
        sliderG.setOnMouseDragged((evento -> {
            actualizarColor();
            textFieldG.setText(Integer.toString((int)sliderG.getValue()));
        }));
        sliderB.setOnMouseDragged((evento -> {
            actualizarColor();
            textFieldB.setText(Integer.toString((int)sliderB.getValue()));
        }));
        labelHexaRGB.setText("Color: #000000");

    }

    @FXML
    public void actualizarColor() {
        
        double r = sliderR.getValue();
        double g = sliderG.getValue();
        double b = sliderB.getValue();

        String stringHexa = String.format("#%02x%02x%02x",(int) r, (int) g, (int) b);

        labelHexaRGB.setText("Color: " + stringHexa);
        rectangulo.setStyle(String.format("-fx-background-color: %s;", stringHexa));

    }



}