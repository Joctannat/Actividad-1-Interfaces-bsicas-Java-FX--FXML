package com.joctan.ejercicio1_3;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList; // arreglos dinamicos

public class PrimaryController {
    
    
    @FXML TextField cajaCifras;
    @FXML TextField cajaCimpares;
    @FXML TextField cajaCpares;
    @FXML TextField cajasumaT;
    @FXML TextField cajacM;
    @FXML TextField cajacMENOR;    
    
    @FXML TextField cajatexto;   

    @FXML 
    private ListView<Integer> tablaesa; // CREAR LA TABLA CON LA COSA QUE DESPLAZA , RECIBE ENTEROS
    
    
    
    @FXML
    private void analizar() throws IOException {
        
        String CAJAnumero = cajatexto.getText(); // OBTENER NUMERO DEL USUARIO
        int numero = Integer.parseInt(CAJAnumero); // CONVERTIRLO A INT
 
        ArrayList<Integer>arregloDIG = new ArrayList<>(); //arreglo para guardar los digitos
        
        int temp=numero;
        int sumaTOTAL =0;
        int contador = 0; // contador para la cantidad de cifras
        while (temp>0){
            int digito = temp%10;
       
            sumaTOTAL = sumaTOTAL + digito;
            
            arregloDIG.add(digito);
            contador = contador + 1;
            temp = temp/10;     // condición para el while
            
        }
        
        int tam = arregloDIG.size(); // TAMAÑO DEL ARREGLO
        
        // CANTIDAD DE CIFRAS
        String cantidaddedigitos = String.valueOf(contador);
        cajaCifras.setText(cantidaddedigitos);
        
        // SUMA DE TODAS LAS CIFRAS
        String sumatotal = String.valueOf(sumaTOTAL);
        cajasumaT.setText(sumatotal);        
        
        
        // SUMA CIFRAS PARES
        int Nasupares = 0;
        for (int a = 0; a<tam; a++) {
            if (arregloDIG.get(a) % 2 ==0){
                Nasupares = Nasupares + arregloDIG.get(a);
            }
        }
        String sumapares = String.valueOf(Nasupares);
        cajaCpares.setText(sumapares);           
        
        
        
        // SUMA CIFRAS IMPARES
        int Nasuimpares = 0;
        for (int a = 0; a<tam; a++) {
            if (arregloDIG.get(a) % 2 !=0){
                Nasuimpares = Nasuimpares + arregloDIG.get(a);
            }
        }
        String sumaimpares = String.valueOf(Nasuimpares);
        cajaCimpares.setText(sumaimpares);              

        
        // CIFRA MAYOR
        int mayor = arregloDIG.get(0);
        for (int z = 0; z<tam; z++){
            if (mayor<arregloDIG.get(z)){
                mayor = arregloDIG.get(z);
            }
        }
        String MAX = String.valueOf(mayor);
        cajacM.setText(MAX);             
        
        
        // CIFRA MENOR
        int menor = arregloDIG.get(0);
        for (int z = 0; z<tam; z++){
            if (menor>arregloDIG.get(z)){
                menor = arregloDIG.get(z);
            }
        }
        String MIN = String.valueOf(menor);
        cajacMENOR.setText(MIN);           
        

        // DIVISORES
        for (int u = 1; u<=numero;u++){
            if(numero % u == 0){
                tablaesa.getItems().add(u);
 
            }
        }
     
        
   
        
    }
    
    
    
    
    
    
    @FXML
    private void limpiar() throws IOException {
        
        cajatexto.setText("");
        
        cajaCifras.setText("");
        cajaCimpares.setText("");
        cajaCpares.setText("");
        cajasumaT.setText("");
        cajacM.setText("");
        cajacMENOR.setText("");
        
        tablaesa.getItems().clear();
        
    }
}
