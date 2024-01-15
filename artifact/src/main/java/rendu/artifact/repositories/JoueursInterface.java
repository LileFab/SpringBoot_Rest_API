package rendu.artifact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rendu.artifact.model.Joueurs;

public interface JoueursInterface extends JpaRepository<Joueurs, Long> {

}