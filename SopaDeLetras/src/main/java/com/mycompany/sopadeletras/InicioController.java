/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sopadeletras;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
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
    private void startGame(MouseEvent event) {
        /// creacion de 
    }
    
}
