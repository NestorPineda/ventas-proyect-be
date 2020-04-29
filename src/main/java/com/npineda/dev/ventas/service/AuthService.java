package com.npineda.dev.ventas.service;


import com.npineda.dev.ventas.model.LoginBody;
import com.npineda.dev.ventas.model.LoginResponse;
import com.npineda.dev.ventas.model.Usuario;
import com.npineda.dev.ventas.model.Vendedor;
import com.npineda.dev.ventas.repository.UsuarioRepository;
import com.npineda.dev.ventas.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    VendedorRepository vendedorRepository;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody LoginBody loginBody) {
        LoginResponse loginResponse = new LoginResponse();
        List<Usuario> users = usuarioRepository.findByNombreAndContrasena(loginBody.getNombre(), loginBody.getContrasena());
        if (!users.isEmpty()) {
            loginResponse.setIsLogged(true);
            loginResponse.setRol("Admin");
            return loginResponse;
        }
        List<Vendedor> vendedores = vendedorRepository.findByNombreAndContrasena(loginBody.getNombre(), loginBody.getContrasena());
        if (!vendedores.isEmpty()) {
            loginResponse.setIsLogged(true);
            loginResponse.setVendedor(vendedores.get(0));
            loginResponse.setRol("Vendedor");
            return loginResponse;
        }
        return loginResponse;
    }
}
