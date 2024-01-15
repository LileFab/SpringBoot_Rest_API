package rendu.artifact.exception;

public class JoueursNotFoundException extends RuntimeException {

    public JoueursNotFoundException(Long id) {
        super("Joueur avec cet id non trouvé : " + id);
    }
}