package TDA.MSventas.dto;

import java.io.Serializable;
 
public class VentasResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private final String ventas;
 
    public VentasResponse(String ventas) {
        this.ventas = ventas;    
    
    }


    public String getVentas() {
        return ventas ;
    }


  

}
