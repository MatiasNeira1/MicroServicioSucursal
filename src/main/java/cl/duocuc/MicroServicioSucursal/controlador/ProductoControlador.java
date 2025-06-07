package cl.duocuc.MicroServicioSucursal.controlador;


import cl.duocuc.MicroServicioSucursal.modelo.ModelProducto;
import cl.duocuc.MicroServicioSucursal.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @PostMapping("/crear/{id_inv}")
    public ResponseEntity<ModelProducto> crearProducto(@PathVariable Long id_inv,@RequestBody ModelProducto producto) {
        try {
            ModelProducto productoCreado = productoServicio.crearProducto(id_inv,producto);
            return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
