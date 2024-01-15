package rendu.artifact.exception;

public class EquipeNotFoundException extends RuntimeException {

    public EquipeNotFoundException(Long id) {
        super("Equipe avec cet id non trouvé : " + id);
    }
}