package tp.backend.agencia.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tp.backend.agencia.entities.Empleado;
import tp.backend.agencia.entities.EmpleadoNotificacion;
import tp.backend.agencia.repositories.EmpleadoNotificacionRepository;
import tp.backend.agencia.services.interfaces.EmpleadoNotificacionService;
import tp.backend.agencia.support.EmpleadoNotificacionId;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpleadoNotificacionServiceImpl extends ServiceImpl<EmpleadoNotificacion, EmpleadoNotificacionId> implements EmpleadoNotificacionService {

    private final EmpleadoNotificacionRepository empleadoNotificacionRepository;

    @Override
    public void create(EmpleadoNotificacion entity) { this.empleadoNotificacionRepository.save(entity); }

    @Override
    public void update(EmpleadoNotificacion entity) { this.empleadoNotificacionRepository.save(entity); }

    @Override
    public EmpleadoNotificacion delete(EmpleadoNotificacionId id) {
        EmpleadoNotificacion entity = this.empleadoNotificacionRepository.findById(id).orElse(null);
        this.empleadoNotificacionRepository.delete(entity);
        return entity;
    }

    @Override
    public EmpleadoNotificacion findById(EmpleadoNotificacionId id) { return this.empleadoNotificacionRepository.findById(id).orElseThrow(); }

    @Override
    public List<EmpleadoNotificacion> findAll() { return this.empleadoNotificacionRepository.findAll(); }

    @Override
    public boolean existById(EmpleadoNotificacionId id) { return this.empleadoNotificacionRepository.existsById(id);}

}
