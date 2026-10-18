package com.joctan.ejercicio_1_4;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML       
    private ListView<Object> lista; // object para aceptar strings e ints
    
    @FXML TextField caja;
    
    
    
    
    @FXML
    private void calcular() throws IOException {
        String numero = caja.getText(); // lo de la caja
        int numeroENTERO = Integer.parseInt(numero); // convertirlo a entero
        
        
        for (int i = 1; i<11; i++){
            int resultado = numeroENTERO * i; // operación
            
            lista.getItems().add(String.format("%d x %d = %d", numeroENTERO, i,resultado));
            
        }
        

    }
    
    
    @FXML
    private void borrar() throws IOException {
           caja.setText("");
           
           lista.getItems().clear();

    }
    
    
    
    
    
    
    
    
    
}
