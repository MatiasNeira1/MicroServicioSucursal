package cl.duocuc.MicroServicioSucursal.controlador;

import cl.duocuc.MicroServicioSucursal.modelo.ModelSucursal;
import cl.duocuc.MicroServicioSucursal.repositorio.SucursalRepository;
import cl.duocuc.MicroServicioSucursal.servicio.SucursalServicio;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/sucursal")

public class SucursalControlador {

    @Autowired
    private SucursalServicio sucursalservicio;

   @PostMapping("/create")
    public ResponseEntity<ModelSucursal> createSucursal(@RequestBody ModelSucursal sucursal){

       try{
           ModelSucursal sucursal_creada=sucursalservicio.createSucursal(sucursal);
           return ResponseEntity.status(HttpStatus.CREATED).body(sucursal_creada);

       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

       }

   }

    public ResponseEntity<List<ModelSucursal>>getAllSucursales(){
       try{
          List<ModelSucursal> sucursales_encontradas=sucursalservicio.getAll();
          return ResponseEntity.status(HttpStatus.FOUND).body(sucursales_encontradas);

       }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }

    }




}
