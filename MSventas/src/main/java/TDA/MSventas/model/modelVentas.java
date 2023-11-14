package TDA.MSventas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="atencion")
public class modelVentas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int idventa;
    private String importe;
    private String fecha;
    private String empleado;
    private String cliente;
 




public int getIdVentas() {
    return idventa;
}
public void setIdVentas(int idVenta) {
    this.idventa = idVenta;
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
