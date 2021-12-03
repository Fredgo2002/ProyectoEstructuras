                                                                                                                                                                                                                                                                                                                                                                                                                             package com.mycompany.sopadeletras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.sopadeletras.Estructuras.ArrayList;
import com.mycompany.sopadeletras.Estructuras.CircularLinkedList;
import com.mycompany.sopadeletras.Estructuras.DoublyCircularLinkedList;
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
import com.mycompany.sopadeletras.Estructuras.SinglyLinkedList;
import com.mycompany.tallercolas.model.Entry;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.random;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                            

/**
 * FXML Controller class
 *
 * @author User
 */
public class PantallaJuegoController implements Initializable {

    private MapaMatriz m2= new MapaMatriz();
    private GridPane Matriz = new GridPane();
    private Integer columnas = InicioController.getColumnas();
    private Integer filas = InicioController.getFilas();
    @FXML
    private BorderPane PanelBorder;
    @FXML
    private Button botonPuntaje;
    private ArrayList<DoublyCircularLinkedList> botonesC = new ArrayList<>();




    
    
    

    



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            crearTabla(Matriz);
        } catch (IOException ex) {
            Logger.getLogger(PantallaJuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Matriz.setMaxWidth(PanelBorder.getPrefWidth());
        PanelBorder.setCenter(Matriz);
        
  
    

        
        
    }    
    public void crearTabla(GridPane panel) throws IOException{
        MapaMatriz m1 = new MapaMatriz();
        Integer[] clave = new Integer[2];
        Random r = new Random();
        ArrayList<CircularLinkedList<Button>>  botonesC = completarMatriz();
        System.out.println(botonesC.size());
        int contador = 0;
        while(contador<botonesC.size()){
            CircularLinkedList<Button> temp = new CircularLinkedList<>(); 
           palabrasRecursivo(ingresarPalabra(),botonesC);
           System.out.println(ingresarPalabra().get(0));
           temp = botonesC.get(contador);
           
        for(Integer a =0; a<filas;a++){
            System.out.println(temp.isEmpty());
                    if(!temp.isEmpty()){
                        Button btn1 = temp.removeFirst();
                        temp.addLast(btn1);
                        Matriz.addColumn(contador, btn1);
                    }
        } contador++;
            
        }
        
    }
          
        
    
    



    @FXML
    private void validarEnviarPuntaje(MouseEvent event) {
    }
               
    
    
    private ArrayList<CircularLinkedList<Button>> completarMatriz() throws IOException{
        ArrayList<CircularLinkedList<Button>>  botonesC = new ArrayList<>() ;
        ArrayList<CircularLinkedList<Button>>  botonesF = new ArrayList<>() ;
        Random ra = new Random();
        for(Integer r =0 ; r < columnas;r++){ 
            CircularLinkedList<Button> temp =new CircularLinkedList<>();
            for(Integer w =0 ; w < filas ; w++){
                Character c = (char) (ra.nextInt(26) + 'a');
                Button btc1 = new Button(c.toString());
                temp.addFirst(btc1);
              
            }botonesC.add(r, temp);
        }return botonesC;
    }
    public ArrayList<String> ingresarPalabra(int valor) throws FileNotFoundException, IOException{
        ArrayList<String> palabrasS= new ArrayList<>();
         File archivo = new File("C:\\Users\\User\\Desktop\\Prueba\\Palabras.txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         String linea;
         int contador=0;
         while((linea=br.readLine())!=null){
             if(linea.length()<=valor){
             palabrasS.add(contador, linea);
             contador++;
             }
            
    }return palabrasS;
    }
    public ArrayList<String> ingresarPalabra() throws FileNotFoundException, IOException{
        ArrayList<String> palabrasS= new ArrayList<>();
        File archivo = new File ("C:\\Users\\User\\Desktop\\Prueba\\Palabras.txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         String linea;
         int contador=0;
         while((linea=br.readLine())!=null){
             palabrasS.add(contador, linea);
             contador++;
             }
            return palabrasS;
    }
    
    public void palabrasRecursivo(ArrayList<String> content, ArrayList<CircularLinkedList<Button>>  btnc) throws IOException{
                content = ingresarPalabra(100);
                Stack<Button>pila = new Stack<>();
                
                Random ra = new Random();        
        for(int i =0;i<content.size();i++){
             boolean b1 =ra.nextBoolean();
            String hola = content.get(i);
            CircularLinkedList<Button> temp = new CircularLinkedList<>(); 
            if(b1){
                content= ingresarPalabra(columnas);
                int valorEntero = (int) Math.floor(Math.random()*(filas-1));
                temp = btnc.get(valorEntero);
                
                for(Integer w =0 ; w < hola.length() ; w++){
                 char[] c = hola.toCharArray();
                 Character cf = c[w];
                Button bnn = temp.removeFirst();
                bnn.setText(cf.toString());
                temp.addLast(bnn);
              
            }
            }else{
                content= ingresarPalabra(filas);
                int valorEntero = (int) Math.floor(Math.random()*(columnas-1));
                content= ingresarPalabra(columnas);
                temp = btnc.get(valorEntero);  
                for(Integer w =0 ; w < hola.length()-1 ; w++){
                 char[] c = hola.toCharArray();
                 Character cf = c[w];
                Button bnn = temp.removeFirst();
                bnn.setText(cf.toString());
                temp.addLast(bnn);
                               
                    
           
                    

                
            }
            }
        }
}
}

        
    

        
     
    
        
        
        

    
   
        
    
   
 

