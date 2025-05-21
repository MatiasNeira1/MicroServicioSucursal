package cl.duocuc.MicroServicioSucursal.controlador;

import cl.duocuc.MicroServicioSucursal.repositorio.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")

public class SucursalControlador {

    @Autowired
    private SucursalRepository sucursalrepository;

   // @PostMapping("/create")
}
