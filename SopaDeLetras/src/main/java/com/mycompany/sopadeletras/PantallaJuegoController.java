                                                                                                                                                                                                                                                                                                                                                                                                                             package com.mycompany.sopadeletras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.sopadeletras.Estructuras.ArrayList;
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
    private MapaMatriz m2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        GridPane tabla = new GridPane();
        tabla.add(new Label("ksknd"),0,0);
        Panel.setCenter(tabla);
    }    
    public void crearTabla(GridPane panel){
        MapaMatriz m1 = new MapaMatriz();
        Integer[] clave = new Integer[2];
        Random r = new Random();
        ArrayList<Integer[]> claves = new ArrayList<>();
        claves.add(claves.size()-1, clave);
        Integer columnas = InicioController.getColumnas();
        Integer filas = InicioController.getFilas();
        Integer[] column = new Integer[columnas];
        Integer[] row = new Integer[filas];
        for(Integer i =1;i<=columnas;i++){
            clave[0]=i;
            for(Integer a =1 ; a<=filas;a++){
                clave[1]=a;
                char c = (char)(r.nextInt(26) + 'a');
                m1.put(clave, c);
            }
        }
    }
    public void proyectarMatriz(MapaMatriz m3 ,GridPane panel){
        
    }
}
