package com.mycompany.sopadeletras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PantallaJuegoController implements Initializable {

    @FXML
    private BorderPane Panel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        GridPane tabla = new GridPane();
        tabla.add(new Label("ksknd"),0,0);
        Panel.setCenter(tabla);
    }    
    
}
