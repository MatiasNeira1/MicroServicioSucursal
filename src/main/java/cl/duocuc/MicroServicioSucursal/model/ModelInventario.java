package cl.duocuc.MicroServicioSucursal.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="inventario")

public class ModelInventario {
    @Id

    private long id;
    private String nombre;
    private int stock;
    private int precio;

    @ManyToOne
    @JoinColumn(name="id_sucursal")
    private ModelSucursal sucursal;

}
