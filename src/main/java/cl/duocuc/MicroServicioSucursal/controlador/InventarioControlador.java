package cl.duocuc.MicroServicioSucursal.controlador;


import cl.duocuc.MicroServicioSucursal.modelo.ModelInventario;
import cl.duocuc.MicroServicioSucursal.repositorio.InventarioRepository;
import cl.duocuc.MicroServicioSucursal.servicio.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario")
public class InventarioControlador {

    @Autowired

    private InventarioService inventarioservice;


    @PostMapping("/create")
    public ResponseEntity <ModelInventario> createProducto(@RequestBody ModelInventario producto){
        try{
            ModelInventario productocreado=inventarioservice.createProducto(producto);
            return ResponseEntity.status(HttpStatus.CREATED).body(productocreado);

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
        //return ResponseEntity.ok(inventarioservice.createProducto(producto));
    }

}
