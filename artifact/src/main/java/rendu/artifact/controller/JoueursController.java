package rendu.artifact.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rendu.artifact.repositories.JoueursInterface;
import rendu.artifact.exception.JoueursNotFoundException;
import rendu.artifact.model.Joueurs;

@RestController
class JoueursController {

    private final JoueursInterface repository;

    JoueursController(JoueursInterface repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/joueurs")
    List<Joueurs> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/joueurs")
    Joueurs newEmployee(@RequestBody Joueurs newJoueur) {
        return repository.save(newJoueur);
    }

    // Single item

    @GetMapping("/joueurs/{id}")
    Joueurs one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new JoueursNotFoundException(id));
    }

    @PutMapping("/joueurs/{id}")
    Joueurs replaceJoueur(@RequestBody Joueurs newJoueur, @PathVariable Long id) {

        return repository.findById(id)
                .map(joueur -> {
                    joueur.setNom(newJoueur.getNom());
                    joueur.setPrenom(newJoueur.getPrenom());
                    joueur.setAge(newJoueur.getAge());
                    return repository.save(joueur);
                })
                .orElseGet(() -> {
                    newJoueur.setId(id);
                    return repository.save(newJoueur);
                });
    }

    @DeleteMapping("/joueurs/{id}")
    void deleteJoueur(@PathVariable Long id) {
        repository.deleteById(id);
    }
}