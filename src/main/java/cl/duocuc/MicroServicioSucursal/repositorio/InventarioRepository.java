package cl.duocuc.MicroServicioSucursal.repositorio;

import cl.duocuc.MicroServicioSucursal.modelo.ModelInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<ModelInventario, Long> {

    // Por ejemplo, buscar inventario por sucursal, etc.
}
