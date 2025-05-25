package cl.duocuc.MicroServicioSucursal.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="producto")
public class ModelProducto {
     @Id
     private long id;
     private String nombre;
     private String descripcion;
     private int stock;
     private int precio;


     @ManyToOne
     @JoinColumn(name="id_inventario")

        private ModelInventario inventario;



}
