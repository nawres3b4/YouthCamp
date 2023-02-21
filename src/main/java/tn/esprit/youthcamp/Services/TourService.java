package tn.esprit.youthcamp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.youthcamp.Entities.Tour;
import tn.esprit.youthcamp.Interfaces.TourInterface;
import tn.esprit.youthcamp.Repositories.TourRepository;

import java.util.List;

@Service
public class TourService implements TourInterface {
    @Autowired
    TourRepository tourRepository;

    @Override
    public List<Tour> retrieveAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Tour updateTour(Tour ce) {
        return tourRepository.save(ce);
    }

    @Override
    public Tour addTour(Tour ce) {
        return tourRepository.save(ce);
    }

    @Override
    public Tour retrieveTour(Integer idTour) {
        return tourRepository.findById(idTour).orElse(null);
    }

    @Override
    public void removeTour(Integer idTour) {
          tourRepository.deleteById(idTour);
    }

    /*@Override
    public Contrat affectContratToEtudiant(Integer idContrat, String nomE, String prenomE) {
        Contrat c = Cr.findById(idContrat).orElse(null);


        System.out.println(nomE);

        System.out.println(prenomE);
        Set<Etudiant> listE =Er.findByNomELikeAndPrenomELike(nomE,prenomE);
        System.out.println(listE);
        int contratactif = 0;
        for(Etudiant etudiant: listE) {
            Set<Contrat> ContratEtudiant =  etudiant.getContrat();
            for(Contrat cont :ContratEtudiant) {
                if (cont.getArchive() == false){

                    contratactif++;
                }
            }
            if (contratactif<5){
                c.setEtudiant(etudiant);

            }

            Cr.save(c);
        }

        return null;
    }*/
}
