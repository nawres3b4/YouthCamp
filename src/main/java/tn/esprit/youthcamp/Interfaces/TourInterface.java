package tn.esprit.youthcamp.Interfaces;

import tn.esprit.youthcamp.Entities.Tour;

import java.util.List;

public interface TourInterface {
    List<Tour> retrieveAllTours();

    Tour updateTour(Tour ce);

    Tour addTour(Tour ce);

    Tour retrieveTour(Integer idTour);

    void removeTour(Integer idTour);
}
