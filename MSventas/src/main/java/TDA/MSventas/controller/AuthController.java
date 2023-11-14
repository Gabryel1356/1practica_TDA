package TDA.MSventas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDA.MSventas.model.modelVentas;
import TDA.MSventas.services.AuthService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authService;
    
    @GetMapping
    public List<modelVentas> get() {
        return authService.getAllUsers();
    }   
}
