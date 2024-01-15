package rendu.artifact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rendu.artifact.model.Equipe;
import rendu.artifact.model.Joueurs;

public interface EquipeInterface extends JpaRepository<Equipe, Long> {

}