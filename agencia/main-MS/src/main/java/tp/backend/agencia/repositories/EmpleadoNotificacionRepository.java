package tp.backend.agencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.backend.agencia.entities.EmpleadoNotificacion;
import tp.backend.agencia.support.EmpleadoNotificacionId;

public interface EmpleadoNotificacionRepository extends JpaRepository<EmpleadoNotificacion, EmpleadoNotificacionId> {
}
