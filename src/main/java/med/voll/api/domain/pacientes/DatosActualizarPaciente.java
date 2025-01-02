package med.voll.api.domain.pacientes;

import jakarta.validation.Valid;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizarPaciente(
        Long id,
        String nombre,
        String telefono,
        @Valid DatosDireccion direccion
) {
}
