package state;

public class EnEspera implements EstadoInscripción{
    @Override
    public void cambiarEstado(ContextoInscripcion contexto, ContextoInscripcion nuevoEstado) {
        System.out.println("Su inscripción está en proceso de espera");
        contexto.setEstado(new EnEspera());
    }
}
