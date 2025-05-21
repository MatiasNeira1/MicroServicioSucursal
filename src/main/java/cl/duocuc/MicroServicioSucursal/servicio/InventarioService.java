package cl.duocuc.MicroServicioSucursal.servicio;

import cl.duocuc.MicroServicioSucursal.modelo.ModelInventario;
import cl.duocuc.MicroServicioSucursal.repositorio.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InventarioService {

    @Autowired

    InventarioRepository inventariorepository;

    public  ModelInventario createProducto(ModelInventario producto){
        return inventariorepository.save(producto);
    }


}
