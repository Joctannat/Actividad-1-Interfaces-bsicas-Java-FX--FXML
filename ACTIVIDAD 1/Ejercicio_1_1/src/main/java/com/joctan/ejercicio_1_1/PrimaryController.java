package com.joctan.ejercicio_1_1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/*
    IMPORTACIONES DE TIEMPO
*/
import java.time.LocalDate;
import java.time.Period; // para la resta de fechas
import java.time.format.DateTimeFormatter;
/*
    IMPORTACIONES DE TIEMPO
*/


public class PrimaryController {

    //el orden en el que salen : d/m/a
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    
    @FXML Label MostrarEdad;
    @FXML TextField caja;
    
    
    @FXML
    private void calcular() throws IOException {
        
        // guardar lo que pongo en la caja en la variable String FechaUsuario
        String fechaUSUARIO =caja.getText(); 
        
        // recibir fecha del usuario y ponerle formato
        LocalDate fecha = LocalDate.parse(fechaUSUARIO, formato); 
        
        // La fecha de hoy, para luego hacer operaciones
        LocalDate fechaHOY =LocalDate.of(2026, 10, 17);
        
        // Usar la clase period para la diferncia
        Period FechaCALCULADA = Period.between(fecha,fechaHOY);
        
        // sacar los años y los meses
        int annios = FechaCALCULADA.getYears();
        int meses= FechaCALCULADA.getMonths();

        MostrarEdad.setText("Tu edad es: "+ annios + " años, " + meses + " meses" );
        
        
    }
    
    

    @FXML
    private void limpiar() throws IOException {
        
        caja.setText("");
        MostrarEdad.setText("Tu edad");
    }
    
    
    
}
