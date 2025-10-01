package state;

public class Cancelado implements EstadoInscripción{
    @Override
    public void cambiarEstado(ContextoInscripcion contexto, ContextoInscripcion nuevoEstado) {
        System.out.println("Su inscripción ha sido cancelada");
        contexto.setEstado(new Cancelado());
    }
}
