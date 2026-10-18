package com.joctan.ejercicio_1_2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    
    @FXML TextField caja;
    
    @FXML Label e500;
    @FXML Label e200;
    @FXML Label e100;
    @FXML Label e50;
    @FXML Label e20;
    @FXML Label e10;
    @FXML Label e5;
    @FXML Label e2;
    @FXML Label e1;
    
    @FXML
    private void mostrar() throws IOException {
        
        // obtener caja y luego a int
        String dinerostring = caja.getText();
        int numero = Integer.parseInt(dinerostring);
           
        
        // proceso numeros 
        int bi500 = numero/500;
        numero = numero%500;
        
        int bi200 = numero/200;
        numero = numero%200;
        
        int bi100 = numero/100;
        numero = numero%100;
        
        int bi50 = numero/50;
        numero = numero%50;
        
        int bi20 = numero/20;
        numero = numero%20;
        
        int bi10 = numero/10;
        numero = numero%10;
        
        int bi5 = numero/5;
        numero = numero%5;
        
        int bi2 = numero/2;
        numero = numero%2;
        
        int bi1 = numero/1;
        numero = numero%1;
        
        
        e500.setText(""+bi500);
        e200.setText(""+ bi200);        
        e100.setText(""+bi100);
        e50.setText(""+bi50);
        e20.setText(""+bi20);
        e10.setText(""+bi10);
        e5.setText(""+bi5);        
        e2.setText(""+bi2);        
        e1.setText(""+bi1);        
    }
    
    @FXML
    private void cancelar() throws IOException {
        caja.setText("");
        
        e500.setText("Cantidad");
        e200.setText("Cantidad");        
        e100.setText("Cantidad");
        e50.setText("Cantidad");
        e20.setText("Cantidad");
        e10.setText("Cantidad");
        e5.setText("Cantidad");        
        e2.setText("Cantidad");        
        e1.setText("Cantidad");        
    }
}
