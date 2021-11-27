                                                                                                                                                                                                                                                                                                                                                                                                                             package com.mycompany.sopadeletras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.sopadeletras.Estructuras.MapaMatriz;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import java.lang.Math;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
                                                                                                                                                                                                                                                                                                                                                                                                                            

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
    public void crearTabla(){
        MapaMatriz m1 ;
        
        Integer[] clave;
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        Integer columnas = InicioController.getColumnas();
        Integer filas = InicioController.getFilas();
        for(int i =0;i<=columnas;i++){
            for(int a =0 ; a<=filas;a++){
                
                
            }
        }
        
    }
}
