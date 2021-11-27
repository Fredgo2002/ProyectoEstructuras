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
import com.mycompany.sopadeletras.Estructuras.DoublyCircularNodeList;
import java.util.HashSet;
import java.util.Set;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                            

/**
 * FXML Controller class
 *
 * @author User
 */
public class PantallaJuegoController implements Initializable {

    private MapaMatriz m2;
    private GridPane Matriz = new GridPane();
    private Integer columnas = InicioController.getColumnas();
    private Integer filas = InicioController.getFilas();
    @FXML
    private BorderPane PanelBorder;

    



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        crearTabla(Matriz);
        Matriz.setMaxWidth(PanelBorder.getPrefWidth());
        PanelBorder.setCenter(Matriz);
        
  
    

        
        
    }    
    public void crearTabla(GridPane panel){
        DoublyCircularNodeList d1 = new DoublyCircularNodeList();// contiene las columnas
        MapaMatriz m1 = new MapaMatriz();
        Integer[] clave = new Integer[2];
        Random r = new Random();
        System.out.println(Matriz.getHgap()+"y"+Matriz.getVgap());
        for(Integer i =0;i<columnas;i++){
            clave[0]=i;           
            for(Integer a =0 ; a<filas;a++){
                clave[1]=a;
                Character c = (char)(r.nextInt(26) + 'a'); 
                System.out.println(i+" "+a);
                System.out.println(c);
                Button b1=new Button(c.toString());  
               /* b1.setMaxWidth(Double.MAX_VALUE);
                b1.setMaxHeight(Double.MAX_VALUE);*/
                panel.add(b1, i, a);              
                m1.put(clave, c);
            }   
                
        }     

    }
    public void proyectarMatriz(MapaMatriz m3 ,GridPane panel){
        
    }
}
