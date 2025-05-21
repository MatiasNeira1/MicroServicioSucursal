package cl.duocuc.MicroServicioSucursal.repositorio;

import cl.duocuc.MicroServicioSucursal.modelo.ModelEmpleado;
import cl.duocuc.MicroServicioSucursal.modelo.ModelInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<ModelEmpleado, Long> {


}
