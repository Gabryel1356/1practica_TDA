package TDA.MSventas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDA.MSventas.model.modelVentas;
import TDA.MSventas.repository.IVentasRepository;

@Service
public class VentasService {

    @Autowired
    IVentasRepository ventaRepository;
    
    public List<modelVentas>  getVentas() {       
        return (List<modelVentas>) ventaRepository.findAll();
    }

    public modelVentas PostVentas(modelVentas ventas){
        return ventaRepository.save(ventas);
    }


   


}
