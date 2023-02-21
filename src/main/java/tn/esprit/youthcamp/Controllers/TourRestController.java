package tn.esprit.youthcamp.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.youthcamp.Entities.Tour;
import tn.esprit.youthcamp.Services.TourService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Tour")

public class TourRestController {

 TourService tourService;

  @GetMapping("/retrieve-all-Tours")
  public List<Tour> getTours() {
    List<Tour> listTours = tourService.retrieveAllTours();
    return listTours;
  }


  @PostMapping("/add-Tour")
  public Tour addTour (@RequestBody Tour c) {
    Tour tour = tourService.addTour(c);
    return tour;
  }

  @DeleteMapping("/remove-Tour/{Tour-id}")
  public void removeTour(@PathVariable("Tour-id") Integer eId) {

    tourService.removeTour(eId);
  }


  @PutMapping("/update-Tour")
  public Tour updateTour(@RequestBody Tour c) {
    Tour tour= tourService.updateTour(c);
    return tour;
  }
 /* @PutMapping("/affectContratToetudiant/{Tour-id}/{nomE}/{prenomE}")
  public Contrat affectContratToetudiant(@PathVariable("contrat-id") Integer contratId,
                                         @PathVariable("nomE") String nom,
                                         @PathVariable("prenomE") String prenom ) {

    return contratService.affectContratToEtudiant(contratId,nom,prenom);
  }*/
}
