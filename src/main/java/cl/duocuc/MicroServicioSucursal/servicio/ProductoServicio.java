package cl.duocuc.MicroServicioSucursal.servicio;


import cl.duocuc.MicroServicioSucursal.modelo.ModelInventario;
import cl.duocuc.MicroServicioSucursal.modelo.ModelProducto;
import cl.duocuc.MicroServicioSucursal.repositorio.InventarioRepository;
import cl.duocuc.MicroServicioSucursal.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public ModelProducto crearProducto(Long id_inventario, ModelProducto producto) {
        ModelInventario inventario = inventarioRepository.findById(id_inventario)
                .orElseThrow(() -> new RuntimeException("Inventario no existe"));

        producto.setInventario(inventario); // 💡

        return productoRepository.save(producto);
    }
}
