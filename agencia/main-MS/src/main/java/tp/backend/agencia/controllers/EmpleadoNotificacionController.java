package tp.backend.agencia.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.backend.agencia.entities.EmpleadoNotificacion;
import tp.backend.agencia.services.interfaces.EmpleadoNotificacionService;
import tp.backend.agencia.support.EmpleadoNotificacionId;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/agencia/empleadoNotificacion")
@RequiredArgsConstructor
public class EmpleadoNotificacionController {

    private final EmpleadoNotificacionService empleadoNotificacionService;

    @GetMapping("{id}")
    public ResponseEntity<EmpleadoNotificacion> getEmpleadoNotificacionById(@PathVariable EmpleadoNotificacionId id) {
        try{
            EmpleadoNotificacion result = empleadoNotificacionService.findById(id);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
        catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
