package cl.duocuc.MicroServicioSucursal.controlador;


import cl.duocuc.MicroServicioSucursal.repositorio.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepository empleadorepository;


   //@PostMapping
}
