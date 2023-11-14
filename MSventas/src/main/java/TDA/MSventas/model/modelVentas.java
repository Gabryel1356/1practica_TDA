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
    @Column(name="idventa")
    public int idVenta;

    @Column(name="importe")
    public String importe;

    @Column(name="fecha")
    public String fecha;

  @Column(name="empleado")
    public String empleado;

  @Column(name="cliente")
    public String cliente;




public int getIdVentas() {
    return idVenta;
}
public void setIdVentas(int idVenta) {
    this.idVenta = idVenta;
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
