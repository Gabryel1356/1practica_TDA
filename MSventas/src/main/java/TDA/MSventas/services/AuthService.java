package TDA.MSventas.services;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDA.MSventas.model.modelVentas;
import TDA.MSventas.repository.IAuthRepository;

@Service
public class AuthService {

    @Autowired
    IAuthRepository authRepository;
    
    public List<modelVentas>  getAllUsers() {       
        return (List<modelVentas>) authRepository.findAll();
    }
}
