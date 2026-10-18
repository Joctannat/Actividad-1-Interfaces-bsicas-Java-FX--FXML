package com.joctan.ejercicio_1_5;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField alimentacion;
    @FXML TextField refrigerios;
    @FXML TextField transporte;
    @FXML TextField telefonia;
    @FXML TextField otros;
    
    @FXML TextField total;
    
    @FXML TextField gALTO;
    
    @FXML
    private void calcular() throws IOException {
        
        String c1 = alimentacion.getText();
        int cAlimentos = Integer.parseInt(c1);
        
        String c2 = refrigerios.getText();
        int cRefrigerios = Integer.parseInt(c2);
        
        String c3 = transporte.getText();
        int cTransporte = Integer.parseInt(c3);
        
        String c4 = telefonia.getText();
        int cTelefonia = Integer.parseInt(c4);
        
        String c5 = otros.getText();
        int cOtros = Integer.parseInt(c5);
        
        
        int suma = cAlimentos + cRefrigerios + cTransporte + cTelefonia + cOtros;

        
        total.setText(String.format("%d", suma));
        
        String mensaje="";
        int[] cosas = new int[5];
        cosas[0]=cAlimentos;
        cosas[1]=cRefrigerios;
        cosas[2]=cTransporte;
        cosas[3]=cTelefonia;
        cosas[4]=cOtros;
        
        int mayor= cosas[0]; 
        for(int i = 0; i<5; i++){
            if(mayor<cosas[i]){
                mayor = cosas[i];
            }
     
        }
        
        if(mayor == cosas[0]){
                mensaje = "Alimentación";
            }
            else if(mayor == cosas[1]){
                mensaje = "Refrigerios";
            }
            else if(mayor == cosas[2]){
                mensaje = "Transporte";
            }
            else if(mayor == cosas[3]){
                mensaje = "Telefonia";
            }
            else if(mayor == cosas[4]){
                mensaje = "Otros";
            }
        
        gALTO.setText(mensaje);
        
        
        
        
        
        
        
        
    }
    
    @FXML
    private void borrar() throws IOException {
    alimentacion.setText("");
    refrigerios.setText("");
    transporte.setText("");
    telefonia.setText("");
    otros.setText("");
    
    gALTO.setText("");
    total.setText("");   
    }
    
    
}



