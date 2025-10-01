package state;

public class Inscripto implements EstadoInscripción{
    @Override
    public void cambiarEstado(ContextoInscripcion contexto, ContextoInscripcion nuevoEstado) {
        System.out.println("La inscripción fue exitosa");
        contexto.setEstado(new Inscripto());
    }
}
