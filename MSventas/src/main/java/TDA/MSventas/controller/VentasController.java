package TDA.MSventas.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import TDA.MSventas.model.modelVentas;
import TDA.MSventas.services.VentasService;


@RestController
@RequestMapping("/api/ventas")
public class VentasController {
    @Autowired
    VentasService VentaService;
    
    @GetMapping
    public List<modelVentas> get() {
        return VentaService.getVentas();
    }   
    @PostMapping()
    public modelVentas  PostVentas(@RequestBody modelVentas ventas){
        return this.VentaService.PostVentas(ventas);
    }

    @GetMapping( path = "/{id}")
    public Optional<modelVentas> obtenerUsuarioPorId(@PathVariable("id") int id) {
        return this.VentaService.getVentasPorId(id);
    }


    @PutMapping(path = "/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody modelVentas ventas) {
            VentaService.updateEmployee(id, ventas);
    }

    
    
    @DeleteMapping( path = "/{id}")
    public String  DeleteVentasPorid(@PathVariable("id") modelVentas id){
        boolean ok = this.VentaService.DeleteVentas(id);
        if (ok){
            return "Se eliminó la venta con id " + id;
        }else{
            return "No pudo eliminar la venta con id" + id;
        }
    }

    

 


}
