package rendu.artifact.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rendu.artifact.model.Equipe;
import rendu.artifact.model.Joueurs;
import rendu.artifact.repositories.EquipeInterface;
import rendu.artifact.repositories.JoueursInterface;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabaseJoueurs(JoueursInterface repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Joueurs("Bilbo", "Baggins", 34)));
            log.info("Preloading " + repository.save(new Joueurs("Frodo", "Baggins", 53)));
        };
    }

    @Bean
    CommandLineRunner initDatabaseEquipe(EquipeInterface repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Equipe("ParisFC", "Paris")));
            log.info("Preloading " + repository.save(new Equipe("MargeFC", "Springfield")));
        };
    }
}