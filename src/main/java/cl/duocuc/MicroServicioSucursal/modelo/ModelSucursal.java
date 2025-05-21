package cl.duocuc.MicroServicioSucursal.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Sucursal")

public class ModelSucursal {
    @Id

    private long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String horario_apertura;
    private String horario_cierre;

    @OneToMany(mappedBy="sucursal",cascade = CascadeType.ALL)

    private List<ModelInventario> inventario;

    @OneToMany(mappedBy="sucursal",cascade = CascadeType.ALL)

    private List<ModelEmpleado> empleados;

}
