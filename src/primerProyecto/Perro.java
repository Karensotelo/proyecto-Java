package primerProyecto;

import java.math.BigDecimal;
import java.util.Date;

public class Perro {
    
    String nombre;
    String color;
    int edad;
    String raza;
    String colorDeOjos;
    Date fechaDeNacimiento;//Si tabulas, no pasa nada
    BigDecimal peso;
    
    public int edad() {
        return edad;
    }
    
    public BigDecimal getPeso() {
        return peso;
    }
    
    //Hols
    
    public String getNombre() {
        return nombre;
    }
    
    public void darNombreAlPerro(String nombrePerro) {
        this.nombre = nombrePerro;
    }
}