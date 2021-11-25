/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.ImageIcon;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InicioController implements Initializable {

    @FXML
    private BorderPane Panel;
    @FXML
    private ImageView imagen;
    @FXML
    private TextField tamaño;
    @FXML
    private Button Start;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image = new Image("/sopasdeletras_logo.png");
        imagen.setImage(image);
    }    

    @FXML
    private void startGame(MouseEvent event) throws IOException {
        String dimensiones = tamaño.getText();
        String[]dimen =dimensiones.split("x");
        Integer filas = Integer.parseInt(dimen[0]);
        Integer columnas = Integer.parseInt(dimen[0]);
        Parent root = FXMLLoader.load(getClass().getResource("pantallaJuego.fxml"));
        Scene scene = new Scene(root);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.toFront();
        appStage.show();
        
        
    }
    
}
