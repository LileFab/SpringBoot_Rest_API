package rendu.artifact.controller;

import org.springframework.web.bind.annotation.*;
import rendu.artifact.exception.EquipeNotFoundException;
import rendu.artifact.exception.JoueursNotFoundException;
import rendu.artifact.model.Equipe;
import rendu.artifact.model.Joueurs;
import rendu.artifact.repositories.EquipeInterface;
import rendu.artifact.repositories.JoueursInterface;

import java.util.List;

@RestController
class EquipeController {

    private final EquipeInterface repository;

    EquipeController(EquipeInterface repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/equipes")
    List<Equipe> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/equipes")
    Equipe newJoueur(@RequestBody Equipe newEquipe) {
        return repository.save(newEquipe);
    }

    // Single item

    @GetMapping("/equipes/{id}")
    Equipe one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EquipeNotFoundException(id));
    }

    @PutMapping("/equipes/{id}")
    Equipe replaceEquipe(@RequestBody Equipe newEquipe, @PathVariable Long id) {

        return repository.findById(id)
                .map(equipe -> {
                    equipe.setNom(newEquipe.getNom());
                    equipe.setVille(newEquipe.getVille());
                    return repository.save(equipe);
                })
                .orElseGet(() -> {
                    newEquipe.setId(id);
                    return repository.save(newEquipe);
                });
    }

    @DeleteMapping("/equipes/{id}")
    void deleteEquipe(@PathVariable Long id) {
        repository.deleteById(id);
    }
}