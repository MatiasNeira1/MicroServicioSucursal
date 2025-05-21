package cl.duocuc.MicroServicioSucursal.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Empleado")

public class ModelEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String rut;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;
    private String correo;
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")

    private ModelSucursal sucursal;
}
