package TDA.MSventas.dto;

import java.io.Serializable;

public class AuthRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String importe;
    private String fecha;
    private String empleado;
    private String cliente;
 
    public AuthRequest() {
 
    }
    public AuthRequest(String importe, String fecha, String empleado, String cliente) {
        this.setImporte(importe);
        this.setFecha(fecha);
        this.setEmpleado(empleado);
        this.setCliente(cliente);
    }
 
    public String getImporte() {
        return importe;
    }
    public void setImporte(String importe) {
        this.importe = importe;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getEmpleado() {
        return empleado;
    }
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
