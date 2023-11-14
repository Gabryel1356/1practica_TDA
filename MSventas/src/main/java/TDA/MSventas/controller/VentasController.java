package TDA.MSventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import TDA.MSventas.model.modelVentas;
import TDA.MSventas.services.VentasService;


@RestController
@RequestMapping("/api/auth")
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

 


}
