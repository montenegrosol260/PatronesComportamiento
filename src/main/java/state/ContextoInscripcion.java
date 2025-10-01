package state;

public class ContextoInscripcion {
    private EstadoInscripción estado;

    public void setEstado(EstadoInscripción estado) {
        this.estado = estado;
    }

    public void cambiar(ContextoInscripcion nuevoEstado){
        estado.cambiarEstado(this, nuevoEstado);
    }
}
